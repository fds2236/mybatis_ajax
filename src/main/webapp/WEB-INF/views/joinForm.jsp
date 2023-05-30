<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script> 
<script>
// 중복확인 버튼
// axios 방식
// function checkId() {
//   console.log("아이디 중복확인");
//   var input = document.getElementById("idInput").value;
//   axios.get('http://localhost:8005/idCheck', {
//       params: {
//         member_id: input
//       }
//     })
//     .then(function(response) {
//       console.log(response.data);
//       if(response.data == true) {
//     	  alert("가입가능한 아이디입니다.");
//       } else {
//     	  alert("이미 존재하는 아이디입니다.");
//       }
//     });
// }

function checkId(idInput){
	$.ajax({
		url: "/checkId",
		type:"GET",
		data: {
			member_id:idInput
		},
		success:function(reponse){
			console.log(response);
		}
	});	
}



</script>
<title>회원가입</title>
</head>
<body>

<form action="/joinAction" method="post">
<input placeholder='아이디 입력' id="idInput" name="member_id">
<button type="button" onclick="checkId(idInput)">중복확인</button>
<input type="password" placeholder='비밀번호 입력' name="member_pwd">
<button type="submit">가입</button>
</form>

</body>
</html>