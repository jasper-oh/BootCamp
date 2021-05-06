<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Calendar</title>
</head>
<body>


	<%
	
	GregorianCalendar now = new GregorianCalendar();
	
	
	String date = String.format("%TF",now);
	String date_a = String.format("%TT",now);
	
	out.println(date);
	out.println(date_a);
	
	
	String date2 =now.toString();
	out.println(date2);
	
	%>
	
	<%=String.format("%TY년 %Tm월 %Td일",now,now,now)%>

</body>
</html>