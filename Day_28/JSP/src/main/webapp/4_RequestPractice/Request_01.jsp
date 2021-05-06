<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이름 입력</title>
</head>
<body>

	이름을 입력하고 확인 버튼을 누르세요.
	<br>
	<br>
	
	<form action="request_02.jsp" method="get">
		<span> 
			이름 :
		</span>
		
		<input type="text" name="yourname">
		
		<input type="submit" value="Check">

	</form>
	
	
</body>
</html>