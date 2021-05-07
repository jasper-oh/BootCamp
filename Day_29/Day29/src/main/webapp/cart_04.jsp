<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내역 확인</title>
</head>
<body>
<%
	BufferedReader reader = null;

	try{
		String filePath = application.getRealPath("file.txt");
		reader = new BufferedReader(new FileReader(filePath));
		while(true){
			String str = reader.readLine();
			if(str == null) break;
			out.print(str + "<br>");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>

<a href="http://localhost:8080/Day29/cart_01.jsp">되돌아 가기</a>

	

</body>
</html>