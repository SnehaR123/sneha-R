
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
import java.sql.ResultSet;

import java.io.*;


 public class UpSt extends JFrame implements ActionListener

  {
  

    String dbno,Dname,exdate11,exdate22,selectString;

    
    int istock1,ostock1,total1,rem;
     
    
    JLabel bno,bno1,und,shead,ssub,dname,dname1,instock,outstock,stock,mfg,exd,mfg1,exd1,bcom;


    JTextField dbatch1,dbatch2,drugname1,drugname2,dinstock,dtotal,dostock,dexda1,dmfg2,dexda2,dmfg1,tcom;

  
    JButton submit,back,getDetails;


     public UpSt()

     {
    
          setLayout(null);

          setTitle("Drugs");

	 setBounds(0,0,1020,725);

	  shead=new JLabel("UPDATING DRUGS ");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(250,20,360,60);

	  getContentPane().add(shead);


      ssub=new JLabel("_________________ ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

      ssub.setBounds(240,10,390,80);

	  getContentPane().add(ssub);

	   
	   und=new JLabel("_______________________________________________________ ");

	   und.setFont(new Font("Arial Narrow",Font.BOLD,40));

	   und.setForeground(new Color(255,102,102));

	   und.setHorizontalAlignment(SwingConstants.LEADING);

       und.setBounds(5,220,1020,80);

	    getContentPane().add(und);


	
	    bno=new JLabel("BATCH NO.:");

	    bno.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    bno.setForeground(new Color(0,0,0));

	    bno.setHorizontalAlignment(SwingConstants.CENTER);

	    bno.setBounds(20,80,180,40);

	    getContentPane().add(bno);

	   bcom=new JLabel("COMPANY:");

	    bcom.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    bcom.setForeground(new Color(0,0,0));

	    bcom.setHorizontalAlignment(SwingConstants.RIGHT);

	    bcom.setBounds(465,85,180,40);

	    getContentPane().add(bcom);
		
	     dname1=new JLabel("DRUG NAME:");

	     dname1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     dname1.setForeground(new Color(0,0,0));

		 dname1.setHorizontalAlignment(SwingConstants.CENTER);

		 dname1.setBounds(20,350,160,40);

	      getContentPane().add(dname1);
	      bno1=new JLabel("BATCH NO.:");

		    bno1.setFont(new Font("Arial Narrow",Font.BOLD,20));

		    bno1.setForeground(new Color(0,0,0));

		    bno1.setHorizontalAlignment(SwingConstants.CENTER);

		    bno1.setBounds(20,300,180,40);

		    getContentPane().add(bno1);

	      
	      dname=new JLabel("DRUG NAME:");

		     dname.setFont(new Font("Arial Narrow",Font.BOLD,20));

		     dname.setForeground(new Color(0,0,0));

			 dname.setHorizontalAlignment(SwingConstants.CENTER);

			 dname.setBounds(20,135,160,40);

		      getContentPane().add(dname);


        instock=new JLabel("NEW -ISTOCK:");

        instock.setFont(new Font("Arial Narrow",Font.BOLD,20));

        instock.setForeground(new Color(0,0,0));

        instock.setHorizontalAlignment(SwingConstants.CENTER);

        instock.setBounds(20,402,140,40);

	    getContentPane().add(instock);

     
       outstock=new JLabel("NEW -OSTOCK:");

	    outstock.setFont(new Font("Arial Narrow",Font.BOLD,20));

	    outstock.setForeground(new Color(0,0,0));

	    outstock.setHorizontalAlignment(SwingConstants.LEFT);

        outstock.setBounds(40,455,150,40);

	    getContentPane().add(outstock);
 

        stock=new JLabel("STOCK:");

        stock.setFont(new Font("Arial Narrow",Font.BOLD,20));

        stock.setForeground(new Color(0,0,0));

        stock.setHorizontalAlignment(SwingConstants.CENTER);

        stock.setBounds(20,180,180,40);

	    getContentPane().add(stock);
                                                  

         mfg=new JLabel("MFG DATE:");

	     mfg.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     mfg.setForeground(new Color(0,0,0));

	     mfg.setHorizontalAlignment(SwingConstants.RIGHT);

         mfg.setBounds(460,130,180,40);

	     getContentPane().add(mfg);


	  
	     exd=new JLabel("EX-DATE:");

	     exd.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exd.setForeground(new Color(0,0,0));

	     exd.setHorizontalAlignment(SwingConstants.RIGHT);

         exd.setBounds(460,180,180,40);

	     getContentPane().add(exd);


		 mfg1=new JLabel("MFG DATE:");

	     mfg1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     mfg1.setForeground(new Color(0,0,0));

	     mfg1.setHorizontalAlignment(SwingConstants.CENTER);

         mfg1.setBounds(20,500,170,40);

	     getContentPane().add(mfg1);
        

         exd1=new JLabel("EX-DATE:");

	     exd1.setFont(new Font("Arial Narrow",Font.BOLD,20));

	     exd1.setForeground(new Color(0,0,0));

	     exd1.setHorizontalAlignment(SwingConstants.CENTER);

         exd1.setBounds(20,564,170,40);

	     getContentPane().add(exd1);



      
         
		  drugname2=new JTextField(30);

		  drugname2.setFont(new Font("Times New Roman",Font.BOLD,18));

		  drugname2.setBounds(180,350,300,30);

         getContentPane().add(drugname2); 
         drugname1=new JTextField(30);

         drugname1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         drugname1.setBounds(180,140,300,30);

         getContentPane().add(drugname1);


         tcom=new JTextField(30);

         tcom.setFont(new Font("Times New Roman",Font.BOLD,18));

     tcom.setBounds(660,85,300,30);

         getContentPane().add(tcom); 
         dtotal=new JTextField(30);

	     dtotal.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dtotal.setBounds(180,185,300,30);

         getContentPane().add(dtotal);
         dexda1=new JTextField(30);

		 dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda1.setBounds(660,185,300,30);

         getContentPane().add(dexda1);
	
         dmfg1=new JTextField(30);

         dmfg1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dmfg1.setBounds(660,135,300,30);

         // dexda4.setBounds(180,465,300,30);

         getContentPane().add(dmfg1);
        
         
         dbatch1=new JTextField(30);

         dbatch1.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dbatch1.setBounds(180,300,300,30);

         getContentPane().add(dbatch1);
                

         dbatch2=new JTextField(30);

         dbatch2.setFont(new Font("Times New Roman",Font.BOLD,18));

         dbatch2.setBounds(180,85,300,30);

         getContentPane().add(dbatch2); 

		
        dinstock=new JTextField(30);

	     dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dinstock.setBounds(180,405,300,30);

         getContentPane().add(dinstock);

         dostock=new JTextField(30);

  	     dostock.setFont(new Font("Arial Narrow",Font.BOLD,18));

           dostock.setBounds(180,460,300,30);

           getContentPane().add(dostock);
  	 


		 dmfg2=new JTextField(30);

		 dmfg2.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dmfg2.setBounds(180,510,300,30);

         getContentPane().add(dmfg2);
	

	     dexda2=new JTextField(30);

		 dexda2.setFont(new Font("Arial Narrow",Font.BOLD,18));

         dexda2.setBounds(180,570,300,30);
		 
		// dexda4.setBounds(180,465,300,30);

         getContentPane().add(dexda2);
	


		   getDetails=new JButton("Get Details");

		   getDetails.setFont(new Font("Arial Narrow",Font.BOLD,20));

		   getDetails.setForeground(new Color(0,0,255));

		   getDetails.setBounds(430,240,200,30);

		   getDetails.setMnemonic(KeyEvent.VK_D);

		   getDetails.addActionListener(this);

		   getDetails.setToolTipText("Press to Get the Detials");

		   getContentPane().add(getDetails);


          submit=new JButton("SUBMIT");

          submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          submit.setBounds(300,610,160,40);

	      submit.setForeground(new Color(0,0,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the detials");
   
          getContentPane().add(submit); 


          back=new JButton("BACK");

          back.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
          back.setBounds(480,610,160,40);

	      back.setForeground(new Color(0,0,255));

          back.setMnemonic(KeyEvent.VK_B);
  
          back.addActionListener(this);

          back.setToolTipText("PRESS TO DISPOSE");
   
          getContentPane().add(back); 

	      setVisible(true);

           addWindowListener(new WindowAdapter() {

                        public void windowCloseing(WindowEvent we)

                           {

                                    dispose();

                           }
         });

   }

 
      public void actionPerformed(ActionEvent ae)
   

        {

             if(ae.getActionCommand().equals("BACK"))

                {
 
                        dispose();

               }

			       else if(ae.getActionCommand().equals("Get Details"))

				 {        

						try
		
							{
								Class.forName("com.mysql.jdbc.Driver");

								Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                                                            
                                                         //   Statement stmt;

			                                           
								dbno=dbatch1.getText();

				PreparedStatement pstmt=ms.prepareStatement("select DRUGNAME,MFGDATE,EXDATE from drugs where BATCHNO=?");
                                     System.out.println("hai1");              
                              pstmt.setString(1,dbno);
                              System.out.println("hai2"); 

								ResultSet rs=pstmt.executeQuery();

							    System.out.println("hai3"); 
							//    System.out.println(rs);
                                 while(rs.next())
                                 {
                                	 
                                	    System.out.println("hai4"); 
                                          drugname1.setText(rs.getString(1)) ;                      
                                        //   dtotal.setText(rs.getString(2));
                                           // System.out.println(rs.getString(1));

                                           
                                           
                                          dmfg1.setText(rs.getString(2));    
				 
											dexda1.setText(rs.getString(3));     
											System.out.println("view success");
				 JOptionPane.showMessageDialog(null,"Record Updated","Correct Data",JOptionPane.INFORMATION_MESSAGE);
												
                                          }      				

         				       
	                                         pstmt.close();
                                                                   
                                                ms.close();

                          }                    
						catch(Exception ex) 
                          { 
							  JOptionPane.showMessageDialog(null,"Incorrect Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
								
							System.out.println(ex.getMessage()); 
                          }
                   }


                  else if(ae.getActionCommand().equals("SUBMIT"))

	             {                      
 
                               			  Dname=drugname1.getText();

										  istock1=total1;

                                          istock1=Integer.parseInt(dinstock.getText());
			
			                              ostock1=Integer.parseInt(dostock.getText());
			    
                                          exdate11=dtotal.getText();

										  exdate22=dexda1.getText();

										  total1=istock1-ostock1;

                                                               
                           
								try
		
										{	
									 Class.forName("com.mysql.jdbc.Driver");

								     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
					                                                            
					                                                        
												PreparedStatement pstmt=ms.prepareStatement("Update drugs set DRUGNAME=? ISTOCK=?, MFGDATE=? ,EXDATE=?where BATCHNO=?");
											
                                                 // pstmt.setString(1, dbatch2); 
                                                pstmt.setString(2,Dname);

                                                pstmt.setInt(2,istock1);

											//	pstmt.setInt(2,ostock1);
                             
												pstmt.setString(3,exdate11);

												pstmt.setString(4,exdate22);

										//	pstmt.setString(5,dbno);
            
			     pstmt.executeUpdate();

                                                            ms.commit();  

			     pstmt.close();

                             ms.close();

                          }

                          catch(Exception ex) {  System.out.println(ex.getMessage()); }
                   }


      }

   public static void main(String args[])

    {
    
       UpSt id=new UpSt();

    }

}





   
