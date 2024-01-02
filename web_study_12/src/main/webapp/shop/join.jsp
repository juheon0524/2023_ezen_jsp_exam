<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../css/reset.css" rel="stylesheet" type="text/css">
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/join.css" rel="stylesheet" type="text/css">
<link href="../css/footer.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../script/member.js"></script>
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="header.jsp"></jsp:include>
 <div class="joinContent">
 	<form name="frm" method="post" action="MemberServlet">
 	<table>
 		<tr>
 			<th colspan="5" class="tableTitle">홈쇼핑 회원 등록</th>
 		</tr>
 		<tr>
 			<th>회원번호(자동발생)</th>
 			<td colspan="4"><input type="text"></td>
 		</tr>
 		<tr>
 			<th>회원성명</th>
 			<td><input type="text"></td>
 		</tr>
 		<tr>
 			<th>회원전화</th>
 			<td><input type="text"></td>
 		</tr>
 		<tr>
 			<th>회원주소</th>
 			<td><input type="text"></td>
 		</tr>
 		<tr>
 			<th>가입일자</th>
 			<td><input type="text"></td>
 		</tr>
 		<tr>
 			<th>고객등급<br/>(A:VIP, B:일반, C:직원)</th>
 			<td><input type="text" class="tableInput"></td>
 		</tr>
 		<tr>
 			<th>도시코드</th>
 			<td><input type="text"></td>
 		</tr>
 		<tr>
 			<th colspan="5">
 				<input type="submit" value="등록" onclick="return memberCheck()" >
 				<input type="button" value="목록" onclick="location.href='/MemberServlet?command=member_list'">
 			</th>
 		</tr>
 	</table>
 	</form>
 </div>
 <jsp:include page="footer.jsp"></jsp:include>
 </body>
</html>
