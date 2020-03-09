<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<c:forEach var="cart" items="${cartlist}">
	<%--<%session.getAttribute("cartlist");%> --%>
		<c:out value="${cart.getProduct()}"/>
	</c:forEach>
</body>
</html>