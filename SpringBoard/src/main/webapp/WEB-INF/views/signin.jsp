<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원가입 페이지</h1>
<form action="signok" method="post">
	<table id="edit">
		<tr><td>아이디:</td><td><input type="text" name="userid"/></td></tr>
		<tr><td>이름:</td><td><input type="text" name="username"/></td></tr>
		<tr><td>비밀번호:</td><td><input type="text" name="password"/></td></tr>
		<tr><td>성별:</td><td>
			여자<input type="radio" id="Woman" name="gender" value="woman">
			남자<input type="radio" id="Man" name="gender" value="man">
		</td></tr>
		<tr><td>이메일:</td><td><input type="text" name="email"/></td></tr>
		<tr><td>블로그URL:</td><td><input type="text" name="blogurl"/></td></tr>
		<tr><td>자기소개:</td><td><textarea cols="50" rows="5" name="detail"></textarea></td></tr>
	</table>
	<button type="submit">회원등록하기</button>
	<button type="reset">리셋하기</button>
	<button type="button" onclick="location.href='../login/login'">취소하기</button>
</form>

</body>
</html>