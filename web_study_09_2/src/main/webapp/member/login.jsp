<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript" src="./script/member.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>로그인</h2>
	<form action="login.do" method="post" name="frm">
		<div class="form-group">
			<label for="userid">아이디 :</label>
	  		<input type="text" class="form-control" placeholder="Enter userid" id="userid" name="userid">
		</div>
		<div class="form-group">
		  	<label for="pwd">비밀번호 :</label>
	  		<input type="password" class="form-control" placeholder="Enter password" id="pwd" name="pwd">
		</div>
		<button type="submit" class="btn btn-primary" onclick="return loginCheck()">로그인</button>&nbsp;&nbsp;
		<button type="reset" class="btn btn-secondary">취소</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-success" onclick="location.href='join.do'">회원가입</button>
		<h3>${message}</h3>
	</form>
</div>


</body>
</html>