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

	<h4> 고객 명단 수정 및 삭제 </h4>

<%
	request.setCharacterEncoding("utf-8");


	
	String userid = request.getParameter("userid");
	
	
	/* DATABASE 에 넣기 */
	
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
		
		String whereStatement = "select name, tel , address from purchaseinfo where userid = ?";
		
		ps = conn_mysqlv.prepareStatement(whereStatement);
		ps.setString(1,userid);
		
		
		rs = ps.executeQuery();
		
		while(rs.next()){
			name = rs.getString(1);
			tel = rs.getString(2);
			address = rs.getString(3);
			
		}
		conn_mysqlv.close();
		
		
}catch(Exception e){
	e.printStackTrace();
}
%>	
	
<form action="purchaserSelect_03.jsp" method="post">
	
	userId : <input type="text" name="userid" size =10 value = "<%=userid %>" readonly="readonly"><br>
	name : <input type="text" name="name" size =10 value = "<%=name %>" ><br>
	phone : <input type="text" name="tel" size =40 value = "<%=tel %>"><br>
	address : <input type="text" name="address" size =50 value = "<%=address %>" ><br>
	
	<input type="submit" value="수정">
</form>
<form action="purchaserSelect_04.jsp" method="post"></form>
	<input type="submit" value="삭제">
	 <input type="hidden" name="userid" size =10 value = "<%=userid %>" readonly="readonly"><br>
	<input type="hidden" name="name" size =10 value = "<%=name %>" ><br>
	<input type="hidden" name="tel" size =40 value = "<%=tel %>"><br>
	<input type="hidden" name="address" size =50 value = "<%=address %>" ><br>
	
</body>
</html>