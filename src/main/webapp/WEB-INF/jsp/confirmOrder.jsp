<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirm order</title>
</head>
<body>
	<c:forEach var="cart" items="${cartlist}">
		<c:out value="商品"/><br>
		<c:out value="${cart.getProduct()}"/><br>
		<c:out value="数量"/><br>
		<c:out value="${cart.getAmount()}"/><br>
	</c:forEach>

	<c:forEach var="total" items="${totalinfo}">
		<c:out value="消費税"/><br>
		<c:out value="${total[0]}"/><br>
		<c:out value="合計金額"/><br>
		<c:out value="${total[1]}"/><br>
	</c:forEach>
</body>
</html>