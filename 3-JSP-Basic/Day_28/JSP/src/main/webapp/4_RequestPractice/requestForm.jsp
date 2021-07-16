<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사용자 정보 입력</title>
</head>
<body>

	<form action="requestParameter.jsp" method="post">
		<span>Name : </span>
		
		<input type="text" name="name" size="10">
		
		<span> ID : </span>
		
		<input type="text" name="id" size="10">
		
		<span> Password : </span>
		
		<input type="password" name="password" size="10">	<br>
		
		
		<span> Hobby : </span>
		
		<input type="checkbox" name="hobby" value="Read" checked="checked"><span>Reading</span>
		<input type="checkbox" name="hobby" value="Weight" ><span>Weight</span>
		<input type="checkbox" name="hobby" value="Jog" ><span>Jog</span>
		<input type="checkbox" name="hobby" value="Swimming" ><span>Swimming</span><br>
		
		
		<span> Major : </span>
		
		<input type="radio" name="major" value="English" checked="checked"><span>국어</span>
		<input type="radio" name="major" value="CS" ><span>CS</span>
		<input type="radio" name="major" value="Math" ><span>Math</span><br>
		
		<span> Protocol : </span>
		
		<select name="protocol">
			<option value="http" selected="selected">http</option>
			<option value="ftp">Ftp</option>
			<option value="smtp">Smtp</option>
			<option value="pop">Pop</option>
		</select>
		
		
		
		<input type="submit" value="submit">
	
	
	
	
	</form>

</body>
</html>