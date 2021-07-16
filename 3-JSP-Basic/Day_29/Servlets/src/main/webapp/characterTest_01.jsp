<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성격 테스트</h1>
	
	<span>당신의 성격을 테스트 합니다. 데이터를 입력한 후 확인 버튼을 눌러주세요.</span>
	
	<form action="characterTest_01S" method="get">
	<span>이름은 ? </span>
	<input type="text" name = "name"><br><br>
	<span>좋아하는 동물은 ? </span>
	노랑<input type="radio" name="color" value = "노랑" checked="checked">
	빨강<input type="radio" name="color" value="빨강">
	파랑 <input type="radio" name="color" value="파랑" ><br><br>
	<span>좋아하는 동물은?</span>
	<select name = "animal">
		<option value="거북이">거북이</option>
		<option value="강아지">강아지</option>
	</select><br>
	<span>좋아하는 음식은 ? ( 모두 고르세요 )</span>
	<input type="checkbox" name ="food" value="짜장면" checked="checked">짜장면
	<input type="checkbox" name ="food" value="짬뽕" >짬뽕
	<input type="checkbox" name ="food" value="탕수육" >탕수육<br>
	
	<input type="submit" value="확인">
	</form>
</body>
</html>