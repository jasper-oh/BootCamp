<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>계산 결과</title>
</head>
<body>

	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		
		request.setAttribute("Add", num1+num2);
		request.setAttribute("Sub", num1-num2);
		request.setAttribute("Mul", num1*num2);
		request.setAttribute("Div", (double)num1/ (double)num2);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Forward_03.jsp");
		
		dispatcher.forward(request, response);
		
	%>

</body>
</html>