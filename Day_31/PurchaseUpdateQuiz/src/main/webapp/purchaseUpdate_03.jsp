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

String user_id = request.getParameter("userid");
String strUserid = null;

/* DATABASE 에 넣기 */

String url_mysql = "jdbc:mysql://127.0.0.1/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";

String id_mysql = "root";
String pw_mysql = "qwer1234";


String name = request.getParameter("name");
String phone = request.getParameter("phone");
String address = request.getParameter("address");

PreparedStatement ps = null;

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	Statement stmt_mysql = conn_mysqlv.createStatement();
	
	String A = " update purchaseinfo set name = ? , tel = ? , address = ? where userid = ?";
	
	ps = conn_mysqlv.prepareStatement(A);
	ps.setString(1,name);
	ps.setString(2,phone);
	ps.setString(3,address);
	ps.setString(4,(String)session.getAttribute("ID"));
	ps.executeUpdate();
	
	
	conn_mysqlv.close();
	/* id 를 찾았을 경우에만 session 에다가 넣는다. */		
	session.setAttribute("NEWNAME",name);
	session.setAttribute("NEWPHONE",phone);
	session.setAttribute("NEWADDRESS",address);
	
	
}catch(Exception e){
	e.printStackTrace();
}

response.sendRedirect("purchaseInsert_04.jsp");




%>

</body>
</html>