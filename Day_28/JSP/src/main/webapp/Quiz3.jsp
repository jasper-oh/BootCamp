<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  action="Quiz3_show.jsp" method="post">
		
		<input type="text" name="num1">
		<span> + </span>
		<input type="text" name="num2">
	
		<select name = "num3">
			<%
			for(int i = 1 ; i< 1000 ; i++){
				out.println("<option>"+ i +"</option>");
			}
			%>
		</select>
		<span> + </span>
		<select name = "num4">
			<%
			for(int i = 1 ; i< 1000 ; i++){
				out.println("<option>"+ i +"</option>");
			}
			%>
		</select>
		
		<input type="submit" value="OK">
		
	
	</form>


</body>
</html>