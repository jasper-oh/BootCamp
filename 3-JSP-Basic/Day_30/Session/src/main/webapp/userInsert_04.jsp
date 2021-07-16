<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>
		회원 가입 결과
	</h2>
	
	
		<% 
		
		String result = request.getParameter("result"); 
		
		if(result.equals("checking")){
			
			out.println("가입되었습니다 ! ");
	%>		
		
	<h2>
		가입내용
	</h2>
	
	<span> 아이디 : <%=session.getAttribute("ID") %> </span>
	<span> 패스워드 : <%=session.getAttribute("PW") %> </span>
	<span> 이름 : <%=session.getAttribute("NAME") %> </span>	
		
		
	<% 		
		}else{
		
			out.println("가입 실패 하였습니다 ! ");
			
		}
		

		%>
	
	
	

</body>
</html>