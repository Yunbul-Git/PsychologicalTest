<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이용후기 게시판</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="4"></td>
			<td class="write">이용후기 작성</td>
		</tr>
		<tr class="topcol">
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>		
				<td>1</td>
				<td><c:out value="${list.pt_rtitle}"></c:out></td>
				<td>작성자입니다</td>
				<td><c:out value="${list.pt_rdate}"></c:out></td>
				<td><c:out value="${list.pt_rviewcnt}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<c:if test="${pageMaker.prev}">
		</c:if>
			<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="pageNum">
					<li></li>
			</c:forEach>
		<c:if test="${pageMaker.next}">
		</c:if>
	</div>
</body>
</html>