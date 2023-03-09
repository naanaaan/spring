<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script>
function init() {
	//이버튼클릭하면 먼저 queryString형태로 요청보냄 이 버튼핸들러먼저 시작되는거임
	//그다음 컨트롤러 gethandeler실행되는거임
   $('#getBtn').click(() => {
      $.ajax({
         url: 'get',
         method: 'get',
         data: { //data의 값은 queryString으로 변환.
            userId: 1,
            username: '최한석',
            birthday: '2023-03-09'
         }, //queryString으로 requestheader에 담음
         //request에 담는 data 형태. (default값. 생략가능.)
         contentType: 'application/x-www-form-urlencoded' //queryString형태
         //success handler를 이렇게도 표현할 수 있다.
         //json형태의 객체를 server가 받으면 바로 알아서 
         //user객체로 변환해서 사용한다.
      }).done(user => console.log(user)) //response 바디에 json이들어오면 이제 이done이 마지막에  출력하는거다. user객체임 json아님
      //순서1. 이버튼핸들러 2.get컨트롤러 이때 user필드값 다넣음 3.done처리
   })
   
   $('#postBtn').click(() => {
	   $.ajax({
			url: 'post',
			method: 'post',
			data: JSON.stringify({
				userId: 2,
				username: '한아름',
				birthday: '2023-04-10'
			}),
			contentType: 'application/json' //json형태로 보낼거다 requset body
	   }).done(user => console.log(user))
   })
   
   $('#putBtn').click(() => {
	   $.ajax({
		   url: 'put',
		   method: 'put',
		   data: JSON.stringify({
			   userId: 3,
			   username: '양승일',
			   birthday: '2023-05-12'
		   }),
		   contentType: 'application/json'
	   }).done(user => console.log(user))
   })
   
      //patch 버튼 클릭시.
   $('#patchBtn').click(() => {
      $.ajax({
         url: 'patch',
         method: 'patch',
         data: JSON.stringify({
            userId: 4,
            username: '김가람',
            birthday: '2023-07-17'
         }),
         contentType: 'application/json'
      }).done(user => console.log(user))
   })
   
   //delete 버튼 클릭시.
   $('#deleteBtn').click(() => {
      $.ajax({
         url: 'delete',
         method: 'delete',
         data: JSON.stringify({
            userId: 5,
            username: '박돈일',
            birthday: '2025-05-05'
         }),
         contentType: 'application/json'
      }).done(user => console.log(user))
   })
}
$(init)
</script>

<nav>
   <button type='button' id='getBtn'>GET</button>
   <button type='button' id='postBtn'>POST</button>
   <button type='button' id='putBtn'>PUT</button>
   <button type='button' id='patchBtn'>PATCH</button>
   <button type='button' id='deleteBtn'>DEL</button>
</nav>