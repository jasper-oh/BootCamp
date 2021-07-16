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
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pw");
		String name = request.getParameter("name");
		String phonef = request.getParameter("phonef");
		String phonem = request.getParameter("phonem");
		String phonel = request.getParameter("phonel");
		String email = request.getParameter("email");

%>


아이디 : <%=id %> 
비밀번호 : <%=pwd %>
이름 : <%=name %>
연락처 : <%=phonef + phonem + phonel %>
이메일 : <%=email %>
</body>
</html>