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
		for(int i = 1 ; i < 6 ; i++){
			
			out.println(powSet(2,i)+"<br>");
			
		}
	
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

<%!
	private int power(int a, int b){
	int result = 1;
	for(int i = 0 ; i < b ; i ++){
		result *= a ;

	}
	
	return result;
	
}

%>