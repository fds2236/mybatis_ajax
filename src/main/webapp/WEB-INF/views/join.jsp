<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script> 
<script>
// 중복확인 버튼 누를 경우
function checkId() {
  console.log("아이디 중복확인");
  var input = document.getElementById("idInput").value;
  axios.get('http://localhost:8005/idCheck', {
      params: {
        member_id: input
      }
    })
    .then(function(response) {
      console.log(response.data);
      if(response.data == true) {
    	  alert("가입가능한 아이디입니다.");
      } else {
    	  alert("이미 존재하는 아이디입니다.");
      }
    });
}
</script>
<title>회원가입</title>
</head>
<body>


<input placeholder='아이디 입력' id="idInput">
<button type="button" onclick="checkId()">중복확인</button>

</body>
</html>