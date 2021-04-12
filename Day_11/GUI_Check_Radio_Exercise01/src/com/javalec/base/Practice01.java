package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.awt.event.ActionEvent;

public class Practice01 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JRadioButton radio_1;
	private JRadioButton radio_2;
	private JRadioButton radio_3;
	private JRadioButton radio_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice01 window = new Practice01();
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
	public Practice01() {
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
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getTextField_1());
		frame.getContentPane().add(getRadio_1());
		frame.getContentPane().add(getRadio_2());
		frame.getContentPane().add(getRadio_3());
		frame.getContentPane().add(getRadio_4());
		frame.getContentPane().add(getTextField_2());
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(23, 23, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(23, 72, 130, 26);
		}
		return textField_1;
	}
	private JRadioButton getRadio_1() {
		if (radio_1 == null) {
			radio_1 = new JRadioButton("ADD");
			radio_1.addActionListener( new EventButtonShit() );
			buttonGroup.add(radio_1);
			radio_1.setBounds(264, 34, 141, 23);
		}
		return radio_1;
	}
	private JRadioButton getRadio_2() {
		if (radio_2 == null) {
			radio_2 = new JRadioButton("MINUS");
			radio_2.addActionListener(new EventButtonShit());
			buttonGroup.add(radio_2);
			radio_2.setBounds(264, 59, 141, 23);
		}
		return radio_2;
	}
	private JRadioButton getRadio_3() {
		if (radio_3 == null) {
			radio_3 = new JRadioButton("MULTIPLY");
			radio_3.addActionListener(new EventButtonShit());
			buttonGroup.add(radio_3);
			radio_3.setBounds(264, 87, 141, 23);
		}
		return radio_3;
	}
	private JRadioButton getRadio_4() {
		if (radio_4 == null) {
			radio_4 = new JRadioButton("DIVIDE");
			radio_4.addActionListener(new EventButtonShit());
			buttonGroup.add(radio_4);
			radio_4.setBounds(264, 114, 141, 23);
		}
		return radio_4;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(23, 196, 151, 40);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	
	class EventButtonShit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
			
			String rButton = e.getActionCommand();
			
			if( rButton.equals("ADD")) {
				
				String result = Integer.toString(num1 + num2);
				
				textField_2.setText( textField.getText() + "/" + textField_1.getText() + "=" + result);
				
				
			}else if(rButton.equals("MINUS")) {

				
				String result = Integer.toString(num1 - num2);
				
				textField_2.setText( textField.getText() + "/" + textField_1.getText() + "=" + result);
				
				
			}else if(rButton.equals("MULTIPLY")) {
				
				String result = Integer.toString(num1 * num2);
				
				textField_2.setText( textField.getText() + "/" + textField_1.getText() + "=" + result);
				
			}else {
				
				
				Double divideResult = num1 / (num2 * 1.0);
				String result = String.format("%4.2f", divideResult);
				
				textField_2.setText( textField.getText() + "/" + textField_1.getText() + "=" + result);
			}
				
			
			
			
		}
		
		
		
	}
	
	
}
