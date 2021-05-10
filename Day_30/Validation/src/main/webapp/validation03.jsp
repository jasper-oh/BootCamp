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
		
		form.submit();
	}
	
</script>
<body>
	<form  name="loginform" action="validation03_Process.jsp" method="post">
		<p> 아이디 : <input type = "text" name="id" ></p>
		<p> 비밀번호 : <input type = "password" name="pw" ></p>
		<p> <input type="button" value="전송" onclick="checkLogin()"></p>
	</form>

</body>
</html>

