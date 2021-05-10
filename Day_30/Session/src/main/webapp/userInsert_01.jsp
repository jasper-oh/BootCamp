<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 개인 정보를 입력하세요.</h2>
	
	<form action="userInsert_02.jsp">
		<span>
			아이디 : 	
		</span>
		<input type="text" name="id">
		<span>
			패스워드 : 	
		</span>
		<input type="password" name="pw">
		<span>
			이름 : 	
		</span>
		<input type="text" name="name">
		
		<input type="submit" value="go">
	</form>

</body>
</html>