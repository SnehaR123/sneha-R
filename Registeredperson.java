

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;

public class Registeredperson extends JFrame implements ActionListener

{


    JLabel head,shead,name,age,opno,sex,occu,addr,fm,ch;

    JTextField topno,tname,toccu,tage,tsex,tch;

    JTextArea  dadd,dfm;

    JScrollPane pdadd,pdfm;
    JComboBox cb;

    JButton submit,reset,Item;

    

   String sname,soccu,sage,ssex,sadd,sfm,popno;


                public Registeredperson()
            
                  {   
                    setLayout(null);

                   setTitle("Registration of Patient");

           //      setMinimumSize(new Dimension(1030,730));

                   setBounds(0,0,1020,725);

	  head=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  head.setForeground( Color.RED);

	  head.setHorizontalAlignment(SwingConstants.CENTER);

                    head.setBounds(210,0,570,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("REGISTRATION RECORD");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

                    shead.setBounds(370,40,250,30);

	  getContentPane().add(shead);

	  opno=new JLabel("O.P.NO");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.CENTER);

                      opno.setBounds(230,80,70,30);

	  getContentPane().add(opno);

	  name=new JLabel("NAME:");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.CENTER);

                    name.setBounds(240,180,60,30);

	  getContentPane().add(name);



	  age=new JLabel("AGE:");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.CENTER);

                    age.setBounds(250,240,40,30);

	  getContentPane().add(age);
	
	  
	
  

	  occu=new JLabel("DATE:");

	  occu.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  occu.setForeground(new Color(204,0,51));

	  occu.setHorizontalAlignment(SwingConstants.CENTER);

                   occu.setBounds(240,130,60,30);

	  getContentPane().add(occu);

		
	  sex=new JLabel("SEX:");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.LEFT);

                    sex.setBounds(250,300,50,30);

	  getContentPane().add(sex);

         
                    addr=new JLabel("ADDRESS:");

	 addr.setFont(new Font("Arial Narrow",Font.BOLD,16));

	 addr.setForeground(new Color(204,0,51));

	 addr.setHorizontalAlignment(SwingConstants.CENTER);

                     addr.setBounds(230,350,100,30);

	  getContentPane().add(addr);

	 

	    fm=new JLabel("FAMILY MEMBERS:");

	    fm.setFont(new Font("Arial Narrow",Font.BOLD,16));

	   fm.setForeground(new Color(204,0,51));

	   fm.setHorizontalAlignment(SwingConstants.TRAILING);

                     fm.setBounds(190,460,160,30);

	  getContentPane().add(fm);

	  ch=new JLabel("AMOUNT:");

	  ch.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  ch.setForeground(new Color(204,0,51));

	  ch.setHorizontalAlignment(SwingConstants.TRAILING);

	  ch.setBounds(140,610,160,30);

	  getContentPane().add(ch);

	   tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

                     tname.setBounds(310,130,310,30);

        	  getContentPane().add(tname);


	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

                    tage.setBounds(310,240,310,30);

       	   getContentPane().add(tage);
       	 Item=new JButton("View");

         Item.setFont(new Font("Arial Narrow",Font.BOLD,18));

         Item.setBounds(450,80,110,30);
         getContentPane().add(Item);
