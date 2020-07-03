

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class DEntries extends JFrame implements ActionListener

	
   {

	JLabel mts,ima;
 	
	JButton sinReg,ouReg,einReg,back;

        public DEntries()

         {
 
	   setLayout(null);

	   setTitle("Daily Entries");



             setBounds(0,0,1020,728);

	   mts=new JLabel(" DAILY ENTRIES OF PHARMACY ");

	   mts.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   mts.setForeground(Color.RED);

                     mts.setHorizontalAlignment(SwingConstants.CENTER);

                    mts.setBounds(10,20,580,110);

                    getContentPane().add(mts);

	
	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("C:\\propics\\Regist.jpg"));

       ima.setHorizontalAlignment(SwingConstants.CENTER);
     
       ima.setBounds(500,50,560,530);

       getContentPane().add(ima);
         
           
       sinReg=new JButton("Order Drugs");

       sinReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
  
       sinReg.setBounds(100,160,260,90);

       sinReg.setForeground(new Color(51,153,255));

      // sinReg.setBackground(new Color(204,255,204));

	   sinReg.setMnemonic(KeyEvent.VK_D);
  
  	   sinReg.addActionListener(this);

	   sinReg.setToolTipText("Press to Enter Pharmacy House Drug Entries ");
   
   	   getContentPane().add(sinReg);

	   
	  
	  einReg=new JButton("Pharmacy Entries");

	  einReg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
	  einReg.setForeground(new Color(51,153,255));

      //einReg.setBackground(new Color(204,255,204));

      einReg.setBounds(100,360,260,90);

      einReg.setMnemonic(KeyEvent.VK_P);
  
      einReg.addActionListener(this);
 
      einReg.setToolTipText("Press to Enter the Daily in the Pharmacy House");
   
      getContentPane().add(einReg);
          
	
	
	                                         
	   back=new JButton("BACK");

       back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(51,153,255));

      // back.setBackground(new Color(255,153,153));	   

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

        	      else if(ae.getActionCommand().equals("Order Drugs"))

	       		{
                       
        	    	  ComBoBoxExample o=new ComBoBoxExample();
                 }


   		      else if(ae.getActionCommand().equals("Pharmacy Entries"))

		       {
                     PharmaEn a=new PharmaEn();
                           
	            }

	              
              }





   public static void main(String args[])
  
    {
  
     DEntries m=new DEntries();

    }

}



