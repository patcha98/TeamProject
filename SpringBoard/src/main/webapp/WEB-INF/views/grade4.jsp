<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>free board</title>
<style>
#foot {
background-color : #B2DDEF;
color:#ffffff;
padding: 15px;

}
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

#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:hover {background-color: #ddd;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color:  #4aa8d8;
  color: white;
}
</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
</script>
</head>
<body>

<div id="top"> 
<h1>HIS BOARD</h1>
<h2>4학년 게시글 모음</h2>
</div>
<div id="b_group">
<button type="button" onclick="location.href='../gradeBoard/1'">1학년 게시글</button>
<button type="button" onclick="location.href='../gradeBoard/2'">2학년 게시글</button>
<button type="button" onclick="location.href='../gradeBoard/3'">3학년 게시글</button>
<button type="button" onclick="location.href='../list'">전체게시글</button>
</div>
<table id="list" width="90%">
<tr>
	<th>Id</th>
	<th>카테고리</th>
	<th>제목</th>
	<th>글쓴이</th>
	<th>학년</th>
	<th>이메일</th>
	<th>내용</th>
	<th>등록일</th>
	<th>수정</th>
	<th>삭제</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.seq}</td>
		<td>${u.category}</td>
		<td>${u.title}</td>
		<td>${u.writer}</td>
		<td>${u.grade}</td>
		<td>${u.email}</td>
		<td>${u.content}</td>
		<td>${u.regdate}</td>
		<td><a href="editform/${u.seq}">글수정</a></td>
		<td><a href="javascript:delete_ok('${u.seq}')">글삭제</a></td>
	</tr>
</c:forEach>
</table>
<br><br/>
<div id = "foot">
<button type="button" onclick="location.href='../add'">새글쓰기</button>

</div>
<div style='width:100%;text-align:center;padding-top:100px'>
<img src='../../img/Handong.png' height="100" width =50%>
</div>
</body>
</html>