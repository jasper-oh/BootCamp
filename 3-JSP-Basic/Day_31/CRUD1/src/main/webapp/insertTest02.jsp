<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	String userid = request.getParameter("userid");
    
    
    /* DATABASE 에 넣기 */
    
    String url_mysql = "jdbc:mysql://127.0.0.1/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";
    
    String id_mysql = "root";
    String pw_mysql = "qwer1234";
    
    PreparedStatement ps = null;
    
    try{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
    	
    	Statement stmt_mysql = conn_mysqlv.createStatement();
    	
    	String query1= "insert into wtest (user_id";
    	String query2 = ") values (?)";
    	
    	/*  보안 상으로 preparestatement 를 사용한다. 없이도 가능하긴 함*/
    	ps = conn_mysqlv.prepareStatement(query1 +query2);
    	
    	ps.setString(1, userid.trim());
    	ps.executeUpdate();
    	
    	conn_mysqlv.close();
    	
    	
    }catch(Exception e){
    	e.printStackTrace();
    }
    
    response.sendRedirect("insertTest03.jsp");
    %>