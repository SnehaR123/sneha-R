import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ViewDrug extends JFrame implements ActionListener
{
	JLabel bno,drugname,company,istock,mfdate,exdate,shead;
	JTextField tbno,tdrugname,tcompany,tistock,tmfdate,texdate;
	JButton submit;
	Container cp;
	 public ViewDrug()
	 {
		 setLayout(null);

		 setTitle("Drugs");

		 setBounds(0,0,1020,725);

		  shead=new JLabel("VIEW DRUGS ");

		  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

		  shead.setForeground(new Color(204,102,0));

		  shead.setHorizontalAlignment(SwingConstants.CENTER);

	      shead.setBounds(350,20,360,60);

		 getContentPane().add(shead);


	     

		 bno=new JLabel("BATCHNO");
		   bno.setBounds(50,50,150,20);
		   bno.setFont(new Font("Arial Narrow",Font.BOLD,24));

		 drugname=new JLabel("DRUGNAME");
		drugname.setBounds(50,100,150,20);
drugname. setFont(new Font("Arial Narrow",Font.BOLD,24));

		 company=new JLabel("COMPANY");
		 company.setBounds(50,150,150,20);
          company.setFont(new Font("Arial Narrow",Font.BOLD,24));

		 istock=new JLabel("ISTOCK");
		 istock.setBounds(50,200,150,20);
           istock.setFont(new Font("Arial Narrow",Font.BOLD,24));

		 mfdate=new JLabel("MFG DATE");
		 mfdate.setBounds(50,250,150,20);
mfdate.setFont(new Font("Arial Narrow",Font.BOLD,24));

		 exdate=new JLabel("EX DATE");
		 exdate.setBounds(50,300,150,20);
          exdate.setFont(new Font("Arial Narrow",Font.BOLD,24));

		 tbno=new JTextField(23);
		 tbno.setBounds(180,50,150,30);
		 tbno.setFont(new Font("Arial Narrow",Font.BOLD,18));

		 tdrugname=new JTextField(23);
		 tdrugname.setBounds(180,100,150,30);
		 tdrugname.setFont(new Font("Arial Narrow",Font.BOLD,18));

		 
		 tcompany=new JTextField(23);
		tcompany.setBounds(180,150,150,30);
		tcompany.setFont(new Font("Arial Narrow",Font.BOLD,18));

		 tistock=new JTextField(23);
		 tistock.setBounds(180,200,150,30);
		tistock.setFont(new Font("Arial Narrow",Font.BOLD,18));

		 tmfdate=new JTextField(23);
		tmfdate.setBounds(180,250,150,30);
		tmfdate.setFont(new Font("Arial Narrow",Font.BOLD,18));

		 texdate=new JTextField(23);
	 texdate.setBounds(180,300,150,30);
	 texdate.setFont(new Font("Arial Narrow",Font.BOLD,18));

		// submit=new JButton("ok");
		  submit=new JButton("SUBMIT");

         submit.setFont(new Font("Arial Narrow",Font.BOLD,22));
		 // submit.setBounds(350,530,175,20);
        submit.setBounds(230,440,200,30);

	     // submit.setForeground(new Color(0,0,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the details");
   
         getContentPane().add(submit); 

		 //submit.setBounds(320,600,50,50);
          add(shead);
		 add(bno);
		 add(tbno);
		 add(drugname);
		 add(tdrugname);
		 add(company);
		 add(tcompany);
		 add(istock);
		 add(tistock);
		
		 add(mfdate);
		 add(tmfdate);
		 add(exdate);
		 add(texdate);
		 add(submit);
		 setVisible(true);
				 }
	 public static void main(String []args)
	 {
		 ViewDrug v=new ViewDrug();
	 }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==submit)
		{

	        try {  
	            String str = tbno.getText();  
	            Class.forName("com.mysql.jdbc.Driver");  
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");  
	            PreparedStatement st = con.prepareStatement("select * from drugs where batchno=?");  
	            st.setString(1, str);  
	            //Excuting Query  
	            ResultSet rs = st.executeQuery();  
	            if (rs.next()) {  
	                String s = rs.getString(1);  
	                String s1 = rs.getString(2);  
	                String s2 = rs.getString(3);  
	                String s3 = rs.getString(4);  
	                String s4= rs.getString(5); 
	                String s5 = rs.getString(6); 
	              //  String s6 = rs.getString(7); 
	               // String s7 = rs.getString(8);  
	                
	                
	                
	                //Sets Records in TextFields.  
	                tdrugname.setText(s1);  
	                tcompany.setText(s2);  
	                tistock.setText(s3);  
	                tmfdate.setText(s4);  
	                texdate.setText(s5);
	               // JOptionPane.showMessageDialog(null, "Name  Found");
	                
	                JOptionPane.showMessageDialog(null,"Drug viewed","Correct data",JOptionPane.INFORMATION_MESSAGE);
					
	            } else {  
	                JOptionPane.showMessageDialog(null, "Name not Found");  
	            }  
	            //Create Exception Handler  
	        } catch (Exception ex) {  
	            System.out.println(ex);  
	        }  
	   
			
		}
		// TODO Auto-generated method stub
		
	}

}
