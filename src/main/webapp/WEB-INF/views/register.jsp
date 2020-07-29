<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<form action="register" method="post">
		<div><input type="text" placeholder="아이디를 입력해주세요."/></div>
		<div><input type="text" placeholder="비밀번호를 입력해주세요."/></div>
		<div><input type="radio" name="gender" value=0/>남<input type="radio" name="gender" value=1/>여</div>
		<div><input type="text" placeholder="생년월일을 입력해주세요(ex 19920321)"/></div>
		<button>회원가입</button>
	</form>
</body>
</html>