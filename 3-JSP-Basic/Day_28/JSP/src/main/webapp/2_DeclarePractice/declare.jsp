<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선언부</title>
</head>
<body>
	<!-- 선언부 -->
	<%!
		
		int i = 10;
		String str = "I have a dream.";
	
	
	%>
	
	<%
		out.println("i = "+ i + "<br>");
		out.println("str = "+ str + "<br>");
		out.println("sum = " + sum(12,15));
	%>


</body>
</html>
<!-- 보통 함수들은 html 코드 밑에다가 구분을 위해 따로 작성한다 =따로 해야지 에러 안뜸  -->	
	<%!
		public int sum(int a,int b){
		
		return a+b;
	}
	
	%>