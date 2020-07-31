<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../resources/CSS/login.css">
<!-- 
<script src=""></script>
 -->
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<div id="login">
	<div class="loginTitle">진행하시려면 로그인하셔야 합니다.</div>
	<form action="login" method="post">
		<div><input type="text" placeholder="아이디를 입력하세요" name="pt_id"></div>
		<div><input type="password" placeholder="비밀번호를 입력하세요" name="pt_pass"></div>
		<button type="submit">로그인</button><button type="button" id="register">회원가입</button>
	</form>
</div>
</body>
</html>