<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>거듭제곱</title>
</head>
<body>
	
	<%
	out.println(powSet(2, 1)+"<br>");
	out.println(powSet(2, 2)+"<br>");
	out.println(powSet(2, 3)+"<br>");
	out.println(powSet(2, 4)+"<br>");
	out.println(powSet(2, 5)+"<br>");
	
	%>
	


</body>
</html>
<%!
	private String powSet(double a , double b){
	
	int getIntA = (int)Math.round(a);
	int getIntB = (int)Math.round(b);
	
	return getIntA +" ^ "+ getIntB + " = " + (int)Math.round(Math.pow(a, b));
}


%>