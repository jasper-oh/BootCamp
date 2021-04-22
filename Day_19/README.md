### Day 19

#### Divided Classes with each Function

👉 base => Swing Main Class with Design

👉 function => BEAN // GETTER SETTER for get private values in base (address.class)
DbAction // Every Database Action is in this class with Query.
ShareVar // login in mysql info

#### 🔎 INSPECT

```Java
private void insertAction(){


		 String name  = tfName.getText().trim();
		 String telno  = tfTelno.getText().trim();
		 String address = tfAddress.getText().trim();
		 String email  = tfEmail.getText().trim();
		 String relation  = tfRelation.getText().trim();

        //  New thing about ABORT thing
        // There are no value in this field about seqno, so that ABORT thing is appear ？
		 DbAction dba = new DbAction(ABORT, name, telno, address, email, relation);

		 boolean msg = dba.insertAction();

```

```java

	public Bean TableClick() {

		Bean bean = null;

		String WhereDefault = "select seqno, name, telno, address, email, relation from userinfo ";
        String WhereDefault2 = "where seqno = " ;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2 + seqno);

            while(rs.next()){
            	int wkseq = rs.getInt(1);
            	String wrkName = rs.getString(2);
            	String wrkTelno = rs.getString(3);
            	String wrkAddress= rs.getString(4);
            	String wrkEmail = rs.getString(5);
            	String wrkRelation = rs.getString(6);
            	// GET every value in BEAN for...
            	bean = new Bean(wkseq, wrkName, wrkTelno, wrkAddress, wrkEmail, wrkRelation);
            }
            conn_mysql.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

		return bean;
	}
    // -> DbAction.tableClick method
```

```java
private void insertAction(){


		 String name  = tfName.getText().trim();
		 String telno  = tfTelno.getText().trim();
		 String address = tfAddress.getText().trim();
		 String email  = tfEmail.getText().trim();
		 String relation  = tfRelation.getText().trim();

		 DbAction dba = new DbAction(ABORT, name, telno, address, email, relation);

		 boolean msg = dba.insertAction();

		 if ( msg ){
			 JOptionPane.showMessageDialog(this, tfName.getText()+" 님의 정보가 입력 되었습니다.!",
                   "입력 완료!",
                   JOptionPane.INFORMATION_MESSAGE);
		 }else {
			 JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
                   "Critical Error!",
                   JOptionPane.ERROR_MESSAGE);
		 }
	}
    // ->Address.insertAction method
```

#### 🐞 Bug

1. User Don't Selected table, then Showed up Message Dialog for alert check the table.

2. first check the Search radiobutton or Click some table for checkig out Someone's detail info, then check Insert button every textfield are filled with previous values -> If user Checked Insert btn, then clear all textfield to fill-up their new data.
