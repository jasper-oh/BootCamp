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

	<table>
		<tr>
			<td>
				<span>사용자 ID :</span> 
			</td>	
			<td>
				<%=session.getAttribute("ID") %>
			</td>
		</tr>
		<tr>
			<td>
				<span> 성명 : </span>
			</td>
			<td>
				<%=session.getAttribute("NEWNAME")%>
			</td> 
		</tr>
		
		<tr>
			<td>
				<span>전화번호 :</span> 
			</td>
			 <td>
				 <%=session.getAttribute("NEWPHONE") %>
			 </td>
		</tr>
		<tr>
			<td>
				<span>
					주소 : 
				</span>
			</td>
			<td>
				 <%=session.getAttribute("NEWADDRESS") %>
			</td>
		</tr>
	</table>



상기의 정보로 입력되었습니다. 감사합니다.

<% session.invalidate(); %>	
	

</body>
</html>