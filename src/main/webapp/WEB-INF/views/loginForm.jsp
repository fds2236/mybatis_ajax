<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<script>
function inputId(){
	
}

function inputPwd(){
	
}
</script>
</head>
<body>
<form action="/loginAction">
<input name="member_id" placeholder="아이디를 입력하세요" onchange="inputId()">
<input name="member_pwd" placeholder="비밀번호를 입력하세요" onchange="inputPwd()">
<button type="submit">로그인</button>
</form>

</body>
</html>