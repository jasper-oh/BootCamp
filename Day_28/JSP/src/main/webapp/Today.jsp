<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<%
		GregorianCalendar now  = new GregorianCalendar();
	%>
	
	현재일은 <%=String.format("%TY년 %Tm월 %Td일",now,now,now)%>
	현재시각은 <%=String.format("%TH 시 %TM 분 %TS 초 입니다.",now,now,now) %>
