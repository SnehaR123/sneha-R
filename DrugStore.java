

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


 public  class DrugStore extends JFrame implements ActionListener

	
   {

	JLabel ds,ima;
 	
	JButton indg,updg,inou,tokn,back,ord,UpDatess;

                 public DrugStore()

                    {
 
	   setLayout(null);

	   setTitle(" Drug Store");

	   setBounds(0,0,1020,725);

	//   setMinimumSize(new java.awt.Dimension(1020,720));

	   ds=new JLabel(" HEALTH CARE CENTRE,COIMBATORE ");

	   ds.setFont(new Font("Arial Narrow",Font.BOLD,36));

	   ds.setForeground(Color.RED);

                     ds.setHorizontalAlignment(SwingConstants.CENTER);

                    ds.setBounds(220,40,660,50);

                    getContentPane().add(ds);

	
	   ima=new JLabel("  ");

	   ima.setFont(new Font("Arial Narrow",Font.BOLD,35));

	   ima.setIcon(new ImageIcon("C:\\propics\\drugstore1.jpg"));
 
                    ima.setHorizontalAlignment(SwingConstants.CENTER);

                    ima.setBounds(290,210,450,360);

                   getContentPane().add(ima);
         
           
                    indg=new JButton("Insert Drugs");

                    indg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
                    indg.setBounds(90,130,280,70);

	   indg.setForeground(new Color(0,0,255));

                    indg.setMnemonic(KeyEvent.VK_I);
  
                    indg.addActionListener(this);

                     indg.setToolTipText("Press To Enter The Drugs ");
   
                    getContentPane().add(indg);

	   
	  
                    updg=new JButton("View  Drugs ");

                    updg.setFont(new Font("Arial Narrow",Font.BOLD,25));
 
                     updg.setForeground(new Color(0,0,255));

	   updg.setBounds(770,130,210,70);

                     updg.setMnemonic(KeyEvent.VK_U);
  
                    updg.addActionListener(this);

                    updg.setToolTipText("PRESS TO UPDATE THE DRUGS");
   
                   getContentPane().add(updg);

                   UpDatess=new JButton("Update  Drugs ");

                   UpDatess.setFont(new Font("Arial Narrow",Font.BOLD,25));

                   UpDatess.setForeground(new Color(0,0,255));

                   UpDatess.setBounds(90,550,210,70);

                   UpDatess.setMnemonic(KeyEvent.VK_U);
 
                   UpDatess.addActionListener(this);

                   UpDatess.setToolTipText("PRESS TO UPDATE THE DRUGS");
  
                  getContentPane().add(UpDatess);

                     inou=new JButton("About Stock");
 
                       inou.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   inou.setForeground(new Color(0,0,255));
 
                     inou.setBounds(770,550,210,70);

                      inou.setMnemonic(KeyEvent.VK_K);
  
                   inou.addActionListener(this);

                    inou.setToolTipText("PRESS TO KNOW ABOUT THE DRUGS STOCK");
   
                     getContentPane().add(inou);
                     
	   
	   back=new JButton("BACK");

                    back.setFont(new Font("Arial Narrow",Font.BOLD,25));

	   back.setForeground(new Color(204,0,0));
 
 	   back.setBounds(400,580,250,70);

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

        	      else if(ae.getActionCommand().equals("Insert Drugs"))

	       		{
        	    	  InsertDrug i=new InsertDrug();
		          
                                                    }

                else if(ae.getActionCommand().equals("View  Drugs "))

       		{     
                                            ViewDrug s=new ViewDrug();
		          
                                   }

                else if(ae.getActionCommand().equals("Update  Drugs "))

       		{     
                                            UpdateDrug s=new UpdateDrug();
		          
                                   }

         else if(ae.getActionCommand().equals("About Stock"))

	 	      {
	
                                               AbSt a=new AbSt();

	                        }
        


             }


   public static void main(String args[])
  
    {
  
     DrugStore d=new DrugStore();

    }

}



