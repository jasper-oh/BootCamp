<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkForm(){
		/* alert("아이디 : " + document.loginform.id.value + "\n" + "pw : " + document.loginform.pw.value); */
		
		const field = document.loginform;
		
		
		if(field.id.value == ""){
			alert("아이디는 필수 입력값입니다.");
			field.id.focus();
			return false; 
		}
		
		field.submit();
		
		
	}
	


</script>
<body>

<h2> 아래의 항목을 입력후 확인 버튼을 누르세요 !</h2>

<form action="purchaseInsert_02.jsp" method ="post" name="loginform">
	<table>
		<tr>
			<td> 사용자 ID : </td>
			<td> <input type="text" name="id"> </td>
		</tr>			
		<tr>
			<td> 
				<input type="submit" value="check!">
			</td>
		
		</tr>
	
	</table>

</form>
</body>
</html>