<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사용자 정보 입력 결과</title>
</head>
<body>
	
	<%
		request.setCharacterEncoding("utf-8");
		
	%>
	
	<%
	
		String name,id,pw,majors,protocol ;
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("password");
		
		String[] hobbies;
		
		hobbies = request.getParameterValues("hobby");
		
		
		
		
		majors = request.getParameter("major");
		protocol = request.getParameter("protocol");
		
	%>
	
	<span>Name : <%=name %></span>
	<span> Id : <%=id %></span>
	<span>Password : <%=pw %></span>
	<span>Hobbies : <%=Arrays.toString(hobbies)%></span>
	<span>Majors : <%=majors%></span>
	<span>Protocol : <%=protocol%></span>
	
	
	
</body>
</html>