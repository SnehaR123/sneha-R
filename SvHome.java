

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

 public class SvHome extends JFrame

      {
 
                JLabel  stop,sdown,label;
                      
                  public SvHome()
          
                    {   
	     setLayout(null);

                              setBounds(0,0,1020,735);

                              setTitle("Home Page Demo");

                      Container contentpane=getContentPane();
        
	   stop=new JLabel(" HEALTH CARE CENTRE, COIMBATORE");

	  stop.setFont(new Font("Arial Narrow",Font.BOLD,36));

	  stop.setForeground( Color.RED);

	  stop.setHorizontalAlignment(SwingConstants.CENTER);

         	 stop.setBounds(120,50,650,30);

	  getContentPane().add(stop);

          
  	  sdown=new JLabel("----------------------------------------------------------------------------------------------------------------------");

	  sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  sdown.setForeground(new Color(0,0,153));

	  sdown.setHorizontalAlignment(SwingConstants.LEADING);

	  sdown.setBounds(130,70,650,20);

	  getContentPane().add(sdown);

                     
                      label=new JLabel("");

	  label.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  label.setForeground(new Color(0,0,153));

	  label.setIcon(new ImageIcon("E:\\SvHospital\\code\\cart.gif"));

	  label.setHorizontalAlignment(SwingConstants.LEADING);

	  label.setBounds(760,10,200,110);

	  getContentPane().add(label);
                            
 
                               JTabbedPane jtp=new JTabbedPane();
 
                                jtp.addTab("Project",new HomePanel());

                                jtp.addTab("Staff Pattern",new SpecialPanel());

                                jtp.addTab("Beneficiaries",new FacilitesPanel());

                                jtp.addTab("Customer Review",new PMembers());

//                                jtp.addTab("Pshycological counseling center",new PccPanel());

                                jtp.setBounds(10,110,1000,550);

                                getContentPane().add(jtp);
 
                                    
                                 setVisible(true);

                                addWindowListener(new WindowAdapter(){
                        
                                                                     public void windowClosing(WindowEvent we)
    
                                                                                      {

					      dispose();

             				               }
 
				});

      }

          public static void main(String  args[])
              
                  {

		SvHome s=new SvHome();

                 }

}              

             class HomePanel extends JPanel
   
             {

                       JLabel mts;

                     public HomePanel()
                              {
										  mts=new JLabel("");

	                                      mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                          mts.setForeground(new Color(0,0,255));
			
 										//  mts.setIcon(new ImageIcon("C:/propics\\IProject.jpg"));
 										 mts.setIcon(new ImageIcon("C:/propics\\Captureab.PNG"));

                                          mts.setHorizontalAlignment(SwingConstants.LEADING);

                                          mts.setBounds(10,10,590,30);
                
                                          add(mts);
                                         
                                          
         
                              }         }
                     
            									
                class SpecialPanel extends JPanel

                {
		  JLabel mts;


                                 public SpecialPanel()

                                       {

                   
										 mts=new JLabel("");

	                                     mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                         mts.setForeground(new Color(0,0,255));
			
 										 mts.setIcon(new ImageIcon("C:\\propics\\Capture9.PNG"));

                                         mts.setHorizontalAlignment(SwingConstants.LEADING);

                                         mts.setBounds(10,10,590,30);
                
                                         add(mts);
                                   
 
                                       }

                }

            class FacilitesPanel extends JPanel

              {
            
                                          JLabel  mts,mts1,mts2,mts3,uss, ust,uts1,uts2,xray,dw,cd,imm,ann,fas;
                                          JTextArea mi;

                                                      public  FacilitesPanel()
                                                        
					                                  {
                                                    	 
						                                  mts=new JLabel();
							                              mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                                          mts.setForeground(new Color(0,0,255));
			
 														  mts.setIcon(new ImageIcon("C:\\propics\\Capture1.PNG"));

                                                          mts.setHorizontalAlignment(SwingConstants.LEADING);

														  mts.setBounds(10,10,590,30);
                
                                                          add(mts);


														 mts1=new JLabel("");
														 mts1.setFont(new Font("Arial Narrow",Font.BOLD,18));

                                                      mts1.setForeground(new Color(0,0,255));

                                                     mts1.setHorizontalAlignment(SwingConstants.LEADING);

                                                     mts1.setBounds(10,10,590,30);

                                                     add(mts1); 
                                                       setVisible(true);

                                                          }
             }
 
         class PMembers extends JPanel
 
                   {
        	 JLabel mts;
                          
                                           public PMembers()
                                              {

      										 mts=new JLabel("");

      	                                     mts .setFont(new Font("Arial Narrow",Font.BOLD,24));

                                               mts.setForeground(new Color(0,0,255));
      			
       										 mts.setIcon(new ImageIcon("C:\\propics\\Capture2.PNG"));

                                               mts.setHorizontalAlignment(SwingConstants.LEADING);

                                               mts.setBounds(10,10,590,30);
                      
                                               add(mts);
                                         
                                              }
                   }

    