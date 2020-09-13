
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
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
	<a href = "HROperations.jsp">Dashboard</a>
</div>
<br><br>
 <div align = "center">
<div style = "border:2px solid white;padding:15px;width:500px">
<%
	request.getAttribute("hrData");
%>
	<form action = "HRUpdation" method = "get">
		Enter the Employee ID : <input type = "number" name = "id" value = "${hrData.getEmployee_id()}" disabled="disabled"><br><br>
		Enter the First Name : <input type = "text" name = "first_name" value = "${hrData.getFirst_Name()}" disabled="disabled"><br><br>
		Enter the last name : <input type = "text" name = "last_name" value = "${hrData.getLast_Name()}" disabled="disabled"><br><br>
		Enter the designation : <input type = "text" name = "designation" value = "${hrData.getDesignation()}" disabled="disabled"><br><br>
		Enter the Experience : <input type = "text" name = "exp"><br><br>
		
		<input type = "submit" value = "ADD">
	</form>
</div>
</div>

</body>
</html>