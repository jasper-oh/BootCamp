package com.test.design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmteam;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmteam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmteam = new JFrame();
		frmteam.getContentPane().setForeground(Color.WHITE);
		frmteam.setTitle("작TEAM3분");
		frmteam.getContentPane().setBackground(Color.WHITE);
		frmteam.setBounds(100, 100, 800, 600);
		frmteam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmteam.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 572);
		panel.setBackground(new Color(51, 102, 153));
		frmteam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("作");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
		lblNewLabel.setForeground(new Color(211, 211, 211));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 166, 71, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BUN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(138, 314, 60, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TEAM3");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_1_1.setBounds(53, 230, 179, 60);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(85, 277, 113, 3);
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SIGN IN");
		lblNewLabel_2.setBounds(400, 100, 206, 25);
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frmteam.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(400, 200, 300, 50);
		textField.setBackground(Color.WHITE);
		frmteam.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("User ID");
		lblNewLabel_3.setBounds(400, 182, 61, 16);
		lblNewLabel_3.setForeground(new Color(0, 51, 102));
		frmteam.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setBounds(400, 272, 61, 16);
		lblNewLabel_3_1.setForeground(new Color(0, 51, 102));
		frmteam.getContentPane().add(lblNewLabel_3_1);
		
		// 버튼 색상 변경
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(400, 375, 300, 50);
		frmteam.getContentPane().add(btnNewButton);
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(new Color(51, 102, 153));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 290, 300, 50);
		frmteam.getContentPane().add(passwordField);
		
		JButton btnIdPw = new JButton("find id / pw");
		btnIdPw.setForeground(new Color(0, 51, 102));
		btnIdPw.setBackground(new Color(51, 102, 153));
		btnIdPw.setBounds(552, 426, 148, 50);
		frmteam.getContentPane().add(btnIdPw);
		
		JButton btnSign = new JButton("Sign up");
		btnSign.setForeground(new Color(0, 51, 102));
		btnSign.setBackground(new Color(51, 102, 153));
		btnSign.setBounds(400, 426, 148, 50);
		frmteam.getContentPane().add(btnSign);
	}
}