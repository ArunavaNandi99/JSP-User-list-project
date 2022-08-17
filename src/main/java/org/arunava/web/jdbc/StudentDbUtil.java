package org.arunava.web.jdbc;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	private DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {

		dataSource = theDataSource;
	}

	public List<Student> getStudentes() throws Exception {

		List<Student> students = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rSet = null;

		try {

			con = dataSource.getConnection();
			String sql = "select * from student order by last_name";
			stmt = con.createStatement();
			rSet = stmt.executeQuery(sql);

			while (rSet.next()) {

				int id = rSet.getInt("id");
				String firstName = rSet.getString("first_name");
				String lastName = rSet.getString("last_name");
				String email = rSet.getString("email");

				Student tempStudent = new Student(id, firstName, lastName, email);

				students.add(tempStudent);

			}

			return students;
		} finally {
			close(con, stmt, rSet);

		}

	}

	private void close(Connection con, Statement stmt, ResultSet rSet) {
		try {
			if (rSet != null) {
				rSet.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void addStudent(Student theStudent) throws Exception {

		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = dataSource.getConnection();
			String sql = "insert into student " + " (first_name,last_name,email)" + "values(?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, theStudent.getFirstName());
			stmt.setString(2, theStudent.getLastName());
			stmt.setString(3, theStudent.getEmail());

			stmt.execute();

		} finally {
			close(con, stmt, null);

		}

	}

}
