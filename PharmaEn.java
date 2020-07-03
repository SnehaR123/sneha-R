
import javax.swing.*;

import java.sql.*;

import java.awt.*;

import java.awt.event.*;

public class PharmaEn extends JFrame implements ActionListener
{
	JLabel stop,sdown,img,Drug,Drugiss,opno3,date3,ldate;

	
	JButton submit,back,Item;

	JTextField topno,tdrug1,tdate,tdrugissued1;

	JComboBox cb;
	
	String date,drug1;

	int  issued1,opno;

	public PharmaEn()
	{
		setLayout(null);

        setTitle("In-Patient Registration");

        setBounds(0,0,1020,725);

	   
	    stop=new JLabel("HEALTH CARE CENTRE,COIMBATORE");

	    stop.setFont(new Font("Arial Narrow",Font.BOLD,24));

	    stop.setForeground(Color.RED);

	    stop.setHorizontalAlignment(SwingConstants.CENTER);

        stop.setBounds(120,20,590,30);

	    getContentPane().add(stop);

          
        sdown=new JLabel("Pharmacy Entries");

	    sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	    sdown.setForeground( Color.RED);

	    sdown.setHorizontalAlignment(SwingConstants.CENTER);

        sdown.setBounds(300,60,250,20);

	    getContentPane().add(sdown);

		 
		opno3=new JLabel("OP NO");

		opno3.setFont(new Font("Arial Narrow",Font.BOLD,18));

		opno3.setForeground(new Color(0,0,153));

		opno3.setHorizontalAlignment(SwingConstants.LEFT);

		opno3.setBounds(60,80,180,40);

		getContentPane().add(opno3);


     
        
		ldate=new JLabel("DATE");

		ldate.setFont(new Font("Arial Narrow",Font.BOLD,18));

		ldate.setForeground(new Color(0,0,153));

		ldate.setHorizontalAlignment(SwingConstants.LEFT);

		ldate.setBounds(60,135,180,40);

		getContentPane().add(ldate);


        Drug=new JLabel("DRUGNAME");

        Drug.setFont(new Font("Arial Narrow",Font.BOLD,18));

        Drug.setForeground(new Color(0,0,153));

        Drug.setHorizontalAlignment(SwingConstants.LEFT);

        Drug.setBounds(60,185,180,40);

		getContentPane().add(Drug);


		Drugiss=new JLabel("NO.OF DRUGS");

		Drugiss.setFont(new Font("Arial Narrow",Font.BOLD,18));

		Drugiss.setForeground(new Color(0,0,153));

		Drugiss.setHorizontalAlignment(SwingConstants.LEFT);

		Drugiss.setBounds(60,235,180,40);

		getContentPane().add(Drugiss);


		topno=new JTextField();

		topno.setFont(new Font("Times New Roman",Font.BOLD,18));

		topno.setForeground(new Color(55,55,153));

		topno.setBounds (240,90,230,30);
		  Item=new JButton("View");

	       Item.setFont(new Font("Arial Narrow",Font.BOLD,18));
Item. setForeground(new Color(0,0,255));
	       Item.setBounds(590,80,160,40);
	       getContentPane().add(Item);
	Item.addActionListener(this);


        //getContentPane().add(topno);

		cb=new JComboBox();
    	 cb.setFont(new Font("Arial Narrow",Font.BOLD,12));
       cb.setBounds(240,90,230,30);
       getContentPane().add(cb);
      
       Item.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			
			 Class.forName("com.mysql.jdbc.Driver");

			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                                                           
// popno=cb.addItem();

PreparedStatement pstmt=ms.prepareStatement("Select opno from register");

//pstmt.setInt(1,(int) cb.getSelectedItem()); 
         System.out.println("hjhj");                                      
ResultSet rs=pstmt.executeQuery();     
while(rs.next())
{
cb.addItem(rs.getInt(1));

}
pstmt.close();
//JOptionPane.showMessageDialog(null,"Record Viewed ","Success Data",JOptionPane.INFORMATION_MESSAGE);

ms.close();
     
     



//cb.addItem(rs.getString(1));                                                             

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
		});

		tdate=new JTextField();

		tdate.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdate.setForeground(new Color(55,55,153));

		tdate.setBounds (240,140,230,30);

        getContentPane().add(tdate);

	
		tdrug1=new JTextField();

		tdrug1.setFont(new Font("Times New Roman",Font.BOLD,18));

		tdrug1.setForeground(new Color(55,55,153));

		tdrug1.setBounds (240,190,230,30);

        getContentPane().add(tdrug1);


	

         tdrugissued1=new JTextField();

        tdrugissued1.setFont(new Font("Times New Roman",Font.BOLD,18));

        tdrugissued1.setForeground(new Color(55,55,153));

        tdrugissued1.setBounds (240,240,230,30);

        getContentPane().add(tdrugissued1);


	   submit=new JButton("Submit");

	   submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
       submit.setBounds(300,345,160,40);

	   submit.setForeground(new Color(0,0,255));

       submit.setMnemonic(KeyEvent.VK_S);
  
       submit.addActionListener(this);

       submit.setToolTipText("Press to submit the detials");
   
       getContentPane().add(submit); 

     
	   
	   back=new JButton("Back");

       back.setFont(new Font("Arial Narrow",Font.BOLD,22));
 
       back.setBounds(480,345,160,40);

	   back.setForeground(new Color(0,0,255));

       back.setMnemonic(KeyEvent.VK_B);
  
       back.addActionListener(this);

       back.setToolTipText("Press to dispose");
   
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
	  
	   if(ae.getActionCommand().equals("Back"))

     	{ 
			  dispose();
		}

		else
			if(ae.getActionCommand().equals("Submit"))

	   {   
            try

		   {

		    Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
		

              opno=(int) cb.getSelectedItem();

			  date=tdate.getText();

			  drug1=tdrug1.getText();

			  issued1=Integer.parseInt(tdrugissued1.getText());

			
			  PreparedStatement pstm=con.prepareStatement("insert into pharmacy values(?,?,?,?)");
			                      
             
                            pstm.setInt(1,opno);
							
							pstm.setString(2,date);

                            pstm.setString(3,drug1);

							pstm.setInt(4,issued1);

						

							pstm.executeUpdate();
							  JOptionPane.showMessageDialog(null,"Drugs issued","Correct data",JOptionPane.INFORMATION_MESSAGE);
								
							pstm.close();

							con.close();


		   }

		    catch(Exception  ex){ 
		    	  JOptionPane.showMessageDialog(null,"Incorrect Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
		    		
		    	System.out.println(ex.getMessage());
		    } 

	              
       }
	  
}

		public static void main(String args[])
		{
                 PharmaEn a=new PharmaEn();
		}
}
