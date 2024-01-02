<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="method" method="get">
		<input type="text" name="id">
		<input type="text" name="age">
		<input type="submit" value="get방식으로 호출하기">
	</form>
	
	<form action="method" method="post">
		<input type="submit" value="post방식으로 호출하기">
	</form>
</body>
</html>