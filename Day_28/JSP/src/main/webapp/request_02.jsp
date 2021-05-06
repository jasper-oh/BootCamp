<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hello</title>
</head>
<body>

<%

request.setCharacterEncoding("utf-8");

%>

	<span> Hello , <%=request.getParameter("yourname") %> Sir! </span>

</body>
</html>