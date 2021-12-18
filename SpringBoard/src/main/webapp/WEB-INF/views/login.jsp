<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#foot {
background-color : #B2DDEF;
color:#ffffff;
padding: 15px;

}

#top {
background-color : #B2DDEF;
color:#ffffff;
padding: 15px;

}
	img, label { display:inline-block;}
	label{ width:130px}
	button{ background-color: #4aa8d8;; color:white;font-size:15px}
</style>
</head> 
<body>

<div class="container wrapper">
<div id="top"> 
<h1>HIS BOARD</h1>
<h2>LOGIN</h2>
</div>

<div style='width:100%;text-align:center;padding-top:100px'>
<img src='../img/Handong.png' height="200">
<img src='../img/hunseong.jpg' height="250">
<form method="post" action="loginOk"><br>
<div><label>User ID: </label><input type='text' name='userid' /></div><br>
<div><label>Password: </label>
	<input type='password' name='password' /></div>
<br><button type='submit'>로그인</button>
<button type='button' onclick="location.href='../login/signin'">회원가입</button>
</form>
</div> 
</body>
</html>