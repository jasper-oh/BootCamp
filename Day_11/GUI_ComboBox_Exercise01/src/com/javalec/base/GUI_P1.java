package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUI_P1 {

	private JFrame frame;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_P1 window = new GUI_P1();
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
	public GUI_P1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getComboBox());
		frame.getContentPane().add(getComboBox_1());
		frame.getContentPane().add(getComboBox_2());
		frame.getContentPane().add(getTextField());
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			
			List<Integer> ls = new ArrayList<Integer>();
			
			for(int i = 2; i < 10 ; i++) {
				ls.add(i);
			}
			
			comboBox = new JComboBox(ls.toArray());
			
			comboBox.addActionListener(new CalculatorEvent());
			comboBox.setBounds(24, 24, 93, 27);
		}
		return comboBox;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/"}));
			
			comboBox_1.addActionListener(new CalculatorEvent());
			comboBox_1.setBounds(129, 24, 93, 27);
		}
		return comboBox_1;
	}
	private JComboBox getComboBox_2() {
		if (comboBox_2 == null) {
			List<Integer> ls1 = new ArrayList<Integer>();
			
			for(int i = 1; i < 10 ; i++) {
				ls1.add(i);
			}
			
			comboBox_2 = new JComboBox(ls1.toArray());
			
			comboBox_2.addActionListener(new CalculatorEvent());
			comboBox_2.setBounds(230, 24, 93, 27);
		}
		return comboBox_2;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(335, 23, 88, 27);
			textField.setColumns(10);
		}
		return textField;
	}
	
	
	class CalculatorEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int num1Index = comboBox.getSelectedIndex();
			int iterator = comboBox_1.getSelectedIndex();
			int num2Index = comboBox_2.getSelectedIndex();
			int sum = 0;
			int num1,num2;
			
			switch(iterator) {
			case(0) :
				num1 = (int) comboBox.getItemAt(num1Index);
				num2 = (int) comboBox_2.getItemAt(num2Index);
				sum = num1 + num2;
				break;
			case(1) :
				num1 = (int) comboBox.getItemAt(num1Index);
				num2 = (int) comboBox_2.getItemAt(num2Index);
				sum = num1 - num2;
				break;
				
			case(2) :
				num1 = (int) comboBox.getItemAt(num1Index);
				num2 = (int) comboBox_2.getItemAt(num2Index);
				sum = num1 * num2;
				break;
				
			case(3) :
				num1 = (int) comboBox.getItemAt(num1Index);
				num2 = (int) comboBox_2.getItemAt(num2Index);
				sum = num1 * num2;
				break;
			
			}
			
			textField.setText(Integer.toString(sum));
			
		}
		
		
		
		
	}
}
