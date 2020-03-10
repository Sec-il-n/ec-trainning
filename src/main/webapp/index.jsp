<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>通販サイト○○</title>
</head>
<body>
	<c:if test="${not empty msg}">
		<c:out value="${msg}"/></c:if>

	<form action="/ec-trainning/SerchServlet" method="post" name="serchform">
	<label for="inputword">キーワード検索</label>
	<input type="text" name="inputword">
	<button type="submit">検索</button><br></form>
</body>
</html>