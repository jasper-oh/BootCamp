package com.test.design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Announcement {

	private JFrame frame;
	private JTable table;
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Announcement window = new Announcement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Announcement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(0, 0, 300, 572);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("作");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(6, 4, 24, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BUN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(169, 169, 169));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(73, 6, 20, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TEAM3");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(211, 211, 211));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(29, 4, 43, 15);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(30, 18, 39, 1);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(29, 54, 90, 115);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("image");
		lblNewLabel_3.setBounds(26, 49, 46, 16);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(0, 51, 102));
		
		JLabel lblNewLabel_3_1 = new JLabel("ID :  Jasper");
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(131, 66, 76, 16);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(new Color(245, 245, 245));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Name :  Jasper Oh");
		lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_3_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_3_1_1.setBounds(131, 94, 120, 16);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("MBTI :  ENFJ");
		lblNewLabel_3_1_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_3_1_1_1.setBounds(131, 122, 120, 16);
		panel.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Announcement");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.setBounds(29, 232, 245, 46);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("GitHub :  jasper-oh");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_3_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_3_1_1_1_1.setBounds(131, 150, 122, 16);
		panel.add(lblNewLabel_3_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Find Teammate");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1_1_1.setOpaque(true); 
				btnNewButton_1_1_1.setBorderPainted(false);
				
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1_1_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1_1_1.setBounds(29, 348, 245, 46);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Check Profile");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1_1.setOpaque(true); 
				btnNewButton_1_1.setBorderPainted(false);
				
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1_1.setBounds(29, 290, 245, 46);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Teammate Review");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1_1_1_1_1.setOpaque(true); 
				btnNewButton_1_1_1_1_1.setBorderPainted(false);
				
				
			}
		});
		btnNewButton_1_1_1_1_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1_1_1_1_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1_1_1_1_1.setBounds(29, 464, 245, 46);
		panel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Team Status");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1_1_1_1.setOpaque(true); 
				btnNewButton_1_1_1_1.setBorderPainted(false);
				
			}
		});
		btnNewButton_1_1_1_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1_1_1_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1_1_1_1.setBounds(29, 406, 245, 46);
		panel.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Announcement");
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_2.setBounds(338, 26, 206, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		table.setBackground(Color.WHITE);
		table.setForeground(new Color(0, 51, 102));
		table.setBounds(338, 70, 425, 200);
		frame.getContentPane().add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(338, 310, 425, 240);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(15, 58, 395, 161);
		panel_3.add(editorPane);
		editorPane.setForeground(new Color(0, 51, 102));
		editorPane.setText("4/23 오후 5시, 자바 스윙 프로젝트 준비 발표합니다.\n프로젝트의 목적, ERD 작성해서 발표하세요! ^^\n");
		
		JLabel lblNewLabel_4 = new JLabel("4/23 자바스윙 프로젝트 준비 발표");
		lblNewLabel_4.setBounds(15, 6, 346, 28);
		panel_3.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setForeground(new Color(0, 51, 102));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 34, 413, 12);
		panel_3.add(separator);
	}
	
	
}