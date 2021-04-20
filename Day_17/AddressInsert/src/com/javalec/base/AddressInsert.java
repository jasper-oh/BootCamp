//NOT LAZY SYS
package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frmAddress;
	private JTextField tfName;

	//DATABASE ENV SETTING 
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root"; // %root 가 없으면 연결 안된다. 
	private final String pw_mysql = "qwer1234";
	
	
	private JTextField tfPhone;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelate;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
					window.frmAddress.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddress = new JFrame();
		frmAddress.setTitle("AddressBook");
		frmAddress.setBounds(100, 100, 450, 300);
		frmAddress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddress.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(25, 33, 69, 22);
		frmAddress.getContentPane().add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(86, 31, 130, 26);
		frmAddress.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i_chk = insertFieldCheck();
				if(i_chk == 0) {
				insertAction();
				}
			}
		});
		btnInsert.setBounds(294, 221, 117, 29);
		frmAddress.getContentPane().add(btnInsert);
		
		JLabel lblNewLabel_1 = new JLabel("Phone");
		lblNewLabel_1.setBounds(25, 72, 49, 16);
		frmAddress.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setBounds(25, 117, 61, 16);
		frmAddress.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(25, 162, 61, 16);
		frmAddress.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Relationship");
		lblNewLabel_4.setBounds(25, 210, 84, 16);
		frmAddress.getContentPane().add(lblNewLabel_4);
		
		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(86, 67, 130, 26);
		frmAddress.getContentPane().add(tfPhone);
		
		tfAddress = new JTextField();
		tfAddress.setColumns(10);
		tfAddress.setBounds(86, 112, 130, 26);
		frmAddress.getContentPane().add(tfAddress);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(86, 157, 130, 26);
		frmAddress.getContentPane().add(tfEmail);
		
		tfRelate = new JTextField();
		tfRelate.setColumns(10);
		tfRelate.setBounds(110, 205, 130, 26);
		frmAddress.getContentPane().add(tfRelate);
	}
	
	// User info insert 
	private void insertAction() {		
//			아래 물음표를 사용하기 위해서 정의한 PreparedStatement
		PreparedStatement ps = null;
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();

			
			String query = "insert into userinfo (name,telno,address,email,relation) values (?,?,?,?,?) ";
			ps = conn_mysql.prepareStatement(query);
						
			
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfPhone.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelate.getText().trim());
		
			ps.executeUpdate(); // 입력끝 
			
			
			
//			DB CONNECTION CANCEL
			conn_mysql.close();
			
			JOptionPane.showMessageDialog(null, tfName.getText() + " information is insert");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
	private int insertFieldCheck() {
		int i = 0;
		String msg = "";
		if(tfName.getText().isEmpty()) {
			i++;
			msg ="name ";
			tfName.requestFocus();
		}
		if(tfPhone.getText().isEmpty()) {
			i ++;
			msg ="Phone ";
			tfPhone.requestFocus();
		}
		if(tfAddress.getText().isEmpty()) {
			i++;
			msg ="Address ";
			tfName.requestFocus();
		}
		if(tfEmail.getText().isEmpty()) {
			i++;
			msg ="Email ";
			tfEmail.requestFocus();
		}
		if(tfRelate.getText().isEmpty()) {
			i++;
			msg ="n ";
			tfRelate.requestFocus();
		}
		if (i>0) {
			JOptionPane.showMessageDialog(null, msg + " check please");
		}
	
	return i;
	}
	
	
	
	private void insertFieldCheckVer1() {
//		TODO Using ArrayList
//		ArrayList<JTextField> tf = new ArrayList<JTextField>();
//		ArrayList<JLabel> jl = new ArrayList<JLabel>();
//		jl.add();
//		jl.add(tfPhone);
//		jl.add(tfAddress);
//		jl.add(tfEmail);
//		jl.add(tfRelate);
//		
//		for(int i = 0; i < jl.size(); i++) {
//			if(tb.get(i).getText().isEmpty()){
//			JOptionPane.showMessageDialog(null, (i+1) + "field is empty");
//			}
//		}
//		
		

	}
}