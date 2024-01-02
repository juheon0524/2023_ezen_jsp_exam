<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>메인페이지</h2>
	
	<form action="logout.do" method="post" name="frm">
		안녕하세요 ${loginUser.name}${loginUser.userid}님<br /><br />
		<button type="submit" class="btn btn-primary">로그아웃</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-secondary" 
		onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'">
		회원정보변경</button>&nbsp;&nbsp;
	</form>
</div>
</body>
</html>