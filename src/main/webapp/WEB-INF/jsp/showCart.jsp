<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cart</title>
</head>
<body>
	<c:forEach var="cart" items="${cartlist}">
		<c:out value="商品"/><br>
		<c:out value="${cart.getProduct()}"/><br>
		<c:out value="小計"/><br>
		<c:out value="${cart.getSubTotal()}"/><br>
		<c:out value="数量"/><br>
		<c:out value="${cart.getAmount()}"/><br>
		<c:out value="消費税"/><br>
		<c:out value="${cart.getTax()}"/><br>
		<c:out value="合計金額"/><br>
		<c:out value="${cart.getTotalPrice()}"/><br><br>

	</c:forEach>
	<a class="cart" href="/ec-trainning/ReturnSerched?show=continue"><c:out value="ショッピングを続ける"/></a>
	<a class="cart" href="/ec-trainning/ConfirmOrder">&nbsp; &nbsp;<c:out value="注文に進む"/></a>

</body>
</html>