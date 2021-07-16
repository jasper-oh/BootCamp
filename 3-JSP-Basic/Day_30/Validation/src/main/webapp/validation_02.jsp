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
		
		var form = document.loginform
		
		if(form.id.value == ""){
			
			alert("아이디를 넣어주세요 !");
			form.id.focus();
			return false;
		}else if (form.pw.value == ""){
			
			alert("비밀번호를 넣어주세요 !");
			form.pw.focus();
			return false;
		}
		
		form.submit();
		
		
		/* alert("아이디 : " + form.id.value + "\n" + "pw : " + form.pw.value) */
		
	}
	
</script>
<body>
	<form  name="loginform" action="validation_02_Process.jsp" method="post">
		<p> 아이디 : <input type = "text" name="id" ></p>
		<p> 비밀번호 : <input type = "password" name="pw" ></p>
		<p> <input type="button" value="전송" onclick="checkLogin()"></p>
	</form>

</body>

</html>