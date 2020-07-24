<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f" %>
<html lang="ko">
<head>
<link rel="stylesheet" href="../resources/CSS/home.css">
	<title>메인페이지</title>
	<script src="../resources/JS/home.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

<div id="content">

	<table class="main">
	
			<tr>
				<td class="test t1">테스트 1</td>
				<td class="test t2">테스트 2</td>
				<td class="test t3">테스트 3</td>
			</tr>
			
	</table>
	
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp"%>

</body>
</html>
