<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</head>

<body>
<div align = "center" class = "heading">
	<h1>Interview Information</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
	<a href = "AdminDashboard.jsp">Dashboard</a>
</div>
<br><br>
<div align = "center">
	<form action = "AddRequirement" method = "post">
		Requirement ID: <input type = "number" name = "id">&nbsp;&nbsp;&nbsp;Company Name: <input type = "text" name = "companyName">&nbsp;&nbsp;&nbsp;Employement type: <input type = "text" name = "Etype"><br><br>
		Job title: <input type = "text" name = "title">&nbsp;&nbsp;&nbsp;Designation: <input type = "text" name = "designation">&nbsp;&nbsp;&nbsp;Location: <input type = "text" name = "location"><br><br>
		Skills: <input type = "text" name = "skills">&nbsp;&nbsp;&nbsp;SalaryPackage: <input type = "number" name = "package">&nbsp;&nbsp;&nbsp;Bond period: <input type = "number" name = "period"><br><br>
		&nbsp;&nbsp;&nbsp;10th %age: <input type = "number" name = "tenthMarks">&nbsp;&nbsp;&nbsp;12th %age: <input type = "number" name = "twelthMarks"><br><br>
		&nbsp;&nbsp;&nbsp;Degree %age: <input type = "number" name = "degreeMarks">&nbsp;&nbsp;&nbsp;Masters %age : <input type = "number" name = "mastersMarks"><br><br>
		<div align = "center" style = "border:2px solid white;padding:10px">
			<div align = "center">
				Branch Allowed
			</div>
			Circuit Branches : <input type = "radio" name = "branch" value = "ece_eee"> &nbsp;&nbsp;&nbsp; MCA : <input type = "radio" name = "branch" value = "MCA"><br><br>
			Mech/Civil : <input type = "radio" name = "branch" value = "Mech_Civil">&nbsp;&nbsp;&nbsp;M.tech : <input type = "radio" name = "branch" value = "Mtech"><br><br>
			Any : <input type = "radio" name = "branch" value = "All">&nbsp;&nbsp;&nbsp;Bsc/BCA : <input type = "radio" name = "branch" value = "Bsc/BCA"><br><br>
		</div>
		<input type = "submit" name = "submit" value = "Add Requirement" >
	</form>
</div>

</body>
</html>