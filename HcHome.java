

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class HcHome extends JFrame implements ActionListener

{
   
   JButton  aboutHc,mts,ultraSound,xRay,bioChemical,register,drugStore,lumberRoom,wards,other,exit;
   
   JLabel svcHc,homePage,image;

   public HcHome()
    
     {
     
        setLayout(null);
	
	setTitle("Home Page");
	
                    setBounds(0,0,1020, 729);
	 
	svcHc=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

	svcHc.setFont(new Font("Arial Narrow",Font.BOLD,45));
	svcHc.setForeground( Color.RED);

        svcHc.setHorizontalAlignment(SwingConstants.CENTER);

        svcHc.setBounds(120,20,780,70);

        getContentPane().add(svcHc);
 
	
	homePage=new JLabel("HOME PAGE");

	homePage.setFont(new Font("Arial Narrow",Font.BOLD,35));

	homePage.setForeground(new Color(102,102,255));

                  homePage.setHorizontalAlignment(SwingConstants.CENTER);

                  homePage.setBounds(400,100,200,50);
 
                  getContentPane().add(homePage);


	image=new JLabel("Home Page");

	image.setFont(new Font("Arial Narrow",Font.BOLD,35));

	image.setForeground(new Color(102,102,255));

                  image.setHorizontalAlignment(SwingConstants.CENTER);

                  image.setIcon(new ImageIcon("C:\\propics\\aO.jpg"));

                  image.setBounds(250,170,770,500);
 
                  getContentPane().add(image);
 
 
       
                     aboutHc=new JButton("About HC");

                     aboutHc.setFont(new Font("Arial Narrow",Font.BOLD,22));

	 aboutHc.setForeground(new Color(255, 0, 0));
 
                   aboutHc.setBounds(20,190,170,40);

	 aboutHc.setMnemonic(KeyEvent.VK_A);

                   aboutHc.addActionListener(this);

 
                 aboutHc.setToolTipText("Press it to know About Our Health Center");

                   getContentPane().add(aboutHc);


                    mts=new JButton("Case Records");
 
                   mts.setFont(new Font("Arial Narrow",Font.BOLD,22));

                     mts.setForeground(new Color(255, 0, 0));
 
                     mts.setBounds(20,440,170,40);

                     mts.setMnemonic(KeyEvent.VK_C);

                    mts.addActionListener(this);
 
    
        mts.setToolTipText("Press it to know About Medical Treatment Services Provided at Hc ");

        getContentPane().add(mts);


	register=new JButton("Registration");

        register.setFont(new Font("Arial Narrow",Font.BOLD,22));

	register.setForeground(new Color(255, 0, 0));
 
        register.setBounds(20,280,170,40);

        register.setMnemonic(KeyEvent.VK_O);

        register.addActionListener(this);

    //  principal.addKeyListener(this);
 
        register.setToolTipText("Press it to know About register Details at Hc ");

        getContentPane().add(register);
           
        
	drugStore=new JButton("Drug Store");

        drugStore.setFont(new Font("Arial Narrow",Font.BOLD,22));

	drugStore.setForeground(new Color(255, 0, 0));
 
        drugStore.setBounds(20,360,170,40);

        drugStore.setMnemonic(KeyEvent.VK_S);

        drugStore.addActionListener(this);

    //  principal.addKeyListener(this);
 
        drugStore.setToolTipText("Press it to know About Drug Store at Hc ");

        getContentPane().add(drugStore);
           

	other=new JButton("Daily Entries");

        other.setFont(new Font("Arial Narrow",Font.BOLD,22));

	other.setForeground(new Color(255, 0, 0));
 
 	other.setBounds(20,520,170,40);

        other.setMnemonic(KeyEvent.VK_D);

        other.addActionListener(this);

    //  principal.addKeyListener(this);
 
        other.setToolTipText("Press it to know About the daily entries ");

        getContentPane().add(other);
        
                                                                                       
	exit=new JButton("Exit");

        exit.setFont(new Font("Arial Narrow",Font.BOLD,22));

	exit.setForeground(new Color(255, 0, 0));
 
 	exit.setBounds(20,600,170,40);

        exit.setMnemonic(KeyEvent.VK_E);

        exit.addActionListener(this);

    //  principal.addKeyListener(this);
 
        exit.setToolTipText("Press it to Exit ");

        getContentPane().add(exit);
       
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

	      if(ae.getActionCommand().equals("Exit"))

	       {

 	        dispose();

	       }

	      else if(ae.getActionCommand().equals("About HC"))

	       {

	         SvHome  a=new SvHome();

	       }


	      else if(ae.getActionCommand().equals("Case Records"))

	       {

	    	  caserec m=new caserec();

	        }

                         else if(ae.getActionCommand().equals("Registration"))

	       {
	
                        	 Registerrec r=new Registerrec();

	       }

                         else if(ae.getActionCommand().equals("Drug Store"))

	       {
	
	                DrugStore o=new DrugStore();

	       }



		 else if(ae.getActionCommand().equals("Daily Entries"))

	       {

              
			DEntries d=new DEntries();

 	      }	
   }      

     public static  void main(String args[])

	{

		HcHome h=new HcHome();

        }
}

