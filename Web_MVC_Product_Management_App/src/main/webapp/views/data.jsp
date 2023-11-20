<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>Products Details</h2>
	<hr/>
	<table>
		<thead>
			<th>S.No</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
			<tr>
				<td>${index.count}</td>
				<td>${product.pName}</td>
				<td>${product.pPrice}</td>
				<td>${product.qty}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>	

</body>
</html>