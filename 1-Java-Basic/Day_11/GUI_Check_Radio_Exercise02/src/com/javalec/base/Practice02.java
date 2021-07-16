package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Practice02 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	ArrayList<JCheckBox> checkArr = new ArrayList<>();
	ArrayList<JLabel> labelArr = new ArrayList<>();
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice02 window = new Practice02();
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
	public Practice02() {
		
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
		frame.getContentPane().add(getChckbxNewCheckBox());
		frame.getContentPane().add(getChckbxNewCheckBox_1());
		frame.getContentPane().add(getChckbxNewCheckBox_2());
		frame.getContentPane().add(getChckbxNewCheckBox_3());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(30, 30, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(30, 73, 130, 26);
		}
		return textField_1;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("+");
			checkArr.add(chckbxNewCheckBox);  
			chckbxNewCheckBox.addActionListener( new CheckEvent() );
			chckbxNewCheckBox.setBounds(271, 31, 128, 23);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("-");
			checkArr.add(chckbxNewCheckBox_1);
			chckbxNewCheckBox_1.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_1.setBounds(271, 55, 128, 23);
		}
		return chckbxNewCheckBox_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("x");
			checkArr.add(chckbxNewCheckBox_2);
			chckbxNewCheckBox_2.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_2.setBounds(271, 76, 128, 23);
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("/");
			checkArr.add(chckbxNewCheckBox_3);
			chckbxNewCheckBox_3.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_3.setBounds(271, 100, 128, 23);
		}
		return chckbxNewCheckBox_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel();
			labelArr.add(lblNewLabel);
			lblNewLabel.setBounds(30, 160, 130, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel();
			labelArr.add(lblNewLabel_1);
			lblNewLabel_1.setBounds(30, 188, 130, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel();
			labelArr.add(lblNewLabel_2);
			lblNewLabel_2.setBounds(30, 215, 130, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel();
			labelArr.add(lblNewLabel_3);
			lblNewLabel_3.setBounds(30, 243, 130, 16);
		}
		return lblNewLabel_3;
	}
	
	class CheckEvent implements ActionListener {
		String[] operator = {"+","-","x","/"};
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(textField.getText().equals("")) {
				textField.setText("0");
			}
			if(textField_1.getText().equals("")){
				textField_1.setText("0");
			}
			
			
			
			for(int i = 0 ; i < checkArr.size() ; i ++) {
				if(checkArr.get(i).isSelected() == true) {
					labelArr.get(i).setText(setLabel(operator[i]));
				}else {
					labelArr.get(i).setText("");
				}
				
			}
		
		}
		
		String setLabel(String operator) {
			int num1 =Integer.parseInt(textField.getText());
			int num2 =Integer.parseInt(textField_1.getText());
			int result = 0; 
			
			switch(operator) {
			case("+") : 
				result = num1 + num2;
				break;
			case("-") : 
				result = num1 - num2;
				break;
			case("x") : 
				result = num1 * num2;
				break;
			case("/") : 
				if( num1 == 0 || num2 == 0) {
					return num1 + operator + num2 + " =  0";				
				}
				double doubleResult = num1 / (num2 * 1.0);
				doubleResult = Math.round(doubleResult*1000)/1000.0;
				
				return num1 + operator + num2 + " = " + Double.toString(doubleResult);
				
			}

			return num1 + operator + num2 +"=" + Integer.toString(result);
			
		}
		
		void setLabelLocation() {
			for(int i = 0 ; i < 3;i++) {
				if(labelArr.get(i).getText().equals("")) {
					for(int j = i ; j<4;j++) {
						if(!labelArr.get(i).getText().equals("")) {
							labelArr.get(i).setText(labelArr.get(i).getText());
							labelArr.get(j).setText("");
							break;
							
						};
					}
				}
			}
		}
	}
}
	

			
		
		
	

