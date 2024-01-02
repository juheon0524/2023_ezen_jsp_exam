<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript" src="./script/member.js"></script>
<title>Insert title here</title>
<link href="member/reset.css" rel="stylesheet" type="text/css">
<link href="member/table.css" rel="stylesheet" type="text/css">
</head>
<body>
	<nav>
		<ul>
			<li></li>	
			<li></li>	
			<li>로그인</li>	
			<li>사원등록<br />
			<span>(관리자로 로그인후 사용 가능)</span>
			</li>	
			<li>마이페이지<br />
			<span>(로그인 후 사용 가능)</span>
			</li>	
		</ul>
	</nav>
	<form action ="login.do" method="post" name="frm">
		<div class="tableWrap">
			<table>
				<tr>
					<td colspan="2">로그인</td>
				</tr>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" id="id" name="id"  placeholder="아이디를 입력하세요.">
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" id="pass" name="pass"  placeholder="비밀번호를 입력하세요.">
					</td>
				</tr>
				<tr>
					<td>레벨</td>
					<td>
					<label for="level">일반회원 : </label>
					<input type="radio" value="일반회원" name="level" checked>
					<label for="level">관리자 : </label>
					<input type="radio" value="관리자" name="level">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit" onclick="return loginCheck()">로그인</button>&nbsp;&nbsp;
						<button type="reset" >취소</button>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>