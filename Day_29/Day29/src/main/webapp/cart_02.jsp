<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> 상품 선택 저장 결과</h2>
<% 	
	request.setCharacterEncoding("utf-8");

	String quantity = request.getParameter("quantity");
	String howBig = request.getParameter("big");
	String color = request.getParameter("color");
	
	
	String filename = "file.txt";
	
	PrintWriter writer = null;
	
	String result ;
	
	try{
		String filePath = application.getRealPath("/" + filename);
		writer = new PrintWriter(filePath);
		writer.println(" 양 : " + quantity);
		writer.println(" 크기 : " + howBig);
		writer.println("색 : " + color);
		result = "Success";
	}catch(Exception e){
		e.printStackTrace();
		result = "Fail";
	}finally{
		try{
			writer.close();
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
	
	response.sendRedirect("cart_03.jsp?result="+result);
	
%>
</body>
</html>