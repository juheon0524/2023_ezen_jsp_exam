<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h2>상품 수정 - 관리자 페이지</h2>
		<form action="movieUpdate.do" method="post" enctype="multipart/form-data" name="frm">
			<input type="hidden" name="code" value=${movie.code}>
			<input type="hidden" name="nomakeImg" value=${movie.poster}>
			
			<c:choose>
				<c:when test="${empty movie.poster }">
					<img src="upload/noimage.gif" width="600px" height="400px">
				</c:when>
				<c:otherwise>
					<img src="upload/${movie.poster}" width="600px" height="400px">
				</c:otherwise>
			</c:choose>
			
			<div class="form-group">
				<label for="title">제목 :</label> <input type="text"
					class="form-control" id="title" name="title" value="${movie.title}">
			</div>
			<div class="form-group">
				<label for="price">가격 :</label> <input type="text"
					class="form-control" id="price" name="price" value="${movie.price}">
			</div>
			<div class="form-group">
				<label for="director">감독 :</label> <input type="text"
					class="form-control" id="director" name="director" value="${movie.director}">
			</div>
			<div class="form-group">
				<label for="actor">배우 :</label> <input type="text"
					class="form-control" id="actor" name="actor" value="${movie.actor}">
			</div>
			<div class="form-group">
				<label for="synopsis">설명 :</label> 
				<textarea rows="10" cols="80" id="synopsis" name="synopsis" >${movie.synopsis}</textarea>
			</div>
			<div class="form-group">
				사진 : 
				<input type="file" id="poster" name="poster"><br/>
					(주의사항 : 이미지를 변경하고자 할떄만 선택하세요!)
			</div>
			
			
			
			<button type="submit" class="btn btn-success">수정</button>&nbsp;&nbsp;
			<button type="reset" class="btn btn-danger">다시작성</button>&nbsp;&nbsp;
			<button type="button" class="btn btn-primary" onclick="location.href='movieList.do'">목록</button>
		</form>
	</div>
</body>
</html>