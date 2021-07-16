<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<span> 아이디 : <%=session.getAttribute("ID") %> </span>
<span> 이름 : <%=session.getAttribute("NAME") %> </span>
<span> 전화번호 : <%=session.getAttribute("PHONE") %> </span>
<span> 주소 : <%=session.getAttribute("ADDRESS") %> </span>

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
				<%=session.getAttribute("NAME")%>
			</td> 
		</tr>
		
		<tr>
			<td>
				<span>전화번호 :</span> 
			</td>
			 <td>
				 <%=session.getAttribute("PHONE") %>
			 </td>
		</tr>
		<tr>
			<td>
				<span>
					주소 : 
				</span>
			</td>
			<td>
				 <%=session.getAttribute("ADDRESS") %>
			</td>
		</tr>
	</table>



상기의 정보로 입력되었습니다. 감사합니다.

<% session.invalidate(); %>	
	

</body>
</html>