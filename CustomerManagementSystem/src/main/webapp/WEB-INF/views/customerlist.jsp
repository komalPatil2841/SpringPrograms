<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List</title>
</head>
<body>
	<h2>Order Details</h2>
	<h2>${Customers.customers}</h2>
	 <div align="center">

	<table bcuster="1" cellpadding = "5">
		<caption><h2>List of Order</h2></caption>
		<tr>
			<th>CustomerId </th>
			<th>CustomerName  </th>
			<th>CustomerMob  </th>
			<th>CustomerEmail  </th>

		</tr> 
		<c:forEach items = "${Customers.customers}" var="cust" >
		
		 
		 <tr>
			<td><c:out value= "${cust.custId}" /></td>
			<td><c:out value= "${cust.custName}" /></td>
			<td><c:out value= "${cust.custMob}" /> </td>
			<td><c:out value= "${cust.custEmail}" /> </td>
		</tr> 
		</c:forEach>
<!-- 	</table> -->
		
</div>
</body>
</html>