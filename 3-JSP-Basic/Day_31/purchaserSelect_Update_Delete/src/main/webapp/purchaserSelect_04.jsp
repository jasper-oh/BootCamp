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
<%
request.setCharacterEncoding("utf-8");



String userid = request.getParameter("userid");




String url_mysql = "jdbc:mysql://127.0.0.1/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";

String id_mysql = "root";
String pw_mysql = "qwer1234";

String name = "";
String tel = "";
String address = "";
PreparedStatement ps = null;
ResultSet rs = null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	Statement stmt_mysql = conn_mysqlv.createStatement();
	
	String whereStatement = "delete from purchaseinfo where userid = ?";
	
	ps = conn_mysqlv.prepareStatement(whereStatement);
	ps.setString(1,userid);
	
	
	ps.executeUpdate();
	
	conn_mysqlv.close();
	
	
}catch(Exception e){
e.printStackTrace();
}

	response.sendRedirect("purchaseSelect_01.jsp");
%>


</body>
</html>