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
		String num1,num2,num3,num4;
		int Intnum1 = 0,Intnum2 = 0,Intnum3 = 0 ,Intnum4 = 0;
		
		try{
			num1 = request.getParameter("num1");
			num2 = request.getParameter("num2");
			num3 = request.getParameter("num3");
			num4 = request.getParameter("num4");
					
			Intnum1 = Integer.parseInt(num1.trim());
			Intnum2 = Integer.parseInt(num2.trim());
			Intnum3 = Integer.parseInt(num3);
			Intnum4 = Integer.parseInt(num4);
		}catch(Exception e){
			
		      RequestDispatcher dispatcher = request.getRequestDispatcher("Quiz3_error.jsp");

              dispatcher.forward(request, response);

		}

	%>
	
	<span><%=Intnum1 + Intnum2 %></span>
	<span><%=Intnum3 + Intnum4 %></span>
	

	

</body>
</html>