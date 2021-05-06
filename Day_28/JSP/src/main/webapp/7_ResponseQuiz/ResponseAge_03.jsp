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

%>
 <h3> 성인 </h3>
 
 <span> 당신의 나이는 <%=age %> 이므로 주류 구매가 가능합니다.</span>
 
 <a href="http://localhost:8080/JSP/7_ResponseQuiz/ResponseAge_01.jsp">되돌아가기</a>

</body>
</html>