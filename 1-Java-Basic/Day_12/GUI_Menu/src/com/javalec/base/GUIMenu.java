package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIMenu {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenu menuCalc;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem menuAdd;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMenu window = new GUIMenu();
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
	public GUIMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(getMenuBar());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getTextField_1());
		frame.getContentPane().add(getTextField_2());
		frame.getContentPane().add(getBtnNewButton());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setForeground(Color.WHITE);
			menuBar.add(getMenuFile());
			menuBar.add(getMenuCalc());
		}
		return menuBar;
	}
	private JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu("File");
			menuFile.setForeground(Color.BLACK);
			menuFile.add(getMntmNewMenuItem());
		}
		return menuFile;
	}
	private JMenu getMenuCalc() {
		if (menuCalc == null) {
			menuCalc = new JMenu("Calc");
			menuCalc.addActionListener(new ActionListen());
			menuCalc.add(getMenuAdd());
		}
		return menuCalc;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("open");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMenuAdd() {
		if (menuAdd == null) {
			menuAdd = new JMenuItem("Add");
		}
		return menuAdd;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(34, 34, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(34, 84, 130, 26);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(34, 157, 130, 26);
		}
		return textField_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListen());
				
			btnNewButton.setBounds(189, 157, 117, 29);
		}
		return btnNewButton;
	}
	
	
	class ActionListen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
			textField_2.setText(Integer.toString(num1 + num2));
			
		}
		
		
		
		
	}
	
	
	
	
}
