<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>details</title>
</head>
<body>
	<c:if test="${not empty empamountmsg}">
		<c:out value="${empamountmsg}"/></c:if><br>

	<c:forEach var="de" items="${details}">
		<c:out value="${de.product}"/><br>
		<c:out value="${de.price}"/><br>
		<!--  <form action="/ec-trainning/IntoCartServlet?id=${de.id}&product=${de.product}&price=${de.price}" method="post" name="serchform">-->
		<form action="/ec-trainning/IntoCartServlet?id=${de.id}&price=${de.price}" method="post" name="serchform">
		<label for="into-cart">数量</label>
		<input type="text" name="amount" size="4" maxlength="3">

		<button type="submit">カートにいれる</button></form>
	</c:forEach>
	<a class="cart" href="/ec-trainning/ShowCart"><c:out value="カート"/></a>
</body>
</html>