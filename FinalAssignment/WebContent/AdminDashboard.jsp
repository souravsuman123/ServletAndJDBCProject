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
	<h1>Welcome to Jspider</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
</div>
<br><br>
<div align = "center">
	<form action = "AddStudent.jsp">
		<input type = "submit" name = "Add Student" value = "Enter as Student" style = "padding:20px;font-size:25px"><br><br>
		
	</form>
	
	<form action = "HROperations.jsp">
		<input type = "submit" name = "Add HR" value = "Enter as HR" style = "padding:20px;font-size:25px"><br><br>
		
	</form>
	
	<form action = "InterviewInfo.jsp">
		<input type = "submit" name = "Add requirements info" value = "Add requirements info" style = "padding:20px;font-size:25px"><br><br>
	</form>
</div>

</body>
</html>