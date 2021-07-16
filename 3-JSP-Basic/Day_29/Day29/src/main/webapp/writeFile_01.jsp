<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write File</title>
</head>
<body>
	<h2>Write File</h2>
	
	<form action="writeFile_02.jsp" method="post">
		<span> 이름 : </span>
		<input type="text" name="name"><br>
		
		<span> 제목 : </span>
		<input type="text" name="title"><br>
		<textarea rows="5" cols="5" name="content"></textarea><br>
		<input type="submit" value="save">
	</form>
</body>
</html>