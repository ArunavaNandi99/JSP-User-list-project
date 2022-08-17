package org.arunava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] students = {"arunava","roni","deep"};
		request.setAttribute("student_list", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_students.jsp");
		
		dispatcher.forward(request, response);
	}


}
