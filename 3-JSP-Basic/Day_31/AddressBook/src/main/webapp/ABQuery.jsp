<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3> 주소록 명단 리스트 </h3>

<form action="ABQuery.jsp" method="post">
검색 선택 : 
	<select name="search">
		<option value="id">아이디</option>
		<option value="name">이름</option>
		<option value="tel">전화번호</option>
		<option value="address">주소</option>
	</select>
	<input type="text" name="searchValue">
	<input type="submit" value="검색">
</form>	
	<hr>
	
	<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String strUserid = null;

/* DATABASE 에 넣기 */

String url_mysql = "jdbc:mysql://127.0.0.1/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";

String id_mysql = "root";
String pw_mysql = "qwer1234";
String whereStatement = "";
	if(request.getParameter("searchValue") == ""){
		whereStatement = " select userid,name,tel,address,insertdate from purchaseinfo";
	}else{
		whereStatement = " select userid,name,tel,address,insertdate from purchaseinfo where " + request.getParameter("search")  + " like '%" + request.getParameter("searchValue")+"%' ";
	}
	whereStatement = "select userid,name,tel,address,insertdate from purchaseinfo ";
int cnt = 0;

try{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	Statement stmt_mysql = conn_mysqlv.createStatement();
	
	ResultSet rs = stmt_mysql.executeQuery(whereStatement);
%>
	<table border="1">
		<tr>
			<th>UserId</th><th>이름</th><th>전화번호</th><th>주소</th><th>입력일자</th>
		</tr>
		
		
<%
	while(rs.next()){
%>
	<tr>
		<td><a href="purchaserSelect_02.jsp?userid=<%=rs.getString(1)%>"><%=rs.getString(1) %></a></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
	</tr>
	
<%	
		cnt++;
		
	}
%>
	</table>
<%
	conn_mysqlv.close();
	
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<br><br>
	
	총 인원은  <%=cnt %>  입니다. 	
	
	
	<hr>






</body>
</html>