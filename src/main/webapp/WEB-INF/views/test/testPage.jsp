<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MBTI 테스트</title>
</head>
<body>
<table>
	<!-- c:foreach 로 4개씩 띄워서 돌리고 문항 별로 id 부여해서 차례대로 불러오자 -->
	<tr>
		<th colspan="9">1. 예시 문제입니다</th>
	</tr>
	<tr class="answer">
		<td>그렇다</td>
		<td class="s0"><input type="radio" name="score" value="0"></td>
		<td class="s1"><input type="radio" name="score" value="1"></td>
		<td class="s2"><input type="radio" name="score" value="2"></td>
		<td class="s3"><input type="radio" name="score" value="3"></td>
		<td class="s4"><input type="radio" name="score" value="4"></td>
		<td class="s5"><input type="radio" name="score" value="5"></td>
		<td class="s6"><input type="radio" name="score" value="6"></td>
		<td>아니다</td>
	</tr>
</table>
</body>
</html>