
<!DOCTYPE html>
<%@page import="java.io.PrintWriter"%>
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
footer span
{
	position:relative;
	text-align: right;
}
</style>
<body>

<div align = "center" class = "heading">
	<h1>Welcome to JSPIDER</h1>
</div>
<div class = "navbar">
	<a href = "#" >About</a>
	<a href = "#">Careers</a>
</div>
<br><br>
<div align = "center">
	<form action = "loginfinding" method = "get" style="border:2px solid black; background-color: yellow;padding:10px;width: 200px;border-radius: 10px">
		<input type = "text" name = "username" placeholder = "Enter Username" style = "padding: 10px" required><br><br>
		<input type = "password" name = "password" placeholder = "Enter passowrd" style = "padding: 10px" required><br><br>
		<h4>SignIn as</h4>
		Admin  : <input type = "radio" name = "Admin"><br><br>
		HR     :<input type = "radio" name = "HR"><br><br>
		Student:<input type = "radio" name = "Student"><br><br>
		
		<input type = "submit" name = "SignIn" value = "SignIn"><br><br>
		<h5>Forget Password ? <a href = "/#" style = "color:blue">Click here</a></h5>
	</form>
	
	
</div>

</body>
</html>