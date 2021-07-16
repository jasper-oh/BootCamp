package com.jsplec.bbs.dao;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

import com.jsplec.bbs.dto.BDto;

public class BDao {
	
	DataSource dataSource;
	
	public BDao(){
		try {
//			context.xml 과 연결됨
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
			

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	나는 한번에 여러가지 타입을 받겠다.
	public ArrayList<BDto> list(){
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select  bId, bName, bTitle , bContent, bDate from mvc_board";
			prepareStatement = connection.prepareStatement(query);
			
			resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {
				int bid = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				BDto dto = new BDto(bid, bName, bTitle, bContent, bDate);
				dtos.add(dto);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

		return dtos;
	}
	
	public void write(String bName, String bTitle, String bContent) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into mvc_board (bName, bTitle, bContent, bDate) values (?,?,?,now())";
			prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setString(1, bName);
			prepareStatement.setString(2, bTitle);
			prepareStatement.setString(3, bContent);
			
			prepareStatement.executeUpdate()
;			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	public BDto contentView(String strID) {
		BDto dto = null;
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from mvc_board where bId = ?";
			prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setInt(1,Integer.parseInt(strID));
			
			resultSet = prepareStatement.executeQuery();
			
			if(resultSet.next()) {
				int bid = resultSet.getInt("bId");
				String bName = resultSet.getString("bName");
				String bTitle = resultSet.getString("bTitle");
				String bContent = resultSet.getString("bContent");
				Timestamp bDate = resultSet.getTimestamp("bDate");
				
				dto = new BDto(bid, bName, bTitle, bContent, bDate);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return dto;
		
	}
	
	public void update(String strID ,String bName ,String bTitle ,String bContent) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update mvc_board set bName = ? , bTitle= ? , bContent = ? where bId= ?;";
			prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setString(1, bName);
			prepareStatement.setString(2, bTitle);
			prepareStatement.setString(3, bContent);
			prepareStatement.setInt(4, Integer.parseInt(strID));
			
			prepareStatement.executeUpdate()
;			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
	
	}
	
	
	
	public void delete(String strID) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "delete from mvc_board where bId = ?";
			prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setInt(1, Integer.parseInt(strID));
			
			
			prepareStatement.executeUpdate();			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(prepareStatement != null) prepareStatement.close();
				if(connection != null) connection.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}		
		
		
	}
	
	
	

} //--endLine
