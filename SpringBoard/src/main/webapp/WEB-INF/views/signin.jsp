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
</style>
</head>
<body>

<div id="top"> 
<h1>WELCOME TO  HIS BOARD</h1>
<h2>회원가입 </h2>
</div>


<form action="signok" method="post" name="signin_form">
	<table id="edit">
		<tr><td>아이디:</td><td><input type="text" id="id_val" name="userid" /></td></tr>
		<tr><td>이름:</td><td><input type="text" id="name_val" name="username"/></td></tr>
		<tr><td>비밀번호:</td><td><input type="text" id="pw_val" name="password"/></td></tr>
		<tr><td>성별:</td><td>
			여자<input type="radio" id="gen_val" name="gender" value="woman">
			남자<input type="radio" id="gen_val" name="gender" value="man">
		</td></tr>
		<tr><td>이메일:</td><td><input type="text" id="email_val" name="email"/></td></tr>
		<tr><td>블로그URL:</td><td><input type="text" id="blog_val" name="blogurl"/></td></tr>
		<tr><td>자기소개:</td><td><textarea cols="50" rows="5" id="con_val" name="detail"></textarea></td></tr>
	</table>
	<div id="b_group">
		<input type="button" value="회원등록하기" onclick="check_input()" style="border: 1px solid skyblue; 
background-color: rgba(0,0,0,0); 
color: skyblue; padding: 5px;"/>
		<button type="reset">리셋하기</button>
		<button type="button" onclick="location.href='../login/login'">취소하기</button>
	</div>
</form>
<div id = "foot">
HANDONG UNIVERSITY
</div>

<script type="text/javascript">
function check_input() {
    if (!document.signin_form.id_val.value)
    {
        alert("아이디를 입력하세요!");
        document.signin_form.id_val.focus();
        return;
    }
    if (!document.signin_form.pw_val.value)
    {
        alert("비밀번호를 입력하세요!");
        return;
    }
    if (!document.signin_form.name_val.value)
    {
        alert("이름을 입력하세요!");
        document.signin_form.name_val.focus();
        return;
    }
    
    if (!document.signin_form.email_val.value)
    {
        alert("이메일을 입력하세요!");
        document.signin_form.email_val.focus();
        return;
    }
    
    if (!document.signin_form.gen_val.value)
    {
        alert("성별을 입력하세요!");
        return;
    }
    
    if (!document.signin_form.blog_val.value)
    {
        alert("블로그url을 입력하세요!");
        document.signin_form.blog_val.focus();
        return;
    }
    
    if (!document.signin_form.con_val.value)
    {
        alert("자기소개를 입력하세요!");
        document.signin_form.con_val.focus();
        return;
    }
    
    
    document.signin_form.submit();
 }
</script>

</body>
</html>