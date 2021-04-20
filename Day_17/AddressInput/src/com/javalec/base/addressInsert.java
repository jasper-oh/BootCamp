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
import java.awt.event.ActionEvent;

public class addressInsert {

	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root"; // %root 가 없으면 연결 안된다. 
	private final String pw_mysql = "qwer1234";
	
	private JFrame frmAddressbook;
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblAddress;
	private JLabel lblEmail;
	private JLabel lblRelate;
	private JTextField tfName;
	private JTextField tfPhone;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelate;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addressInsert window = new addressInsert();
					window.frmAddressbook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddressbook = new JFrame();
		frmAddressbook.setTitle("AddressBook");
		frmAddressbook.setBounds(100, 100, 450, 300);
		frmAddressbook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddressbook.getContentPane().setLayout(null);
		frmAddressbook.getContentPane().add(getLblName());
		frmAddressbook.getContentPane().add(getLblPhone());
		frmAddressbook.getContentPane().add(getLblAddress());
		frmAddressbook.getContentPane().add(getLblEmail());
		frmAddressbook.getContentPane().add(getLblRelate());
		frmAddressbook.getContentPane().add(getTfName());
		frmAddressbook.getContentPane().add(getTfPhone());
		frmAddressbook.getContentPane().add(getTfAddress());
		frmAddressbook.getContentPane().add(getTfEmail());
		frmAddressbook.getContentPane().add(getTfRelate());
		frmAddressbook.getContentPane().add(getBtnNewButton());
	}

	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(21, 27, 42, 16);
		}
		return lblName;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(21, 55, 61, 16);
		}
		return lblPhone;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(21, 83, 61, 16);
		}
		return lblAddress;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(21, 115, 61, 16);
		}
		return lblEmail;
	}
	private JLabel getLblRelate() {
		if (lblRelate == null) {
			lblRelate = new JLabel("Relate");
			lblRelate.setBounds(21, 144, 61, 16);
		}
		return lblRelate;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(87, 22, 130, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(87, 50, 130, 26);
		}
		return tfPhone;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(87, 83, 130, 26);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(87, 111, 130, 26);
		}
		return tfEmail;
	}
	private JTextField getTfRelate() {
		if (tfRelate == null) {
			tfRelate = new JTextField();
			tfRelate.setColumns(10);
			tfRelate.setBounds(87, 143, 130, 26);
		}
		return tfRelate;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Insert");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int i_chk = insertFieldCheck();
					if(i_chk == 0) {
						insertInformation();
					}
				}

				
			});
			btnNewButton.setBounds(305, 215, 117, 29);
		}
		return btnNewButton;
	}
	
	private void insertInformation() {
		
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
			msg ="Relate ";
			tfRelate.requestFocus();
		}
		if (i>0) {
			JOptionPane.showMessageDialog(null, msg + " check please");
		}
	return i;
	}
	
	
	
}
