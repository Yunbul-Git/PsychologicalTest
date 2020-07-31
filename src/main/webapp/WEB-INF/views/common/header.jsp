<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<link rel="stylesheet" href="../resources/CSS/header.css">
<meta charset="UTF-8">
<title>Header</title>
</head>
<body>
<table id="header">
	<tr class="menu">
		<th class="title">Psychological Test</th>
		<th class="blank"></th>
		<c:if test="${auth == 3}"><th class="submenu m1">관리자 페이지</th></c:if>
		<c:if test="${auth != 3}"><th class="blank"></th></c:if>
		<th class="submenu m2">이용후기</th>
		<c:if test="${user == null}"><th class="submenu m3">회원가입</th></c:if>
		<c:if test="${user != null}"><th class="submenu m4">회원정보수정</th></c:if>
		<c:if test="${user == null}"><th class="submenu m5">로그인</th></c:if>
		<c:if test="${user != null}"><th class="submenu m6">로그아웃</th></c:if>
	</tr>
	<tr>
	</tr>
	<tr>
		<th></th>
	</tr>
</table>
</body>
</html>