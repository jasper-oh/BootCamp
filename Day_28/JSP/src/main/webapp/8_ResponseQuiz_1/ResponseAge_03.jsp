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
	String header = request.getParameter("a");
	String isOk = request.getParameter("b");

%>
 <h3> <%=header %> </h3>
 
 <span> 당신의 나이는 <%=age %> 이므로 주류 구매가 <%=isOk %>합니다.</span>
 
 <%-- 	<h3> 미성년자 </h3>
 
 <span> 당신의 나이는 <%=age %> 이므로 주류 구매가 불가능합니다.</span> --%>
 
 <a href="http://localhost:8080/JSP/8_ResponseQuiz_1/ResponseAge_01.jsp">되돌아가기</a>

</body>
</html>