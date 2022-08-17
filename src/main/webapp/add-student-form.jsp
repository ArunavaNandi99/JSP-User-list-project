<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<div id="wrapper">
		<div id="header"></div>
		<h2>Student TABLE</h2>
	</div>
	<div id="container">
		<h3>ADD STUDENT</h3>
		<form action="StudentController" method="GET">
			<input type="hidden" name="command" value="ADD" />

			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="firstName" />
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><input type="text" name="lastname" />
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><input type="email" name="email" />
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="save" class="save" />
					</tr>
				</tbody>
			</table>
		</form>
		<div style="clear: both;"></div>
		<p>
		<a href="StudentController">Back To List</a>		
		</p>
	</div>
</body>
</html>