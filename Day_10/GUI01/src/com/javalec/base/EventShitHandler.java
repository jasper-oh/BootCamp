package com.javalec.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventShitHandler implements ActionListener{
	
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_5;
	JTextField textField_6;
	JLabel lblNewLabel_1;
	JButton btnNewButton;
	JButton btnX;
	JButton btnX_1;
	JButton btnNewJButton3;
	
	
	
	public EventShitHandler(JTextField textField_1 ,JTextField textField_2,JTextField textField_3, JTextField textField_5,
			JTextField textField_6, JLabel lblNewLabel_1) {
		this.textField_1 = textField_1;
		this.textField_2 = textField_2;
		this.textField_3 = textField_3;
		this.textField_5 = textField_5;
		this.textField_6 = textField_6;
		this.lblNewLabel_1 = lblNewLabel_1;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(textField_1.getText().equals("") || textField_2.getText().equals("")) {
			JOptionPane.showMessageDialog(btnNewJButton3, "공백 계산은 불가능 합니다.");
			return;
		}
		
		ButtonAction ba = new ButtonAction(textField_1.getText() , textField_2.getText());
		
		textField_3.setText(textField_1.getText());
		textField_5.setText(textField_2.getText());
		
		String button = e.getActionCommand();
		
		if(button.equals("+")) {
			lblNewLabel_1.setText("+");
			textField_6.setText(ba.addAction());
		}else if(button.equals("-")) {
			lblNewLabel_1.setText("-");
			textField_6.setText(ba.minusAction());
		}else if(button.equals("x")) {
			lblNewLabel_1.setText("x");
			textField_6.setText(ba.muliplyAction());
		}else if(button.equals("/")) {
			lblNewLabel_1.setText("/");
			textField_6.setText(ba.divideAction());
		}
	}	
}
