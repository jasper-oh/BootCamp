<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선언부</title>
</head>
<body>
	
	
<%
	out.println(decadd(2,1)+"<br>");
	out.println(decadd(3,1)+"<br>");
	out.println(decadd(4,1)+"<br>");
	out.println(decadd(5,1)+"<br>");
%>	
	
	2+1 = <%= decadd_t(2,1) %>
	

</body>
</html>

<%!
	private String decadd(int a,int b){
			
		return a + "+" + b + "=" + (a+b);
}

%>
<%!
	private int decadd_t(int a,int b){
	
		return a+b;
	}

%>