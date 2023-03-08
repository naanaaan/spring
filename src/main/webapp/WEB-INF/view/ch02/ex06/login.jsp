<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<form method='post'>
	이름: <input type='text' name='username' value='${user.username }'/><br>
	암호: <input type='password' name='password'/><br>
	<input type='checkbox' name='rememberMe'/> 이름 저장
	<input type='submit'/>
</form>