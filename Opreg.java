
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;



public class Opreg extends JFrame implements ActionListener

{    

     String popno,pname,pdate,pdiag,psex,poccu;

     int page;    
   
     JLabel head,shead,name,age,opno,date,sex,diag,occu;

     JTextField tname,tage,tdate,topno,toccu;

     JTextArea dtext;

     JButton but1,but2;
 
     JRadioButton rad1,rad2;

     ButtonGroup bgroup;

     public Opreg()
 
      {
 

          setLayout(null);

          setTitle("Patient Registration");

          setBounds(0,0,1030,730);

	  head=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  head.setForeground( Color.RED);

	  head.setHorizontalAlignment(SwingConstants.CENTER);

          head.setBounds(150,50,660,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("OUT-PATIENT REGISTRATION");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  shead.setForeground(new Color(51,51,255));

	  shead.setHorizontalAlignment(SwingConstants.CENTER);

          shead.setBounds(280,120,370,50);

	  getContentPane().add(shead);

	
	  name=new JLabel("NAME");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.LEFT);

          name.setBounds(120,200,80,30);

	  getContentPane().add(name);



	  age=new JLabel("AGE");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.LEFT); 

          age.setBounds(530,200,40,30);

	  getContentPane().add(age);
	
	  
	  opno=new JLabel("OP NO");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.LEFT);

          opno.setBounds(120,250,60,30);

	  getContentPane().add(opno);
  

	  date=new JLabel("DATE");

	  date.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  date.setForeground(new Color(204,0,51));

	  date.setHorizontalAlignment(SwingConstants.LEFT);

          date.setBounds(530,250,40,30);

	  getContentPane().add(date);

		
	  sex=new JLabel("SEX");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.LEFT);

          sex.setBounds(120,310,60,30);

	  getContentPane().add(sex);


          occu=new JLabel("OCCUPATION");

	  occu.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  occu.setForeground(new Color(204,0,51));

	  occu.setHorizontalAlignment(SwingConstants.LEFT);

          occu.setBounds(480,310,100,30);

	  getContentPane().add(occu);

         
          diag=new JLabel("DIAGNOSIS");

	  diag.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  diag.setForeground(new Color(204,0,51));

	  diag.setHorizontalAlignment(SwingConstants.LEFT);

          diag.setBounds(110,370,80,30);

	  getContentPane().add(diag);


          tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tname.setBounds(200,200,240,30);

          getContentPane().add(tname);


	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tage.setBounds(590,200,250,30);

          getContentPane().add(tage);

               
	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

          topno.setBounds(200,250,240,30);

          getContentPane().add(topno);


	  toccu=new JTextField(30);

	  toccu.setFont(new Font("Arial Narrow",Font.BOLD,12));

          toccu.setBounds(590,310,250,30);

          getContentPane().add(toccu);

	
	  tdate=new JTextField(30);

	  tdate.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdate.setBounds(590,250,250,30);

          getContentPane().add(tdate);

          dtext=new JTextArea(5,10);
          dtext.setFont(new Font("Arial Narrow",Font.BOLD,12));

	  dtext.setBounds(200,380,480,200);

          getContentPane().add(dtext);

          

          
          but1=new JButton("SUBMIT");

          but1.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
          but1.setBounds(820,573,100,40);

	  but1.setForeground(new Color(51,153,255));

          but1.setMnemonic(KeyEvent.VK_S);
  
          but1.addActionListener(this);

          but1.setToolTipText("Press to submit the detials");
   
         getContentPane().add(but1); 

                    
          but2=new JButton("EXIT");

          but2.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
          but2.setBounds(820,630,100,40);

	  but2.setForeground(new Color(51,153,255));

          but2.setMnemonic(KeyEvent.VK_X);
  
          but2.addActionListener(this);

          but2.setToolTipText("Press to Register the In-Paitent ");
   
          getContentPane().add(but2); 
               
               

	  rad1=new JRadioButton("MALE");
	 
	  rad1.setBounds(200, 320, 85, 15);  
	  rad1.setForeground(new Color(204,0,51));
          
          getContentPane().add(rad1);
    

          rad2=new JRadioButton("FEMALE");
	 
	  rad2.setBounds(330, 320, 85, 15); 
	  rad2.setForeground(new Color(204,0,51));
          
          getContentPane().add(rad2);
    

          bgroup=new ButtonGroup();

          bgroup.add(rad1);

          bgroup.add(rad2);
        
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
   
           
               if(ae.getSource()==but1)

                 {
                      
                         try

			   { 
                        	 Class.forName("com.mysql.jdbc.Driver");

			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                                                          
                              System.out.println("hgh");                        
			      pname=tname.getText();

                              page=Integer.parseInt(tage.getText());

                              popno=topno.getText();

                              pdate=tdate.getText();

                              psex= bgroup.getSelection().getActionCommand();

			      poccu=toccu.getText();

                              pdiag=dtext.getText();
                              System.out.println("hgh");
			      PreparedStatement psms=ms.prepareStatement("insert into oregis values(?,?,?,?,?,?,?)");
			      System.out.println("updatd1");

                    
			      psms.setString(1,pname);

                              psms.setInt(2,page);

			      psms.setString(3,popno);
			      System.out.println("updatd2");


			      psms.setString(4,pdate);

                              psms.setString(5,psex);

			      psms.setString(6,poccu);

                              psms.setString(7,pdiag);
                              System.out.println("updatd3");

			      psms.executeUpdate();
			      JOptionPane.showMessageDialog(null,"Record Updated","Wrong Password",JOptionPane.ERROR_MESSAGE);
			  	
System.out.println("updatd4");
			      psms.close();

                              ms.close();
                              
                              
                           }
                  
                          catch(Exception ex){  System.out.println(ex.getMessage()); }
       }


               else if(ae.getActionCommand().equals("Exit"))

    {
           
             dispose();

    }
       }
  public static void main(String args[])
  
      {
 
          Opreg i=new Opreg();

       }
}                     
                        

