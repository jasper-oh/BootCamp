<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		String age = request.getParameter("age");
		int intAge = Integer.parseInt(age);
		
		
		
		if(intAge > 21){
			response.sendRedirect("http://localhost:8080/JSP/8_ResponseQuiz_1/ResponseAge_03.jsp"+"?age="+intAge + "&a="+"Adult" +"&b="+"Possible");
			
			
		}else{
			response.sendRedirect("http://localhost:8080/JSP/8_ResponseQuiz_1/ResponseAge_03.jsp"+"?age="+intAge+ "&a="+"teenager"+"&b="+"Impossible");
		}
		
	%>
	
	

</body>
</html>