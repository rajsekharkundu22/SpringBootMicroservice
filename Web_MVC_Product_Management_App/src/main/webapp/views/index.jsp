<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>Product Management</h2>
	<hr/>
	
	<form:form action="product" modelAttribute="p" method = "POST">
		<table>
			<tr>
				<td>Product Name : </td>
				<td><form:input path="pName"/></td>
			</tr>
			
			<tr>
				<td>Product Price : </td>
				<td><form:input path="pPrice"/></td>
			</tr>
			
			<tr>
				<td>Product Quantity : </td>
				<td><form:input path="qty"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Save"</td>
			</tr>
		</table>
		
	
	</form:form> 
	
	<hr/>
	<p>
	${msg}
	</p>
	<hr/>
	<a href="products">View Products</a>
	
</body>
</html>