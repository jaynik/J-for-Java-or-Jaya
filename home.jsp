<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
header{
	display:block;
	background-color:grey;
}
footer{
	display:block;
	align:center;
}
h1
{
	text-align:center;
}

</style>
</head>
<body>
<script type="text/javascript">
function validateForm()
{
	
}
	document.getElementByID("fn")
</script>
<form method="POST" action="/Example1/home">
<header>
	<h1>Event Registration form</h1>
</header>
<section>
	<table align="center">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" id="fn" size="45%" required></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" size="45%"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="radio" name="gender" value="male"> Male<br>
				<input type="radio" name="gender" value="female"> Female<br></td>
		</tr>
		<tr>
			<td>Mailing Address</td>
			<td><input type="text" name="maddress" size="45%"></td>
		</tr>
		<tr>
			<td>City</td>
			<td><input type="text" name="city" size="45%"></td>
		</tr>
		<tr>
			<td>State</td>
			<td><input type="text" name="state" size="45%"></td>
		</tr>
		<tr>
			<td>Zip Code </td>
			<td><input type="text" name="zipcode" size="45%"></td>
		</tr>
	</table>
</section>
<footer>
	<input type="submit" size="75%" value="submit">
	<input type="button" onclick="location.href='view'" value="view">
</footer>
</form>
</body>
</html>