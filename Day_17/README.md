## JAVA SWING <--ConnectionJ--> MySQL(DB)

```java
//NOT LAZY SYS
package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddressInsert {

    private JFrame frmAddress;
    private JTextField tfName;

    //DATABASE ENV SETTING 
    private final String url_mysql = "jdbc:mysql://127.0.0.1/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
    private final String id_mysql = "root"; // %root 가 없으면 연결 안된다. 
    private final String pw_mysql = "qwer1234";
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddressInsert window = new AddressInsert();
                    window.frmAddress.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AddressInsert() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAddress = new JFrame();
        frmAddress.setTitle("AddressBook");
        frmAddress.setBounds(100, 100, 450, 300);
        frmAddress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAddress.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(25, 33, 69, 22);
        frmAddress.getContentPane().add(lblNewLabel);
        
        tfName = new JTextField();
        tfName.setBounds(86, 31, 130, 26);
        frmAddress.getContentPane().add(tfName);
        tfName.setColumns(10);
        
        JButton btnInsert = new JButton("Insert");
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertAction();
                
            }
        });
        btnInsert.setBounds(294, 221, 117, 29);
        frmAddress.getContentPane().add(btnInsert);
    }
```
 🌟 sql private final (Env Setting) import thing + Java swing code
```java
    // User info insert 
    private void insertAction() {
//        For Using QuestionMark things => PreparedStatement
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();
            
            String query = "insert into userinfo (name) values (?)";
            
            ps = conn_mysql.prepareStatement(query);
            ps.setString(1, tfName.getText().trim());
            ps.executeUpdate(); // EndInsert
```
> If you want get in to multiple data

```java
String query = "insert into userinfo (name,telno,address,email,relation) values (?,?,?,?,?) ";
ps.setString(1, tfName.getText().trim());
        ps.setString(2, tfPhone.getText().trim());
        ps.setString(3, tfAddress.getText().trim());
        ps.setString(4, tfEmail.getText().trim());
        ps.setString(5, tfRelate.getText().trim());
```
++

```java
//            DB CONNECTION CANCEL
            conn_mysql.close();
            
            JOptionPane.showMessageDialog(null, tfName.getText() + " information is insert");
            
        }catch(Exception e) {
            e.printStackTrace();
        }        
    }
}

```
