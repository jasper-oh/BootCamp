package com.javalec.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DbAction {

//	Field 
	private final String url_mysql =  ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	int seqno;
	String name; 
	String telno;
	String address;
	String email;
	String relation;

//	Construction
	
	public DbAction() {
		
		
		
	}
	
	
	public DbAction(int seqno, String name, String telno, String address, String email, String relation) {
	super();
	this.seqno = seqno;
	this.name = name;
	this.telno = telno;
	this.address = address;
	this.email = email;
	this.relation = relation;
}

	
public DbAction(int seqno) {
		super();
		this.seqno = seqno;
	}


//	Method
	
//	Insert Section
	
	public boolean insertAction(){
		
        PreparedStatement ps = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();

            String A = "insert into userinfo (name, telno, address, email, relation";
            String B = ") values (?,?,?,?,?)";

            ps = conn_mysql.prepareStatement(A+B);
            ps.setString(1, name.trim());
            ps.setString(2, telno.trim());
            ps.setString(3, address.trim());
            ps.setString(4, email.trim());
            ps.setString(5, relation.trim());
            ps.executeUpdate();

            conn_mysql.close();
            
            return true;
        } catch (Exception e){                    
            e.printStackTrace();
            return false;
        }
    
		
	}
	
	public ArrayList<Bean> selectList(){

		ArrayList<Bean> beanList = new ArrayList<Bean>();
		
		   String WhereDefault = "select seqno, name, telno, relation from userinfo ";
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();
	
	            ResultSet rs = stmt_mysql.executeQuery(WhereDefault);
	
	            while(rs.next()){
	               int wrkSeq = rs.getInt(1);
	               String wrkName = rs.getString(2);
	               String wrkTelno = rs.getString(3);
	               String wrkRelation = rs.getString(4);
	               
	               Bean bean = new Bean(wrkSeq, wrkName, wrkTelno ,wrkRelation);
	               beanList.add(bean);
	            }
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }

		return beanList;
	}
	
	
	public Bean TableClick() {
	
		Bean bean = null;
		
		String WhereDefault = "select seqno, name, telno, address, email, relation from userinfo "; 
        String WhereDefault2 = "where seqno = " ;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2 + seqno);

            while(rs.next()){
            	int wkseq = rs.getInt(1);
            	String wrkName = rs.getString(2);
            	String wrkTelno = rs.getString(3);
            	String wrkAddress= rs.getString(4);
            	String wrkEmail = rs.getString(5);
            	String wrkRelation = rs.getString(6);
            	
            	bean = new Bean(wkseq, wrkName, wrkTelno, wrkAddress, wrkEmail, wrkRelation);
            }
            conn_mysql.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
		
		return bean;

	}
	
	
		 
	public boolean deleteAction() {
		
		PreparedStatement ps = null;
		 
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
           @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();

           String A = "delete from userinfo where seqno = ? ";

           ps = conn_mysql.prepareStatement(A);
           
           ps.setInt(1, seqno);
           ps.executeUpdate();

           conn_mysql.close();
           
           return true;
       } catch (Exception e){
           e.printStackTrace();
           return false;
       }
         
		
	}
	
	
	public boolean updateAction(){
		
      PreparedStatement ps = null;
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
          @SuppressWarnings("unused")
		  Statement stmt_mysql = conn_mysql.createStatement();

          String A = "update userinfo set name = ?, telno = ?, address = ?, email = ?, relation = ? ";
          String B = " where seqno = ? ";

          ps = conn_mysql.prepareStatement(A+B);
          
          ps.setString(1, name);
          ps.setString(2, telno);
          ps.setString(3, address);
          ps.setString(4, email);
          ps.setString(5, relation);
          ps.setInt(6, seqno);
          ps.executeUpdate();

          conn_mysql.close();
          return true;
      } catch (Exception e){
          e.printStackTrace();
          return false;
      }
  
	}
	
	public ArrayList<Bean> ConditionAction(String cqc , String tfs) {
		
	  ArrayList<Bean> beanList = new ArrayList<Bean>();
		
      String WhereDefault = "select seqno, name, telno, relation from userinfo where " + cqc;
      String WhereDefault2 = " like '%" + tfs + "%'";
      
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
          Statement stmt_mysql = conn_mysql.createStatement();

          ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);

          while(rs.next()){
              int wrkSeq = rs.getInt(1);
              String wrkName = rs.getString(2);
              String wrkTelno = rs.getString(4);
              String wrkRelation = rs.getString(4);
              
              Bean bean = new Bean(wrkSeq, wrkName,wrkTelno,wrkRelation);
              beanList.add(bean);
          }
          conn_mysql.close();
      }
      catch (Exception e){
          e.printStackTrace();
      }
		
      return beanList;
	}
	
}
