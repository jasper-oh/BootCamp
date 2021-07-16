<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
 
    String url_mysql = "jdbc:mysql://127.0.0.1/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";

    
    
    String userid = request.getParameter("id");
 	
    
    
    
    
    
    String id_mysql = "root";
    String pw_mysql = "qwer1234";
    
    
    
    
    String strName = null;
    String strPhone = null;
    String strAddress = null;
    
    
    
    try{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysqlv.createStatement();
		
	    String whereStatement = "select name, tel, address from purchaseinfo where userid = ?";
		PreparedStatement ps = conn_mysqlv.prepareStatement(whereStatement);
		ps.setString(1,userid);
		
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()){
			
			
			strName = rs.getString(1);
			strPhone = rs.getString(2);
			strAddress = rs.getString(3);
		}
		conn_mysqlv.close();
		
		
}catch(Exception e){
	e.printStackTrace();
}

    	
    
    response.sendRedirect("purchaseInsert_03.jsp");
    
	
  %>
  
  <form action="purchaseInsert_03.jsp" method="post">
		
		사용자 ID : <input type="text" name="userid" size="10" value=<%=userid %> readonly="readonly">
		성명 : <input type="text" name="name" size="10" value=<%=strName %>>
		전화번호 : <input type="text" name="phone" size="10" value=<%=strPhone %>>
		주소 : <input type="text" name="address" size="10" value=<%=strAddress %>>
		
		<input type="submit" value="Check!">
	</form>
</body>
</html>
