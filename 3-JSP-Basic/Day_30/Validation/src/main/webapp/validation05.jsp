<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function checkLogin(){
	
	var form = document.loginform;
	var check = /[a-zA-Z]/;	// 문자

	
	
	//Empty Check
	
	if(form.id.value == ""){
		
		alert("아이디를 넣어주세요 !");
		form.id.focus();
		return false;
	}else if (form.pw.value == ""){
		
		alert("비밀번호를 넣어주세요 !");
		form.pw.focus();
		return false;
	}
	// Length Check
	if(form.id.value.length < 4 || form.id.value.length > 12){
		alert("Id 는 4 ~ 12 자리 이내로 입력 가능합니다. ");
		form.id.select();
		return false;
	}
	
	if(form.pw.value.length < 4 ){
		alert("비밀번호 는 4자리 이상으로 입력해야 합니다 . ");
		form.pw.focus();
		return false;
	}
	
	if(check.test(form.name.value)){
		alert("이름은 한글로 입력해주세요! ")
		return false;
	}
	
	form.submit();
}
</script>
<body>

	<form  name="loginform" action="validation05_Process.jsp" method="post">
		<p> 아이디 : <input type = "text" name="id" ></p>
		<p> 비밀번호 : <input type = "password" name="pw" ></p>
		<p> 이름 : <input type = "text" name="name" ></p>
		<p> 
		연락처 : 	<select name="phonef">
					<option value="010">010</option>
					<option value="011">011</option>
				</select>
				-
				<input type="text"  name="phonem">
				-
				<input type="text" name="phonel">					
		</p>
		<p> 이메일 : <input type = "text" name="email" ></p>
		<p> <input type="button" value="가입하기" onclick="checkLogin()"></p>
	</form>
</body>
</html>