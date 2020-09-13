<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body
{
	background-color: grey;
}
.heading
{
	color: white;
}
.navbar
{
	padding:10px;
	background-color: blue;
	border-radius: 10px;
}
.navbar a
{
	padding: 20px;
	text-decoration: none;
	color: white;
}
</style>
<body>
<div align = "center" class = "heading">
	<h1>Operations on Student</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
</div>
<br><br>
<div align = "center">
<form action = "AddStudentPage.jsp">
	<input type = "submit" value = "Add Student" name = "StudentName" style = "padding:20px;font-size:25px"><br><br>
</form>

<form action = "UpdateStudent.jsp">
	<input type = "submit" value = "Update Student" name = "UpdateStudent" style = "padding:20px;font-size:25px"><br><br>
</form>

<form action = "DeleteStudent.jsp">
	<input type = "submit" value = "Delete Student" name = "Delete Student" style = "padding:20px;font-size:25px"><br><br>
</form>
</div>

</body>
</html>