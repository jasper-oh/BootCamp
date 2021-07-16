<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 수정</title>
</head>
<body>
	<h4> 아이디를 수정후 확인 버튼을 누르세요</h4>
	
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String strUserid = null;
	
	/* DATABASE 에 넣기 */
	
	String url_mysql = "jdbc:mysql://127.0.0.1/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=FALSE";
	
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	
	String whereStatement = " select user_id from wtest where id = " + id;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysqlv = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysqlv.createStatement();
		
		ResultSet rs = stmt_mysql.executeQuery(whereStatement);
		
		while(rs.next()){
			strUserid = rs.getString(1);
		}
		conn_mysqlv.close();
		
		session.setAttribute("ID",id);
		/* id 를 찾았을 경우에만 session 에다가 넣는다. */		
		session.setAttribute("OLD",strUserid);
		
}catch(Exception e){
	e.printStackTrace();
}


%>	
	<form action="updateTest_03.jsp" method="post">
		
		사용자 ID : <input type="text" name="userid" size="10" value=<%=strUserid %>>
		
		<input type="submit" value="Check!">
	</form>

</body>
</html>