

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


import java.sql.*;
import java.util.Calendar;
import java.io.*;

public class  empop extends JFrame implements ActionListener

{


    JLabel head,shead,name,age,opno,sex,occu,addr,fm,ch;

    JTextField topno,datefield,toccu,tage,tsex,tch;

    JTextArea  dadd,dfm;

     JButton submit,reset;

  String popno;
   
   String sname,soccu,sage,ssex,sadd,sfm,amm;


                public empop()
            
                  {   
                    setLayout(null);

                   setTitle(" Employee Registration");

                   setBounds(0,0,1020,725);

	  head=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  head.setForeground( Color.RED);

	  head.setHorizontalAlignment(SwingConstants.CENTER);

                    head.setBounds(210,0,570,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("REGISTRATION RECORD OF AN EMPLOYEE");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

                    shead.setBounds(370,40,500,50);

	  getContentPane().add(shead);

	  opno=new JLabel("O.P.NO");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.LEFT);

                      opno.setBounds(230,80,80,30);

	  getContentPane().add(opno);

	  name=new JLabel("NAME");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.LEFT);

                    name.setBounds(230,180,80,30);

	  getContentPane().add(name);


	  ch=new JLabel("AMOUNT");

	  ch.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  ch.setForeground(new Color(204,0,51));

	  ch.setHorizontalAlignment(SwingConstants.LEFT);

	  ch.setBounds(230,610,160,30);

	  getContentPane().add(ch);

	  age=new JLabel("AGE");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.LEFT);

                    age.setBounds(230,240,80,30);

	  getContentPane().add(age);

	  occu=new JLabel("DATE");

	  occu.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  occu.setForeground(new Color(204,0,51));

	  occu.setHorizontalAlignment(SwingConstants.LEFT);

                   occu.setBounds(230,130,80,30);

	  getContentPane().add(occu);

		
	  sex=new JLabel("SEX");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.LEFT);

                    sex.setBounds(230,300,50,30);

	  getContentPane().add(sex);

         
                    addr=new JLabel("ADDRESS");

	 addr.setFont(new Font("Arial Narrow",Font.BOLD,16));

	 addr.setForeground(new Color(204,0,51));

	 addr.setHorizontalAlignment(SwingConstants.LEFT);

                     addr.setBounds(230,360,80,30);

	  getContentPane().add(addr);

	 

	    fm=new JLabel("FAMILY MEMBERS");

	    fm.setFont(new Font("Arial Narrow",Font.BOLD,16));

	   fm.setForeground(new Color(204,0,51));

	   fm.setHorizontalAlignment(SwingConstants.LEFT);

                     fm.setBounds(190,460,160,30);

	  getContentPane().add(fm);


	 datefield=new JTextField(30);
	  

	  datefield.setFont(new Font("Times New Roman",Font.BOLD,16));

	  datefield.setBounds(310,130,310,30);

        	  getContentPane().add(datefield);
    

	 tage=new JTextField(30);

	  tage.setFont(new Font("Times New Roman",Font.BOLD,16));

                    tage.setBounds(310,240,310,30);

       	   getContentPane().add(tage);

               
	  topno=new JTextField(30);

	  topno.setFont(new Font("Times New Roman",Font.BOLD,16));

         	 topno.setBounds(310,80,100,30);

        	  getContentPane().add(topno);

        	  tch=new JTextField("30");

        	  tch.setFont(new Font("Arial Narrow",Font.BOLD,12));

                 	 tch.setBounds(310,610,100,30);

                	  getContentPane().add(tch);

                   toccu=new JTextField(30);

	 toccu.setFont(new Font("Times New Roman",Font.BOLD,16));

         	toccu.setBounds(310,180,310,30);

        	  getContentPane().add(toccu);


	
	  tsex=new JTextField(30);

	  tsex.setFont(new Font("Times New Roman",Font.BOLD,16));

        	 tsex.setBounds(310,300,310,30);

          	getContentPane().add(tsex);


                  dadd=new JTextArea(5,8);

                 JScrollPane padd=new  JScrollPane(dadd,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
dadd.setFont(new Font("Times New Roman",Font.BOLD,12));
                 getContentPane().add(padd);
                 

                 padd.setBounds(310,380,330,80);
	
              

	
                  dfm=new JTextArea(5,8);              
	
                 JScrollPane pdfm=new JScrollPane(dfm,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);                                   
 dfm.setFont(new Font("Times New Roman",Font.BOLD,12));
                getContentPane().add(pdfm);
      
         	pdfm.setBounds(310,480,330,80);

         	 submit=new JButton("Submit");

         	 submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
        	 submit.setBounds(450,610,120,40);


	 submit.setMnemonic(KeyEvent.VK_S);
  
                    submit.addActionListener(this);

                   submit.setToolTipText("Press to submit the details");
   
                     getContentPane().add(submit); 

                    
                   reset=new JButton("Exit");

                   reset.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
                   reset.setBounds(600,610,120,40);


                   reset.setMnemonic(KeyEvent.VK_X);
  
                    reset.addActionListener(this);

                    reset.setToolTipText("Press to Register Student as the In-Paitent ");
   
                    getContentPane().add(reset); 

                     setVisible(true);


	  addWindowListener(new WindowAdapter() {
                 
                                        public void windowClosing(WindowEvent we)
 
                                               {

				dispose();

                                                 }

		  });

                    }
   
                              public void actionPerformed(ActionEvent ae)
 
		       {
   
		           if(ae.getActionCommand().equals("Exit"))

		              {
                     
                     		  dispose();

		              }

			   else if(ae.getActionCommand().equals("Submit"))

                			   {
	                      
                   	                       try
		
			       {
                   	                    	 Class.forName("com.mysql.jdbc.Driver");

                   	 				     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                   	 	                                                            
                   	 	                                                        
                   popno=topno.getText();

				  sname=datefield.getText();

                   soccu=toccu.getText();

          sage=tage.getText();

				    ssex=tsex.getText();
                                                    
           sadd=dadd.getText();

           sfm=dfm.getText();
           amm=tch.getText();

     PreparedStatement pstmt=ms.prepareStatement("insert into register(OPNO,NAME,DATE,AGE,SEX,ADDRESS,FAMILYMEMBERS,AMOUNT)values(?,?,?,?,?,?,?,?)");

       pstmt.setString(1,popno);
                                                                    
        pstmt.setString(3,sname);

		pstmt.setString(2,soccu);

 pstmt.setString(4,sage);
 pstmt.setString(5,ssex);
 pstmt.setString(6,sadd);
 pstmt.setString(7,sfm);        
pstmt.setString(8,amm);
	                                                      
 pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null,"Patient as an employee registered successfully ","Success Data",JOptionPane.INFORMATION_MESSAGE);
 
  pstmt.close();

   ms.close();
                              
                              
                           }
   catch(Exception ex)
                   	                       
                   	                       { 
	   JOptionPane.showMessageDialog(null,"Incorrect Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
	   System.out.println(ex.getMessage()); }

       }
}

    public static void main(String args[])
  
             {

                         empop o=new  empop();

            }

}
