<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form method="post" action="param" name="frm">
		<label for=id>아이디 : </label>
		<input type="text" name="id" id="id"><br /><br />
		
		<label for=age>나이 : </label>
		<input type="text" name="age" id=age><br /><br />
		
		비밀번호 : <input type="password" name="password"><br /><br />
		
		<label for=content>내용 : </label>
		<textarea rows="3" cols="20" id="content" name="content"></textarea><br /><br />
		
		
		<label for=gender>성별 : </label>
		남자 <input type="radio" id="gender" name="gender" value="남자" checked>
		여자 <input type="radio" id="gender" name="gender" value="여지"><br /><br />
		
		<label for=checkEmail>이메일수신 : </label>
		동의 <input type="radio" id="checkEmail" name="checkEmail" value="yes" checked>
		거부 <input type="radio" id="checkEmail" name="checkEmail" value="no"><br /><br />
		
		<label for=item>관심있는 악세서리 : </label><br /><br />
		신발 <input type="checkbox" name="item" value="신발">
		가방 <input type="checkbox" name="item" value="가방">
		벨트 <input type="checkbox" name="item" value="벨트"><br /><br />
		모자 <input type="checkbox" name="item" value="모자">
		시계 <input type="checkbox" name="item" value="시계">
		쥬얼리 <input type="checkbox" name="item" value="쥬얼리"><br /><br />
		
		<span style="float:left; margin-right:20px;">
			<label for=job>직업</label>
			<select id="job" name="job" size="1">
				<option value="">선택하세요</option>
				<option value="학생">학생</option>
				<option value="선생님">선생님</option>
				<option value="배우">배우</option>
				<option value="목사">목사</option>
				<option value="의사">의사</option>
			</select>
		</span><br /><br />
		
		
		
		
		<input type="submit" value="전송" onclick="return check()"><br />
		
		
	</form>
</body>
</html>