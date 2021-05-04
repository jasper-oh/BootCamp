<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Addition</title>
</head>
<body>
	<%
		int a = 2;
		int b = 1;
		/* int addition = a + b;
		int minus = a-b;
		int multiply = a*b;
		int divide = a/b;
		int divideT = a%b; */
		
		/* while(b < 10){
			out.println(a +"*" + b + "=" + (a*b) + "<br>");
			out.println("==============="+"<br>");
			b++;
		} */
		
		while(true){
			if(b < 10){
				out.println(a +"*" + b + "=" + (a*b) + "<br>");
				out.println("===============?"+"<br>");
				b++;
				
			}else{
				break;
			}
		}
		
	%>
	
</body>
</html>