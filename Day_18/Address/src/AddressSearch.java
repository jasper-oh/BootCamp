
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddressSearch {
	

	private JFrame frmSearchAddress;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnSearch;
	private JScrollPane scrollPane_1;
	private JTable Inner_Table;
	private JLabel lblSeqno;
	private JTextField tfSeqno;
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblPhone;
	private JTextField tfPhone;
	private JLabel lblAddress;
	private JTextField tfAddress;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JLabel lblRelate;
	private JTextField tfRelate;
	
	//TODO DB ENV setting
	
	private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root"; // %root 가 없으면 연결 안된다. 
	private final String pw_mysql = "qwer1234";
	
	
	//TODO Table ENV setting
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JTextField tfCount;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressSearch window = new AddressSearch();
					window.frmSearchAddress.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddressSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearchAddress = new JFrame();
		frmSearchAddress.getContentPane().setEnabled(false);
		frmSearchAddress.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});
		frmSearchAddress.setTitle("Search AddressBook");
		frmSearchAddress.setBounds(100, 100, 595, 513);
		frmSearchAddress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchAddress.getContentPane().setLayout(null);
		frmSearchAddress.getContentPane().add(getCbSelection());
		frmSearchAddress.getContentPane().add(getTfSelection());
		frmSearchAddress.getContentPane().add(getBtnSearch());
		frmSearchAddress.getContentPane().add(getScrollPane_1());
		frmSearchAddress.getContentPane().add(getLblSeqno());
		frmSearchAddress.getContentPane().add(getTfSeqno());
		frmSearchAddress.getContentPane().add(getLblName());
		frmSearchAddress.getContentPane().add(getTfName());
		frmSearchAddress.getContentPane().add(getLblPhone());
		frmSearchAddress.getContentPane().add(getTfPhone());
		frmSearchAddress.getContentPane().add(getLblAddress());
		frmSearchAddress.getContentPane().add(getTfAddress());
		frmSearchAddress.getContentPane().add(getLblEmail());
		frmSearchAddress.getContentPane().add(getTfEmail());
		frmSearchAddress.getContentPane().add(getLblRelate());
		frmSearchAddress.getContentPane().add(getTfRelate());
		frmSearchAddress.getContentPane().add(getTfCount());
		frmSearchAddress.getContentPane().add(getLblNewLabel());
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeAction();
			}
		});
		btnChange.setBounds(372, 433, 93, 27);
		frmSearchAddress.getContentPane().add(btnChange);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteAction();
			}
		});
		btnDelete.setBounds(475, 432, 100, 29);
		frmSearchAddress.getContentPane().add(btnDelete);
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"Name", "Address", "Relate"}));
			cbSelection.setBounds(22, 29, 100, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(129, 28, 291, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//TODO April 21st
					conditionQuery();
				}
			});
			btnSearch.setBounds(443, 28, 117, 29);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(50, 68, 510, 177);
			scrollPane_1.setViewportView(getInner_Table());
		}
		return scrollPane_1;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					tableClick();
					
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			// TODO Outer_Table Concept!!
			Inner_Table.setModel(Outer_Table);
		}
		return Inner_Table;
	}
	private JLabel getLblSeqno() {
		if (lblSeqno == null) {
			lblSeqno = new JLabel("Seq No");
			lblSeqno.setBounds(50, 257, 61, 16);
		}
		return lblSeqno;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(120, 252, 72, 27);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(50, 290, 61, 16);
		}
		return lblName;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(120, 285, 130, 26);
		}
		return tfName;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(50, 323, 61, 16);
		}
		return lblPhone;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(120, 318, 130, 26);
		}
		return tfPhone;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(50, 356, 61, 16);
		}
		return lblAddress;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(120, 351, 318, 26);
		}
		return tfAddress;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(50, 394, 61, 16);
		}
		return lblEmail;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(120, 389, 216, 21);
		}
		return tfEmail;
	}
	private JLabel getLblRelate() {
		if (lblRelate == null) {
			lblRelate = new JLabel("Relate");
			lblRelate.setBounds(50, 432, 61, 16);
		}
		return lblRelate;
	}
	private JTextField getTfRelate() {
		if (tfRelate == null) {
			tfRelate = new JTextField();
			tfRelate.setColumns(10);
			tfRelate.setBounds(120, 427, 130, 26);
		}
		return tfRelate;
	}
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setEditable(false);
			tfCount.setBounds(488, 257, 72, 21);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Total");
			lblNewLabel.setBounds(443, 257, 41, 16);
		}
		return lblNewLabel;
	}
	
