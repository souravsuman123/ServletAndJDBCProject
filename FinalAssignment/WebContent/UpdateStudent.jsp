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
	<h1>Operation on Student</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
	<a href = "AdminDashboard.jsp">Dashboard</a>
</div>

<br><br>
<br><br>
<br><br>
<div align = "center">
	<form action = "UpdateStudent">
		Student ID : <input type = "number" name = "id"><br><br>
		<input type = "submit" value = "Check Student" name = "submit">
	</form>
</div>

</body>
</html>