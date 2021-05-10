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
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		session.setAttribute("ID",id);
		
		
		String pw = request.getParameter("pw");
		session.setAttribute("PW",pw);
		
		String name = request.getParameter("name");
		session.setAttribute("NAME",name);
	%>

	<h2>
		약관
	</h2>
	
	<hr>
		<ol>
			<li> 회원 정보는 웹사이트의 운영을 위해서만 사용 됩니다.</li>
			<li> 웹사이트의 정상 운영을 방해하는 회원은 탈퇴 처리 합니다.</li>
		</ol>
	<hr>
		
		<span> 위의 약관에 동의 하십니까?</span>
	<br>
	<br>
	<form action="userInsert_03.jsp">
		<input type="radio" value="checking" name="agree">동의함 <input type="radio" value="unchecking" name="agree">동의 하지 않음 
		<br>
		<br>
		<input type="submit" value="check!">
	</form>
	
	
	
</body>
</html>