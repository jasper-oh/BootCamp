<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품선택</title>
</head>
<body>
	<form action="cart_02.jsp" method="post">
		<span> 수량 : </span>
		<input type="text" name="quantity"><br>
		<span> 크기 : </span>
		대<input type="radio" name="big" value ="대" checked="checked">
		중<input type="radio" name="big" value ="중">
		소<input type="radio" name="big" value ="소"><br>
		
		<span>색상</span>
		<select name="color">
    		<option value="kaki"selected="selected">카키</option>
    		<option value="brown">브라운</option>
    		<option value="baige" >베이지</option>
		</select>
		<input type="submit" value="save">
	
	</form>
	
	

</body>
</html>