<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../css/reset.css" rel="stylesheet" type="text/css">
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/main.css" rel="stylesheet" type="text/css">
<link href="../css/footer.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="mainWrap">
	<div class="mainContent">
		<h1>쇼핑몰 회원관리 프로그램</h1>
		<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.
		<br/>프로그램 작성 순서</p>
		<ol>
			<li>회원정보 테이블을 생성한다.</li>
			<li>매출정보 테이블을 생성한다.</li>
			<li>회원정보, 매출정보, 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</li>
			<li>회원정보 입력 화면 프로그램을 작성한다.</li>
			<li>회원정보 조회 프로그램을 작성한다.</li>
			<li>회원매출 정보 프로그램을 작성한다.</li>
		</ol>
	</div>
</div>	
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>