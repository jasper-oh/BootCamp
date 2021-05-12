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


/* DATABASE 에 넣기 */

String url_mysql = "jdbc:mysql://127.0.0.1/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";

String id_mysql = "root";
String pw_mysql = "qwer1234";

String name = request.getParameter("name");
String tel =  request.getParameter("tel");
String address =  request.getParameter("address");
PreparedStatement ps = null;
ResultSet rs = null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	Statement stmt_mysql = conn_mysqlv.createStatement();
	
	String whereStatement = "update purchaseinfo set name = ? , tel = ? , address = ? where userid = ?";
	
	ps = conn_mysqlv.prepareStatement(whereStatement);
	ps.setString(1,name);
	ps.setString(2,tel);
	ps.setString(3,address);
	ps.setString(4,userid);
	
	
	ps.executeUpdate();
	
	
	conn_mysqlv.close();
	
	
}catch(Exception e){
e.printStackTrace();
}

response.sendRedirect("purchaserSelect_01.jsp");
%>

</body>
</html>