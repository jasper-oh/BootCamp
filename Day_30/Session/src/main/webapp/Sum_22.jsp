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
	
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		try{
			num1 = Integer.parseInt(request.getParameter("num1"));
			num2 = Integer.parseInt(request.getParameter("num2"));
			result = num1+ num2;
		
		}catch(Exception e){
			RequestDispatcher dispatcher = request.getRequestDispatcher("DataError.jsp");
			dispatcher.forward(request,response);
			
		}finally{
			
			
		}
	%>
	
	
	<%=num1 %> + <%=num2 %> = <%=result %>
</body>
</html>