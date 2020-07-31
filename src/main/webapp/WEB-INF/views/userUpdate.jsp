<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
	<h3>회원정보수정페이지 입니다</h3>
	<form action="userUpdate" method="post">
		<div><input type="text" name="pt_id" placeholder="아이디는 변경할 수 없습니다." readonly="readonly"></div>
		<div><input type="password" name="pt_pass" placeholder="변경하실 비밀번호를 입력해주세요."></div>
		<div><input type="radio" name="pt_gender" value=0>남<input type="radio" name="pt_gender" value=1>여</div>
		<div><input type="number" name="pt_year" placeholder="출생년도를 입력해주세요(ex 1992)"><input type="number" name="pt_mon" placeholder="출생월을 입력해주세요"><input type="number" name="pt_day" placeholder="출생일을 입력해주세요"></div>
		<button type="submit">회원가입</button>
	</form>
</body>
</html>