<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<form name="frm" method="post" action="MemberServlet">
		<table>
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
			<c:forEach var="member" items="${memberList}">
				<tr class="record">
					<td>${member.custno}</td>
					<td>${member.custname}</td>
					<td>${member.phone}</td>
					<td>${member.address}</td>
					<td>${member.date}</td>
					<td>${member.grade}</td>
					<td>${member.city}</td>
					
				</tr>
			</c:forEach>
		</table>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>