<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>


<h1>수정하기</h1>
<form:form commandName="boardVO" method="POST" action="../editok">
	<form:hidden path="seq" />
	<table id = "edit">
	<tr><td>카테고리:</td><td><form:input path="category" /></td></tr>
	<tr><td>제목:</td><td><form:input path="title"/></td></tr>
	<tr><td>글쓴이:</td><td><form:input path="writer" /></td></tr>
	<tr><td>학년:</td><td><form:input path="grade" /></td></tr>
	<tr><td>이메일:</td><td><form:input path="email" /></td></tr>
	<tr><td>내용:</td><td><form:textarea cols="50" rows="5" path="content" /></td></tr>
	</table>
	<input type="submit" value="수정하기"/>
	<button type="button" onclick="location.href='../list'">취소하기</button>
</form:form>

</body>
</html>