
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;




 public class InsertDrug extends JFrame implements ActionListener

  {
  

    String batch,comp,Dname,exdate;


	String mfgdate;

    
    int istock,total;
     
    
    JLabel shead,ssub,dname,dcname,instock,mfg,exd,warn1,warn2,warn3,bno,com;


    JTextField tdrug,dinstock,tmfg,texd,tbn,dcom;

  
    JButton submit,back;


     public InsertDrug()

     {
    
        	  setLayout(null);

        	  setTitle("Drugs");

         //  setMinimumSize(new Dimension(900,700));

                   setBounds(0,0,1020,725);

	  shead=new JLabel("INSERT THE DRUGS");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  shead.setForeground(new Color(204,102,0));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

      shead.setBounds(250,20,360,60);

	  getContentPane().add(shead);


      ssub=new JLabel("_ _ _ _ _ _ _ _ _ _ _ _ _ ");

	  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  ssub.setForeground(new Color(255,102,102));

	  ssub.setHorizontalAlignment(SwingConstants.CENTER);

      ssub.setBounds(240,15,400,100);

	  getContentPane().add(ssub);

	  bno=new JLabel("BATCH NO");

	  bno.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  bno.setForeground(new Color(0,0,0));

	  bno.setHorizontalAlignment(SwingConstants.LEFT);

	  bno.setBounds(70,110,180,40);

	  getContentPane().add(bno);
	
	  dname=new JLabel("DRUG NAME");

	  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dname.setForeground(new Color(0,0,0));

	  dname.setHorizontalAlignment(SwingConstants.LEFT);

      dname.setBounds(70,180,180,40);

	  getContentPane().add(dname);
	
	  dcname=new JLabel("COMPANY NAME");

	  dcname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dcname.setForeground(new Color(0,0,0));

	  dcname.setHorizontalAlignment(SwingConstants.LEFT);

      dcname.setBounds(70,260,180,40);

	  getContentPane().add(dcname);
	
      instock=new JLabel("STOCK");

	  instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  instock.setForeground(new Color(0,0,0));

	  instock.setHorizontalAlignment(SwingConstants.LEFT);

      instock.setBounds(70,355,170,40);

	  getContentPane().add(instock);


	 /* warn1=new JLabel("(Enter only Integers)");

	  warn1.setFont(new Font("Arial Narrow",Font.BOLD,15));

	  warn1.setForeground(new Color(0,0,0));

	  warn1.setHorizontalAlignment(SwingConstants.TRAILING);

      warn1.setBounds(730,255,170,40);

	  getContentPane().add(warn1);*/
 
 

      mfg=new JLabel("MFG DATE");

	  mfg.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  mfg.setForeground(new Color(0,0,0));

	  mfg.setHorizontalAlignment(SwingConstants.LEFT);

      mfg.setBounds(70,440,130,40);

	  getContentPane().add(mfg);

          
	 warn2=new JLabel("(Enter only Month & Year)");

	  warn2.setFont(new Font("Arial Narrow",Font.BOLD,15));

	  warn2.setForeground(new Color(0,0,0));

	  warn2.setHorizontalAlignment(SwingConstants.TRAILING);

      warn2.setBounds(730,440,200,40);

	  getContentPane().add(warn2);


	  exd=new JLabel("EX-DATE");

	  exd.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exd.setForeground(new Color(0,0,0));

	  exd.setHorizontalAlignment(SwingConstants.LEFT);

      exd.setBounds(70,520,130,40);

	  getContentPane().add(exd);


      warn3=new JLabel("(Enter only Month & Year)");

	  warn3.setFont(new Font("Arial Narrow",Font.BOLD,15));

	  warn3.setForeground(new Color(0,0,0));

	  warn3.setHorizontalAlignment(SwingConstants.TRAILING);

      warn3.setBounds(730,520,200,40);

	  getContentPane().add(warn3);
	 tbn=new JTextField(30);

	  tbn.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  tbn.setBounds(290,110,430,40);

      getContentPane().add(tbn);


      tdrug=new JTextField(30);

	  tdrug.setFont(new Font("Arial Narrow",Font.BOLD,18));

      tdrug.setBounds(290,180,430,40);

      getContentPane().add(tdrug);
      
      dcom=new JTextField(30);
      
      dcom.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dcom.setBounds(290,260,430,40);

      getContentPane().add(dcom);
		
      dinstock=new JTextField(30);

	  dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dinstock.setBounds(290,355,430,40);

      getContentPane().add(dinstock);


      tmfg=new JTextField(30);
	
	  tmfg.setFont(new Font("Arial Narrow",Font.BOLD,18));

      tmfg.setBounds(290,440,430,40);

      getContentPane().add(tmfg);


	 
	  texd=new JTextField(30);
	
	  texd.setFont(new Font("Arial Narrow",Font.BOLD,18));

      texd.setBounds(290,520,430,40);

      getContentPane().add(texd);

       submit=new JButton("SUBMIT");

       submit.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       submit.setBounds(200,600,230,50);

	   submit.setForeground(new Color(51,220,255));

	  // submit.setBackground(new Color(0,255,255));
 
       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the details");
   
       getContentPane().add(submit); 


       back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       back.setBounds(470,600,220,50);

	   back.setForeground(new Color(51,220,255));

	  // back.setBackground(Color.CYAN);

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

		else if(ae.getActionCommand().equals("SUBMIT"))

		   {

                    try
		
			             {

                    	 Class.forName("com.mysql.jdbc.Driver");

    				     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
    	                                                            
    	                    batch=tbn.getText();
    	                    
							Dname=tdrug.getText();
							
                            comp=dcom.getText();
                             
							istock=Integer.parseInt(dinstock.getText());

							mfgdate=tmfg.getText();

							exdate=texd.getText();
				
							//total=istock;

               				PreparedStatement pstm=con.prepareStatement("insert into drugs(BATCHNO,DRUGNAME,COMPANY,ISTOCK,MFGDATE,EXDATE)values(?,?,?,?,?,?)");
			                     
               				pstm.setString(1, batch);
               				
               				pstm.setString(2,Dname);
                               
                            pstm.setString(3, comp);
							pstm.setInt(4,istock);

						    pstm.setString(5,mfgdate);

							pstm.setString(6,exdate);

						//	pstm.setInt(7,total);                              
                         
						    pstm.executeUpdate();
						    JOptionPane.showMessageDialog(null,"Drug added","Correct data",JOptionPane.INFORMATION_MESSAGE);
							
							pstm.close();

							con.close();

               }

               catch(Exception ex)
                    {  
            	   JOptionPane.showMessageDialog(null,"Wrong Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
            		
            	   System.out.println(ex.getMessage());
               }
                   }


      }

   public static void main(String args[])

    {
    
	   InsertDrug id=new InsertDrug();

    }

}





   
