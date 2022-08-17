<%@page import="org.arunava.web.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student tracker</title>
</head>
<body>
	<div id="wrapper">
		<div id="header"></div>
		<h2>Students List</h2>
	</div>
	<div id="container">
		<div id="content">
			<input type="button" value="Add Student"
				onclick="window.location.href ='add-student-form.jsp'; return false ;"
				class="add-student-button" />
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
					<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>