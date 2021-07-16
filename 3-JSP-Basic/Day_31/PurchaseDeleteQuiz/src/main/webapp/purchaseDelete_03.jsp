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
	
	String A = " delete from purchaseinfo where userid = ? ";
	
	ps = conn_mysqlv.prepareStatement(A);
	ps.setString(1,user_id);
	ps.executeUpdate();
	
	
	conn_mysqlv.close();
	
	session.setAttribute("ID",user_id);		
	
	
}catch(Exception e){
	e.printStackTrace();
}

response.sendRedirect("purchaseInsert_04.jsp");




%>

</body>
</html>