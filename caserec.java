

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class caserec extends JFrame implements ActionListener

	
   {

	JLabel mts,ima,ssu;
 	
	JButton sinReg,ouReg,einReg,back;

        public caserec()

         {
 
	   setLayout(null);

	   setTitle(" CASE RECORD");

//           setMinimumSize(new java.awt.Dimension(1020,720));

             setBounds(0,0,1020,728);

	   mts=new JLabel(" CASE RECORDS OF IN & OUT PATIENT");

	   mts.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   mts.setForeground(Color.RED);

                     mts.setHorizontalAlignment(SwingConstants.CENTER);

                    mts.setBounds(10,20,580,110);
                  //  mts.setIcon(new ImageIcon("C:\\propics\\Wow1.jpg"));
        	        
                   // mts.setBounds(480,250,440,400);

                    getContentPane().add(mts);

                    ssu=new JLabel("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

              	  ssu.setFont(new Font("Arial Narrow",Font.BOLD,40));

              	  ssu.setForeground(new Color(255,102,102));

              	  ssu.setHorizontalAlignment(SwingConstants.CENTER);

                    ssu.setBounds(10,20,580,110);

              	  getContentPane().add(ssu);


	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("C:\\propics\\20190802_686821758.jpg"));

                    ima.setHorizontalAlignment(SwingConstants.CENTER);
     
                    ima.setBounds(650,10,460,730);

                    getContentPane().add(ima);
         
           
                     sinReg=new JButton("InPatient Record");

                     sinReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
  
                     sinReg.setBounds(100,160,260,40);

                     sinReg.setForeground(new Color(51,153,255));

                   //  sinReg.setBackground(Color.LIGHT_GRAY);

	  sinReg.setMnemonic(KeyEvent.VK_S);
  
  	 sinReg.addActionListener(this);

	 sinReg.setToolTipText("Press to Register the In-Patient ");
   
   	 getContentPane().add(sinReg);


          
	ouReg=new JButton("OutPatient Record");

	ouReg.setFont(new Font("Arial Narrow",Font.BOLD,25));

	ouReg.setForeground(new Color(51,153,255));

                //  ouReg.setBackground(Color.LIGHT_GRAY);
 
	ouReg.setBounds(100,300,260,40);

	 ouReg.setMnemonic(KeyEvent.VK_O);
  
  	ouReg.addActionListener(this);

	ouReg.setToolTipText("Press to Register the Out-Patient");
   
   	getContentPane().add(ouReg);

	   
	   back=new JButton("BACK");

           back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(51,153,255));

                   //  back.setBackground(new Color(255,153,153));	   

 
 	   back.setBounds(430,580,120,40);

           back.setMnemonic(KeyEvent.VK_B);

           back.addActionListener(this);

           back.setToolTipText("Press for returning to Home Page");

           getContentPane().add(back);
       
           setVisible(true);

          addWindowListener(new WindowAdapter()

                  {

                  public void windowClosing(WindowEvent we)

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

        	      else if(ae.getActionCommand().equals("InPatient Record"))

	       		{
                           InpatientRec i=new InpatientRec();
		          
                        }


   		 

		      else if(ae.getActionCommand().equals("OutPatient Record"))

	 	      {
	
                           empop o=new empop();

	              }
              }





   public static void main(String args[])
  
    {
  
	   caserec m=new caserec();

    }

}



