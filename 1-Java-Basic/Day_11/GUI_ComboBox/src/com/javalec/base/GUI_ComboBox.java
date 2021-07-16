package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI_ComboBox {

	private JFrame frmCombobox;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ComboBox window = new GUI_ComboBox();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String chosenF = comboBox_1.getSelectedItem().toString();
				textField_1.setText(chosenF);
				
			}
		});
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
		comboBox_1.setBounds(32, 33, 131, 27);
		frmCombobox.getContentPane().add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 32, 130, 26);
		frmCombobox.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 147, 130, 26);
		frmCombobox.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		
		JComboBox comboBox_2 = new JComboBox();
		
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String settingF = textField_2.getText();
				
				comboBox_2.addItem(settingF);
				
			}
			
		});
		
		
		

		comboBox_2.setBounds(230, 148, 130, 27);
		frmCombobox.getContentPane().add(comboBox_2);
		
		btnAdd.setBounds(32, 201, 117, 29);
		frmCombobox.getContentPane().add(btnAdd);
		
		
		
		
	}
}
