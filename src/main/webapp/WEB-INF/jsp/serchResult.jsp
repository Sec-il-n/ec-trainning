<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Serch Result</title>
</head>
<body>
	<c:forEach var="re" items="${result}">
		<c:out value="${re.product}"/><br>
		<c:out value="${re.price}"/><br>
	</c:forEach>

	<a href="/ec-trainning/IntoCartServlet"><c:out value="カートに入れる"/></a>
</body>
</html>