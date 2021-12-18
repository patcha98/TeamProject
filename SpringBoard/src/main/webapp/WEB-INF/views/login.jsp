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
<<<<<<< HEAD

<form method="post" action="loginOk" name="login_form">
<div><label>User ID: </label><input type='text' id='id_val' name='userid' /></div>
<div><label>Password: </label><input type='password' id='pw_val' name='password' /></div>
<input type="button" value="로그인" onclick="check_input()" style="background-color: #4aa8d8;; color:white;font-size:15px"/>
=======
<form method="post" action="loginOk"><br>
<div><label>User ID: </label><input type='text' name='userid' /></div><br>
<div><label>Password: </label>
	<input type='password' name='password' /></div>
<br><button type='submit'>로그인</button>
>>>>>>> branch 'main' of https://github.com/patcha98/TeamProject.git
<button type='button' onclick="location.href='../login/signin'">회원가입</button>
</form>

</div> 

<script type="text/javascript">
function check_input() {
    if (!document.login_form.id_val.value)
    {
        alert("아이디를 입력하세요!");
        document.login_form.id_val.focus();
        return;
    }
    if (!document.login_form.pw_val.value)
    {
        alert("비밀번호를 입력하세요!");
        return;
    }
    document.login_form.submit();
 }
</script>

</body>
</html>