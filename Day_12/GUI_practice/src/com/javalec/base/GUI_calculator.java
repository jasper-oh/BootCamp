package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI_calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_6_1;
	private JButton btnNewButton_6_1_1;
	private JButton btnNewButton_6_1_2;
	ArrayList<String> button= new ArrayList<>();
	ArrayList<String> button2 = new ArrayList<>();
	int num1;
	int num2;
	String numShow = "";
	String[] operator = new String[1];
	int result;
	private JButton btnNewButton_6_1_2_1;
	private JButton btnNewButton_6_1_2_2;
	private JButton btnNewButton_6_1_2_3;
	private JButton btnNewButton_9;
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_calculator window = new GUI_calculator();
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
	public GUI_calculator() {
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
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getBtnNewButton_1());
		frame.getContentPane().add(getBtnNewButton_2());
		frame.getContentPane().add(getBtnNewButton_3());
		frame.getContentPane().add(getBtnNewButton_4());
		frame.getContentPane().add(getBtnNewButton_5());
		frame.getContentPane().add(getBtnNewButton_6());
		frame.getContentPane().add(getBtnNewButton_7());
		frame.getContentPane().add(getBtnNewButton_8());
		frame.getContentPane().add(getBtnNewButton_6_1());
		frame.getContentPane().add(getBtnNewButton_6_1_1());
		frame.getContentPane().add(getBtnNewButton_6_1_2());
		frame.getContentPane().add(getBtnNewButton_6_1_2_1());
		frame.getContentPane().add(getBtnNewButton_6_1_2_2());
		frame.getContentPane().add(getBtnNewButton_6_1_2_3());
		frame.getContentPane().add(getBtnNewButton_9());
		
	}
	

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(32, 20, 388, 36);
			textField.setColumns(10);
			textField.setEditable(false);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("7");
			btnNewButton.addActionListener(new EventCalculator());
			btnNewButton.setBounds(42, 68, 56, 46);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("8");
			btnNewButton_1.addActionListener(new EventCalculator());
			btnNewButton_1.setBounds(99, 68, 56, 46);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("9");
			btnNewButton_2.addActionListener(new EventCalculator());
			btnNewButton_2.setBounds(159, 68, 56, 46);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("4");
			btnNewButton_3.addActionListener(new EventCalculator());
			btnNewButton_3.setBounds(42, 117, 56, 46);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("5");
			btnNewButton_4.addActionListener(new EventCalculator());
			btnNewButton_4.setBounds(99, 117, 56, 46);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("6");
			btnNewButton_5.addActionListener(new EventCalculator());
			btnNewButton_5.setBounds(159, 117, 56, 46);
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("1");
			btnNewButton_6.addActionListener(new EventCalculator());
			btnNewButton_6.setBounds(42, 165, 56, 46);
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("2");
			btnNewButton_7.addActionListener(new EventCalculator());
			btnNewButton_7.setBounds(99, 165, 56, 46);
		}
		return btnNewButton_7;
	}
	private JButton getBtnNewButton_8() {
		if (btnNewButton_8 == null) {
			btnNewButton_8 = new JButton("3");
			btnNewButton_8.addActionListener(new EventCalculator());
			btnNewButton_8.setBounds(159, 165, 56, 46);
		}
		return btnNewButton_8;
	}
	private JButton getBtnNewButton_6_1() {
		if (btnNewButton_6_1 == null) {
			btnNewButton_6_1 = new JButton("0");
			btnNewButton_6_1.addActionListener(new EventCalculator());
			btnNewButton_6_1.setBounds(52, 209, 56, 46);
		}
		return btnNewButton_6_1;
	}
	private JButton getBtnNewButton_6_1_1() {
		if (btnNewButton_6_1_1 == null) {
			btnNewButton_6_1_1 = new JButton("=");
			btnNewButton_6_1_1.addActionListener(new EventCalculator());
;			btnNewButton_6_1_1.setBounds(132, 209, 56, 46);
		}
		return btnNewButton_6_1_1;
	}
	private JButton getBtnNewButton_6_1_2() {
		if (btnNewButton_6_1_2 == null) {
			btnNewButton_6_1_2 = new JButton("+");
			btnNewButton_6_1_2.addActionListener(new EventCalculator());
			btnNewButton_6_1_2.setBounds(222, 68, 48, 80);
		}
		return btnNewButton_6_1_2;
	}
	private JButton getBtnNewButton_6_1_2_1() {
		if (btnNewButton_6_1_2_1 == null) {
			btnNewButton_6_1_2_1 = new JButton("-");
			btnNewButton_6_1_2_1.setBounds(227, 165, 48, 80);
		}
		return btnNewButton_6_1_2_1;
	}
	private JButton getBtnNewButton_6_1_2_2() {
		if (btnNewButton_6_1_2_2 == null) {
			btnNewButton_6_1_2_2 = new JButton("x");
			btnNewButton_6_1_2_2.setBounds(282, 68, 48, 80);
		}
		return btnNewButton_6_1_2_2;
	}
	private JButton getBtnNewButton_6_1_2_3() {
		if (btnNewButton_6_1_2_3 == null) {
			btnNewButton_6_1_2_3 = new JButton("/");
			btnNewButton_6_1_2_3.setBounds(282, 165, 48, 80);
		}
		return btnNewButton_6_1_2_3;
	}
	private JButton getBtnNewButton_9() {
		if (btnNewButton_9 == null) {
			btnNewButton_9 = new JButton("C");
			btnNewButton_9.setBounds(342, 106, 69, 69);
		}
		return btnNewButton_9;
	}
	
	class EventCalculator implements ActionListener{
		
		String getNum2 = "";
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			button.add(command);
			numShow += command;
			textField.setText(numShow);
			
			
			int loc = numSplit(numShow);
			
			if(command == "+" || command == "-" || command == "x" || command == "/") {
				operator[0] = command;
				System.out.println(operator[0]);
				num1 = Integer.parseInt(showNum2(button));
				System.out.println(num1);
			}
			
			
			if(command == "=") {
				textField.setText("");
				for(int i = loc+1 ; i < button.size()-1 ; i++) {
					String numt = button.get(i);
					getNum2 += numt;	
				}
				num2 = Integer.parseInt(getNum2);
				if(operator[0] == "+") {
					result = num1 + num2;
					textField.setText(Integer.toString(result));
				}else if(operator[0] == "-") {
					result = num1 - num2;
					textField.setText(Integer.toString(result));
				}else if(operator[0] == "x") {
					result = num1 * num2;
					textField.setText(Integer.toString(result));
				}else if(operator[0] == "/") {
					double result = num1 / (num2 * 0.1);
					String divResult = Double.toString(result);
					textField.setText(divResult);
				}
				return;
		    } 
			
		      
		      
		      
		}
		
		
		int numSplit(String numShow) {
			
		int num = button.indexOf("+");
			
			
			return num;
		}
		
		
		    
		String showNum1(ArrayList<String> button) {
			String num = "";
			
			for( int i = 0 ; i < button.size() ; i++) {
				num += button.get(i);	
			}

			return num;
		}
		String showNum2(ArrayList<String> button) {
			String num = "";
			
			for( int i = 0 ; i < button.size()-1 ; i++) {
				num += button.get(i);	
			}

			return num;
		}		
		    	  
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
	
		
		
	}
	
}
