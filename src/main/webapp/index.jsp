<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>通販サイト○○</title>
</head>
<body>
	<form action="/SerchServlet" method="post" name="serchform">
	<label for="keyword">キーワード検索</label>
	<input type="text" name="keyword">
	<button type="submit">検索</button><br></form>
</body>
</html>