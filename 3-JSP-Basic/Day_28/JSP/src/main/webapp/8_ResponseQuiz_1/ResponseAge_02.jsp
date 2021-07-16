<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Language" content="ko">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		String age = request.getParameter("age");
		int intAge = Integer.parseInt(age);
		String header,isOk;
		
		
		
		if(intAge > 21){
/* 			header = URLEncoder.encode("성인", "utf-8");
			isOk = URLEncoder.encode("가능", "utf-8"); */

		response.sendRedirect("http://localhost:8080/JSP/8_ResponseQuiz_1/ResponseAge_03.jsp"+"?age="+intAge+ "&a="+"성인"+"&b="+"가능");
			
		}else{
			/* header = URLEncoder.encode("미성년자", "utf-8");
			isOk = URLEncoder.encode("불가능", "utf-8"); */
		response.sendRedirect("http://localhost:8080/JSP/8_ResponseQuiz_1/ResponseAge_03.jsp"+"?age="+intAge+ "&a="+"미성년"+"&b="+"불가능");
		}
	%>
	
	

</body>
</html>