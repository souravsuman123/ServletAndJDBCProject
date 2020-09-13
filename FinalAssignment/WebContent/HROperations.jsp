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
	<h1>Operations on HR</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
</div>
<br><br>

<div align = "center">
	<form action = "AddHR.jsp"  method = "get">
		<input type = "submit" name = "addhr" value = "ADD HR" style = "padding:20px;font-size:25px"><br><br>
	</form>
	<form action = "GetHRID.jsp" method = "get">
		<input type = "submit" name = "updatehr" value = "Update HR" style = "padding:20px;font-size:25px"><br><br>
	</form>
	<form action = "DeleteHR.jsp" method = "get">
		<input type = "submit" name = "deletehr" value = "Delete HR" style = "padding:20px;font-size:25px"><br><br>
	</form>
</div>

</body>
</html>