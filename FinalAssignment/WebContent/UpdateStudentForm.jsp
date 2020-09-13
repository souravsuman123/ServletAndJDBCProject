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
	<h1>Operations on Student</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
	<a href = "AdminDashboard.jsp">Dashboard</a>
</div>
<br><br>
<div align = "center">
<div style = "border:2px solid white;padding:15px;width:500px">
<%
request.getAttribute("studentData");
%>

<form action = "StudentUpdation" method = "get">
	Student ID: <input type= "number" name = "id" value = "${studentData.getStudent_id()}" disabled="disabled"><br><br>
	First Name: <input type = "text" name = "fname" value = "${studentData.getFirst_name()}" disabled="disabled"><br><br>
	Second Name: <input type = "text" name = "mname" value = "${studentData.getMiddle_name()}" disabled="disabled"><br><br>
	Last Name: <input type = "text" name = "lname" value = "${studentData.getLast_name()}" disabled="disabled"><br><br>
	YOP degree: <input type = "number" name = "yopDegree" required><br><br>
	YOP masters: <input type = "number" name = "yopMasters" value = "${studentData.getYop_masters() }" disabled="disabled"><br><br>
	Marks tenth: <input type = "number" name = "tenthMarks" value = "${studentData.getMarks_tenth()}" disabled="disabled"><br><br>
	Marks twelth: <input type = "number" name = "twelthMarks" value = "${studentData.getMarks_twelth()}" disabled="disabled"><br><br>
	Marks Degree: <input type = "number" name = "degreeMarks" value = "${studentData.getMarks_degree()}" disabled="disabled"><br><br>
	Marks Masters: <input type  = "number" name = "mastersMarks" value = "${studentData.getMarks_masters()}" disabled="disabled"><br><br>
	
	<input type = "submit" name = "submit" value= "Update Status" style = "border-radius:5px;background-color:green;color:white;padding:10px" ><br><br>
</form>
</div>
	
</div>

</body>
</html>