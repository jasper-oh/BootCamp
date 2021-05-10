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
		String agree = request.getParameter("agree");
		
		if(agree.equals("checking")){
				
			response.sendRedirect("userInsert_04.jsp?result="+agree);
		}else{
			response.sendRedirect("userInsert_04.jsp?result="+agree);
		}
	%>


</body>
</html>