Item.addActionListener(this);

               
	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

         	 topno.setBounds(310,80,100,30);

        	 // getContentPane().add(topno);
         	 cb=new JComboBox();
         	 cb.setFont(new Font("Arial Narrow",Font.BOLD,12));
            cb.setBounds(310,80,100,30);
            getContentPane().add(cb);
            Item.addActionListener(new ActionListener()
            		{
            	public void actionPerformed(ActionEvent e)
            	{
            		try
            		{
            			
            			 Class.forName("com.mysql.jdbc.Driver");

   	 				     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
   	 	                                                            
 // popno=cb.addItem();

PreparedStatement pstmt=ms.prepareStatement("Select opno from register");
    
 //pstmt.setInt(1,(int) cb.getSelectedItem()); 
                      System.out.println("hjhj");                                      
ResultSet rs=pstmt.executeQuery();     
while(rs.next())
{
	cb.addItem(rs.getInt(1));
	 
}
pstmt.close();
//JOptionPane.showMessageDialog(null,"Record Viewed ","Success Data",JOptionPane.INFORMATION_MESSAGE);

ms.close();
                  
                  
      
      

//cb.addItem(rs.getString(1));                                                             

            		}
            		catch(Exception ex)
            		{
            			System.out.println(ex);
            		}
            	}
            		});
        	  tch=new JTextField(30);

        	  tch.setFont(new Font("Arial Narrow",Font.BOLD,12));

                 	 tch.setBounds(310,610,100,30);

                	  getContentPane().add(tch);

                   toccu=new JTextField(30);

	 toccu.setFont(new Font("Arial Narrow",Font.BOLD,12));

         	toccu.setBounds(310,180,310,30);

        	  getContentPane().add(toccu);


	
	  tsex=new JTextField(30);

	  tsex.setFont(new Font("Arial Narrow",Font.BOLD,12));

        	 tsex.setBounds(310,300,310,30);

          	getContentPane().add(tsex);


                  dadd=new JTextArea();

                   dadd.setColumns(8);

                  dadd.setRows(5);
                  dadd.setFont(new Font("Arial Narrow",Font.BOLD,12));

	JScrollPane pdadd =new JScrollPane(dadd);
            
                    dadd.setBounds(310,380,330,80);            

                 getContentPane().add(pdadd);

                 getContentPane().add(dadd);
	
              

	
                  dfm=new JTextArea(5,8);

	 dfm.setBounds(310,500,330,80);

                 JScrollPane pdfm=new JScrollPane(dfm);
                dfm. setFont(new Font("Arial Narrow",Font.BOLD,12));

                 getContentPane().add(pdfm);

                 getContentPane().add(dfm);

          
          	
          
         	 submit=new JButton("Submit");

         	 submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
        	 submit.setBounds(580,80,110,30);

//	  but1.setForeground(new Color(51,153,255));

	 submit.setMnemonic(KeyEvent.VK_S);
  
                    submit.addActionListener(this);

                   submit.setToolTipText("Press to submit the detials");
   
                     getContentPane().add(submit); 
                    //        	  but1.setForeground(new Color(51,153,255));

        	            
                             ; 


                    
                   reset=new JButton("Exit");

                   reset.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
                   reset.setBounds(650,630,120,40);

//	  but2.setForeground(new Color(51,153,255));

                   reset.setMnemonic(KeyEvent.VK_X);
  
                    reset.addActionListener(this);

                    reset.setToolTipText("Press to Register the In-Paitent ");
   
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
                   	 	                                                            
  		//    popno=cb.addItem();

      PreparedStatement pstmt1=ms.prepareStatement("Select * from register where opno=?");
                    
	  // pstmt.setString(1,); 
             int tmp=(Integer) cb.getSelectedItem();                                                              
                                    
                                                                   
          pstmt1.setInt(1, tmp); 
          ResultSet rs1=pstmt1.executeQuery();
       if(rs1.next())

            {
    	 
  tname.setText(rs1.getString(3));
 toccu.setText(rs1.getString(2));
     tage.setText(rs1.getString(4));
   tsex.setText(rs1.getString(5));
			        
  dadd.setText(rs1.getString(6));

dfm.setText(rs1.getString(7));     
tch.setText(rs1.getString(8));

}
       pstmt1.close();
      JOptionPane.showMessageDialog(null,"Record Viewed ","Success Data",JOptionPane.INFORMATION_MESSAGE);
   	
      ms.close();
                              
                              
                  }
                  
  catch(Exception ex)
                   	                       {
	  JOptionPane.showMessageDialog(null,"Incorrect Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
		
	  
	  System.out.println(ex.getMessage()); 
	  }

       }
}

    public static void main(String args[])
  
             {

    	Registeredperson r=new Registeredperson();

            }

}