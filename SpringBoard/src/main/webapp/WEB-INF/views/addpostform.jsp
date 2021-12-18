<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#b_group button{ border: 1px solid skyblue; 
background-color: rgba(0,0,0,0); 
color: skyblue; padding: 5px; } 
#btn_group button:hover{ 
color:white; 
background-color: skyblue; 
}

#top {
background-color : #B2DDEF;
color:#ffffff;
padding: 15px;

}
</style>
</head>
<body>

<div id="top"> 
<h1>HIS BOARD</h1>
<h2>새로운 게시글 작성</h2>
</div>

<form action="addok" method="post">
	<table id="edit">
		<tr><td>카테고리:</td><td><input type="text" name="category"/></td></tr>
		<tr><td>제목:</td><td><input type="text" name="title"/></td></tr>
		<tr><td>글쓴이:</td><td><input type="text" name="writer"/></td></tr>
		<tr><td>학년:</td><td><input type="text" name="grade"/></td></tr>
		<tr><td>이메일:</td><td><input type="text" name="email"/></td></tr>
		<tr><td>내용:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
	</table>
	<div id="b_group">
	<button type="submit">등록하기</button>
	<button type="reset">리셋하기</button>
	<button type="button" onclick="location.href='list'">목록보기</button>
	</div>
</form>

<div>
</div>
</body>
</html>