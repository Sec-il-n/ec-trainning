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
		<!--<c:out value="${re.category1}"/><br>  この値をparameterに入れる-->
		<c:out value="${re.price}"/><br>
<!-- パラメタにはidにして、つどId でDB検索する -->
		<form action="/ec-trainning/ShowEachProduct?id=${re.id}" method="post" name="serchform">
		<!--<form action="/ec-trainning/IntoCartServlet?product=${re.product}&category=${re.category1}&price=${re.price}" method="post" name="serchform">  -->
			<!-- ここを選択ボタン -->
		<button type="submit">商品を見る</button><br>
		<!--  <input type="checkbox" name="selected" value="selected">--></form>
		<!---->
	</c:forEach>


	<!-- <a href="/ec-trainning/IntoCartServlet"><c:out value="カートに入れる"/></a> -->
</body>
</html>