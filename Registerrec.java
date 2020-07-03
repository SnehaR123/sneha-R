


	import java.awt.*;

	import java.awt.event.*;

	import javax.swing.*;
	 
	import java.sql.*;

	import java.io.*;

	public class Registerrec extends JFrame implements ActionListener

	{


	   	 JLabel head,shead,label;

		JButton insert,view,reset;

	                 public Registerrec()
	            
	                  {   
	                    setLayout(null);

	                   setTitle("Registration of Patient");

	           //      setMinimumSize(new Dimension(1030,730));

	                   setBounds(0,0,1020,725);

		  head=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

		  head.setFont(new Font("Arial Narrow",Font.BOLD,36));

		  head.setForeground( Color.RED);

		  head.setHorizontalAlignment(SwingConstants.CENTER);

	                   // head.setBounds(210,24,520,60);
		  head.setBounds(210,20,570,60);


		  getContentPane().add(head);

		  
		  shead=new JLabel("REGISTRATION RECORD");

		  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

		  shead.setForeground(new Color(51,51,255));

		  shead.setHorizontalAlignment(SwingConstants.CENTER);

	                    shead.setBounds(210,100,510,50);

		  getContentPane().add(shead);


	                    label=new JLabel("Registration Record");

		  label.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  label.setForeground(new Color(51,51,255));

		   label.setIcon(new ImageIcon("C:\\propics\\Wow1.jpg"));
	        

		  label.setHorizontalAlignment(SwingConstants.CENTER);

	                    label.setBounds(480,250,440,400);

		  getContentPane().add(  label);
	               

	                    insert=new JButton("ADD PATIENTS");

	         	  insert.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	        	  insert.setBounds(80,230,310,80);

//		  but1.setForeground(new Color(51,153,255));

		  insert.setMnemonic(KeyEvent.VK_S);
	  
	                     insert.addActionListener(this);

	                     insert.setToolTipText("Press to enter new detials");
	   
	                     getContentPane().add(insert); 

		   
	                    view=new JButton("VIEW PATIENTS");

	         	  view.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	        	   view.setBounds(80,400,310,80);

//		  but1.setForeground(new Color(51,153,255));

		  view.setMnemonic(KeyEvent.VK_E);
	  
	                    view.addActionListener(this);

	                     view.setToolTipText("Press to enter new detials");
	   
	                     getContentPane().add(view); 

	                    
	                   reset=new JButton("RESET");

	                   reset.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
	 
	                   reset.setBounds(80,570,310,80);

//		  but2.setForeground(new Color(51,153,255));

	                   reset.setMnemonic(KeyEvent.VK_T);
	  
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
	   
			           if(ae.getActionCommand().equals("RESET"))

			              {
	                     
	                     		  dispose();

			              }

				   else if(ae.getActionCommand().equals("ADD PATIENTS"))

	                			   {
		                      
	                                                                IReg i=new IReg();

	                                                          }

	 			  else if(ae.getActionCommand().equals("VIEW PATIENTS"))
	                        
	                                                            {

	 				 Registeredperson r=new Registeredperson();

	                                                               }
	                                          } 

	                                   public static void main(String args[])
	                   
	                                        {

	                                             Registerrec r=new Registerrec();

	                                        }

	}   


