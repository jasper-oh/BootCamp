<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum of 1 to 100</title>
</head>
<body>

<%-- <% for(int i = 1 ; i < 101 ; i+=2){
	out.println("1 + 2 + 3 + .... + 99 + 100 = "+i + (i+1));
}	
	%> --%>
	
	<%
	/*  등차 수열의 합 공식 사용 */
	int a = 1;
	int last = 100;
	int last2 = 200;
	
	out.println("1부터 100까지의 합 = " + (last/2)*(a+last)+"<br>");
	out.println("1부터 200까지의 합 = "+ (last2/2)*(a+last2));
	
	%>


</body>
</html>