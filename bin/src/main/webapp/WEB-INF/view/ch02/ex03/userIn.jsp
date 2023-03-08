<%@ page language='java' contentType='text/html; charset=utf-8'
    pageEncoding='utf-8'%>
    <!-- handler의 url을 쓴다. -->
<form method='post'> <!--action='user' 생락하는 게 더 깔끔-->  
	<label>이름: <input type='text' name='username'/></label>
	<label>나이: <input type='number' name='age'/></label>
	<label>등록일: <input type='date' name='regDate'/></label>
	<input type='submit'/>
</form>