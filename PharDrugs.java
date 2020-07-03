

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;




 public class PharDrugs extends JFrame implements ActionListener

  {
  

    String Dname,exdate1,exdate2;

    
    int istock,total;
     
    
    JLabel shead,ssub,dname,instock,exda1,exda2,bno;


    JTextField dtext,dinstock,dexda1,dexda2,dexa3;

  
    JButton submit,back;


     public PharDrugs()

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
	  bno=new JLabel("BATCH NO:");

	  bno.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  bno.setForeground(new Color(0,0,0));

	  bno.setHorizontalAlignment(SwingConstants.CENTER);

	  bno.setBounds(70,120,180,40);

	  getContentPane().add(bno);
	

	
	  dname=new JLabel("DRUG NAME:");

	  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  dname.setForeground(new Color(0,0,0));

	  dname.setHorizontalAlignment(SwingConstants.CENTER);

      dname.setBounds(70,200,180,40);

	  getContentPane().add(dname);
	

      instock=new JLabel("IN-STOCK:");

	  instock.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  instock.setForeground(new Color(0,0,0));

	  instock.setHorizontalAlignment(SwingConstants.CENTER);

      instock.setBounds(80,285,140,40);

	  getContentPane().add(instock);
 

      exda1=new JLabel("MFG-DATE:");

	  exda1.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda1.setForeground(new Color(0,0,0));

	  exda1.setHorizontalAlignment(SwingConstants.CENTER);

      exda1.setBounds(90,370,130,40);

	  getContentPane().add(exda1);


	  exda2=new JLabel("EX-DATE:");

	  exda2.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  exda2.setForeground(new Color(0,0,0));

	  exda2.setHorizontalAlignment(SwingConstants.CENTER);

      exda2.setBounds(90,450,130,40);

	  getContentPane().add(exda2);

	  dexa3=new JTextField(30);

	  dexa3.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  dexa3.setBounds(250,120,430,40);

      getContentPane().add(dexa3);


      dtext=new JTextField(30);

	  dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dtext.setBounds(250,200,430,40);

      getContentPane().add(dtext);

		
      dinstock=new JTextField(30);

	  dinstock.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dinstock.setBounds(250,285,430,40);

      getContentPane().add(dinstock);


      dexda1=new JTextField(30);
	
	  dexda1.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dexda1.setBounds(250,370,430,40);

      getContentPane().add(dexda1);


	 
	  dexda2=new JTextField(30);
	
	  dexda2.setFont(new Font("Arial Narrow",Font.BOLD,18));

      dexda2.setBounds(250,450,430,40);

      getContentPane().add(dexda2);

	  
	 

	   
       submit=new JButton("SUBMIT");

       submit.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       submit.setBounds(200,560,230,50);

	   //submit.setForeground(new Color(0,0,0));

	  // submit.setBackground(new Color(0,255,255));
 
       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the detials");
   
       getContentPane().add(submit); 


       back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,28));
 
       back.setBounds(470,560,220,50);

	 //  back.setForeground(new Color(0,0,0));

	   //back.setBackground(new Color(0,255,225));

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
    	                                                            
    	                                                        
							Dname=dtext.getText();

							istock=Integer.parseInt(dinstock.getText());

							exdate1=dexda1.getText();

							exdate2=dexda2.getText();
				
							total=istock;

               				PreparedStatement pstm=con.prepareStatement("insert into pharmacy(DrugName,istock,Mfgdate,Exdate,Total)values(?,?,?,?,?)");
			                      
               				pstm.setString(1,Dname);
                               
                        
							pstm.setInt(2,istock);
        
                                
						    pstm.setString(3,exdate1);

							pstm.setString(4,exdate2);

							pstm.setInt(5,total);                              

							pstm.executeUpdate();
							  JOptionPane.showMessageDialog(null,"Record Updated","Correct Data",JOptionPane.INFORMATION_MESSAGE);
								
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
    
       PharDrugs id=new PharDrugs();

    }

}





   