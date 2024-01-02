<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>로그인 화면</h2>
<form action="login" method = get> 
id : <input type="text" name="userid">  <br>                 
pw: <input type="text" name="passwd">                       
<input type="submit" value="로그인">                     
</form>

<h2>로그인 화면2</h2>
<form action="login" method = post> 
id : <input type="text" name="userid">  <br>                 
pw: <input type="text" name="passwd">                       
<input type="submit" value="로그인">                     
</form>

<h2>회원가입 화면</h2>
<form action="member" method = get> 
id : <input type="text" name="userid">  <br>                 
pw: <input type="text" name="passwd">    <br> 
email : <input type="text" name="email">  <br>                 
email2: <input type="text" name="email">    <br> 
                   
<input type="submit" value="회원가입">                     
</form>
</body>
</html>