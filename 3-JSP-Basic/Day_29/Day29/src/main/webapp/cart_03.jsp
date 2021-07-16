<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>결과 출력</title>
</head>
<body>
	
	<h2>상품 선택 저장 결과</h2>
	
	<%
		String result = request.getParameter("result");
		String quantity = request.getParameter("quantity");
		String howBig = request.getParameter("big");
		String color = request.getParameter("color");
	
	
		if(result.equals("Success")){
			
			out.print("파일 저장에 성공했습니다.");
			
		}else{
			
			out.print("파일 저장에 실패했습니다.");
			
		}
	%>
	
	<form action="cart_04.jsp" method="post">
		<input type="hidden" name="quantity" value=<%=quantity %>>
		<input type="hidden" name="big" value=<%=howBig %>>
		<input type="hidden" name="color" value=<%=color %>>
		<input type="submit" value="저장 결과 불러오">
	</form>
	
	
	


</body>
</html>