//	TODO ScreenTable INIT
	private void tableInit() {
//		TODO 테이블에서 이 정보 만을 보여주겠다. 
		Outer_Table.addColumn("Order");
		Outer_Table.addColumn("Name");
		Outer_Table.addColumn("Phone");
		Outer_Table.addColumn("Relate");
		
//		TODO 테이블 보여줄 정보 갯수 보여주기
		Outer_Table.setColumnCount(4);
		
		int i = Outer_Table.getRowCount();
		for(int j = 0 ; j < i ; j ++) {
//			TODO 데이터가 0번으로 계속 갱신되기 떄문에 0번으로 해야 모두 지워지게 된다 ! 
			Outer_Table.removeRow(0);
		}
		
		
//		각 행의 크기 못 움직이게 한다.
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
		
		int vColIndex =  0;
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 100; 
		col.setPreferredWidth(width);
		
		vColIndex =  1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100; 
		col.setPreferredWidth(width);
		
		vColIndex =  2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100; 
		col.setPreferredWidth(width);
		
		vColIndex =  3;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200; 
		col.setPreferredWidth(width);
		
	}
	private void clearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfAddress.setText("");
		tfPhone.setText("");
		tfEmail.setText("");
		tfRelate.setText("");
		tfCount.setText("");
	}
	
	
	private void searchAction() {
		String query = "select seqno,name,telno,relation from userinfo ";
		
		int dataCount = 0;
		
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();
	            
	            ResultSet rs = stmt_mysql.executeQuery(query);
	            
//	            TODO 다음에 뭐가 있는지  확인하는 조건문 rs.next()
	            while(rs.next()) {
	            	String[] qTxt = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
	            	Outer_Table.addRow(qTxt);
	            	dataCount++;
	            }
	            
	            conn_mysql.close();
	            tfCount.setText(Integer.toString(dataCount));
	            
	        }catch(Exception e) {
	            e.printStackTrace();
	        }        
	    }
// Table Click
	private void tableClick() {
		int i = Inner_Table.getSelectedRow();
		String wkseq = (String) Inner_Table.getValueAt(i, 0);
		
		String query1 = "select seqno,name,telno,address,email,relation from userinfo where seqno = "+ wkseq;
	
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	         Statement stmt_mysql = conn_mysql.createStatement();
	            
	         ResultSet rs = stmt_mysql.executeQuery(query1);
	         
	         if(rs.next()) {
	        	 
	        	 String seqno = rs.getString(1);
	        	 tfSeqno.setText(seqno);	
	        	 String name = rs.getString(2);
	        	 tfName.setText(name);
	        	 String phone = rs.getString(3);
	        	 tfPhone.setText(phone);
	        	 String address = rs.getString(4);
	        	 tfAddress.setText(address);
	        	 String eaddress = rs.getString(5);
	        	 tfEmail.setText(eaddress);
	        	 String relate = rs.getString(6);
	        	 tfRelate.setText(relate);
	         }
	         conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryColumn = "";
		
		switch(i) {
		
		case 0:
			conditionQueryColumn = "name";
			break; 
		case 1:
			conditionQueryColumn = "address";
			break; 
		case 2:
			conditionQueryColumn = "relation";
			break; 
		default:
			break; 
		}
		
		//Unit Test
//		System.out.print(conditionQueryColumn);
		
		// Erase Table
		tableInit();
		//Erase Column
		clearColumn();
		
		// 검색하기
		conditionQueryAction(conditionQueryColumn);
		
	}
	private void conditionQueryAction(String cqc) {
		String query = "select seqno,name,telno,relation from userinfo where " + cqc;
		
		String query1 = " like '%" + tfSelection.getText() + "%'";

		//		TODO Unit Test - Query
//		System.out.print(query + query1);
		
		int dataCount = 0;
		
		
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();
	            
	            ResultSet rs = stmt_mysql.executeQuery(query + query1);
	            
//	            TODO 다음에 뭐가 있는지  확인하는 조건문 rs.next()
	            while(rs.next()) {
	            	String[] qTxt = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
	            	Outer_Table.addRow(qTxt);
	            	dataCount++;
	            }
	            
	            conn_mysql.close();
	            tfCount.setText(Integer.toString(dataCount));
	            
	        }catch(Exception e) {
	            e.printStackTrace();
	        }        
		
		
	}
	
	private void deleteAction() {
		int i = Inner_Table.getSelectedRow();
		String wkseq = (String) Inner_Table.getValueAt(i, 0);
		
		String query = "delete from userinfo where ";
		String query1 = "seqno = " + wkseq;
		
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	         Statement stmt_mysql = conn_mysql.createStatement();
	            
	         int rs = stmt_mysql.executeUpdate(query + query1);
	         
	         tableInit();
	         clearColumn();
	         searchAction();
	         
	         conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void changeAction() {
		int i = Inner_Table.getSelectedRow();
		String wkseq = (String) Inner_Table.getValueAt(i, 0);
		
		String query = "update userinfo set ";
		
		String tName = tfName.getText();
		String tPhone = tfPhone.getText();
		String tAddress = tfAddress.getText();
		String tEmail = tfEmail.getText();
		String tRelation = tfRelate.getText();
		
//		System.out.println(tName + tPhone + tAddress + tEmail + tRelation);
		
		String queryName = "name = '" +tName + "', ";
		String queryPhone = "telno = '" + tPhone + "', ";
		String queryAddress = "address = '" + tAddress +"', ";
		String queryEmail = "email = '" + tEmail + "', ";
		String queryRelation = "relation = '" + tRelation;
		String queryWhere = "' where seqno = " + wkseq;
		
//		System.out.println(query + queryName + queryPhone + queryAddress + queryEmail + queryRelation + queryWhere);
		
		String finalQuery = query + queryName + queryPhone + queryAddress + queryEmail + queryRelation + queryWhere;
		System.out.println(finalQuery);
		
				
		
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	         Statement stmt_mysql = conn_mysql.createStatement();
	            
	         int rs = stmt_mysql.executeUpdate(finalQuery);
	         
	         tableInit();
	         clearColumn();
	         searchAction();
	         
	         conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}