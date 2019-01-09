<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>View success</h2>
	<table border="2" width="70%" cellpadding="2"> 
	<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Gender</th><th>Mailing Address</th><th>City</th>
	<th>State</th><th>Zip code</th></tr>
	<c:forEach var="stu" items="${list}">
	<tr>
	<td>${stu.ID}</td>
	<td>${stu.fname}</td>
	<td>${stu.lname}</td>
	<td>${stu.gender}</td>
	<td>${stu.maddress}</td>
	<td>${stu.city}</td>
	<td>${stu.state}</td>
	<td>${stu.zipcode}</td>
	<td><a href="/update">Update</a></td>
	<td><a href="/Example1/delete/${stu.ID}">Delete</a></td>
	</tr>
	</c:forEach> 
	</table> 
	<br>
	<a href="/Example1/welcome">Back</a>
</body>
</html>