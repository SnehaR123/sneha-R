



	import java.awt.*;

	import java.awt.event.*;

	import javax.swing.*;

	import java.sql.*;

	
	 public class AbSt extends JFrame implements ActionListener

	  {
	  

		private static final long serialVersionUID = 1L;


		String Dname,dbno,exdate,selectString;;

	    
	    int istock,ostock,total;
	     
	    
	    JLabel shead,ssub,dname,instock,outstock,remain,exda,dname1,stockD,output;


	    JTextField dn,dtext,dexda,dremain,stockD1,output1;

	  
	    JButton submit,back,order,StockDe,res;


	     public AbSt()

	     {
	    
	          setLayout(null);

	          setTitle("Drugs");

	          setBounds(10,10,1020, 725);       


		  shead=new JLabel("STOCK DETAILS");

		  shead.setFont(new Font("Arial Narrow",Font.BOLD,40));

		  shead.setForeground(new Color(204,102,0));

		  shead.setHorizontalAlignment(SwingConstants.CENTER);

	                    shead.setBounds(220,80,490,50);

		  getContentPane().add(shead);


	                    ssub=new JLabel("   _ _ _ _ _ _ _ _ _ _ _ _    ");

		  ssub.setFont(new Font("Arial Narrow",Font.BOLD,40));

		  ssub.setForeground( Color.RED);

		  ssub.setHorizontalAlignment(SwingConstants.CENTER);

	                     ssub.setBounds(260,65,420,100);;

		  getContentPane().add(ssub);

		
		  dname=new JLabel("BATCH NO:");

		  dname.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  dname.setForeground(new Color(0,0,0));

		  dname.setHorizontalAlignment(SwingConstants.CENTER);

	                    dname.setBounds(120,180,130,40);

		  getContentPane().add(dname);
		  dname1=new JLabel("DRUG NAME:");

		  dname1.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  dname1.setForeground(new Color(0,0,0));

		  dname1.setHorizontalAlignment(SwingConstants.CENTER);

	                    dname1.setBounds(120,250,130,40);

		  getContentPane().add(dname1);
	
	                   remain=new JLabel("STOCK:");
	 
		  remain.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  remain.setForeground(new Color(0,0,0));

		  remain.setHorizontalAlignment(SwingConstants.CENTER);

	                    remain.setBounds(70,350,180,30);

		  getContentPane().add(remain);
	                                                  

	                    exda=new JLabel("EX-DATE:");

		  exda.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  exda.setForeground(new Color(0,0,0));

		  exda.setHorizontalAlignment(SwingConstants.TRAILING);

	                    exda.setBounds(440,350,100,30);

		  getContentPane().add(exda);
		 
		  stockD=new JLabel("OSTOCK:");

		  stockD.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  stockD.setForeground(new Color(0,0,0));

		  stockD.setHorizontalAlignment(SwingConstants.TRAILING);

		  stockD.setBounds(70,450,180,30);

		  getContentPane().add(stockD);
		 
		  output=new JLabel("TOTAL:");

		  output.setFont(new Font("Arial Narrow",Font.BOLD,24));

		  output.setForeground(new Color(0,0,0));

		  output.setHorizontalAlignment(SwingConstants.TRAILING);

		  output.setBounds(70,550,180,30);

		  getContentPane().add(output);

	  dn=new JTextField(30);

		  dn.setFont(new Font("Arial Narrow",Font.BOLD,18));

	                   dn.setBounds(280,180,410,30);

	                  getContentPane().add(dn);

	                     dtext=new JTextField(30);

		  dtext.setFont(new Font("Arial Narrow",Font.BOLD,18));

	                   dtext.setBounds(280,250,410,30);

	                  getContentPane().add(dtext);

			
	                   dexda=new JTextField(30);
	 
		  dexda.setFont(new Font("Arial Narrow",Font.BOLD,18));

	                   dexda.setBounds(550,350,140,30);

	                     getContentPane().add(dexda);
		

	                     dremain=new JTextField(30);

		  dremain.setFont(new Font("Arial Narrow",Font.BOLD,18));

	                     dremain.setBounds(279,350,120,30);
	 
	                     getContentPane().add(dremain);
	                     stockD1=new JTextField(30);

	                     stockD1.setFont(new Font("Arial Narrow",Font.BOLD,18));

	                     stockD1.setBounds(279,450,120,30);
	           	 
	           	                     getContentPane().add(stockD1);
	           		                       
	           	                  output1=new JTextField(30);

	           	               output1.setFont(new Font("Arial Narrow",Font.BOLD,18));

	           	            output1.setBounds(279,550,120,30);
	     	           	 
	     	           	                     getContentPane().add(output1);

		                       
	                      submit=new JButton("SUBMIT");

	                      submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	                      submit.setBounds(760,180,160,40);

	                      submit.setForeground(new Color(51,153,255));

	                     // submit.setBackground(Color.CYAN);

	                      submit.setMnemonic(KeyEvent.VK_S);
	   
	                      submit.addActionListener(this);

	                      submit.setToolTipText("Press to submit the details");
	   
	                      getContentPane().add(submit); 


	                      back=new JButton("BACK");

	                      back.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	                      back.setBounds(620,540,160,40);

	                      back.setForeground(new Color(51,153,255) );

	                    //  back.setBackground(Color.CYAN);                     

	                      back.setMnemonic(KeyEvent.VK_B);
	  
	                      back.addActionListener(this);

	                      back.setToolTipText("Press to dispose");
	   
	                      getContentPane().add(back);
	                    
	                      res=new JButton("CHECK");

	                      res.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	                      res.setBounds(420,540,160,40);

	                      res.setForeground(new Color(51,153,255) );

	                    //  back.setBackground(Color.CYAN);                     

	                      res.setMnemonic(KeyEvent.VK_B);
	  
	                      res.addActionListener(this);

	                      res.setToolTipText("Press to dispose");
	   
	                      getContentPane().add(res);

	                      StockDe=new JButton("ISSUED");

	                      StockDe.setFont(new Font("Arial Narrow",Font.BOLD,18));
	 
	                      StockDe.setBounds(420,440,160,40);

	                      StockDe.setForeground(new Color(51,153,255) );

	                    //  back.setBackground(Color.CYAN);                     

	                      StockDe.setMnemonic(KeyEvent.VK_B);
	  
	                      StockDe.addActionListener(this);

	                      StockDe.setToolTipText("Press to dispose");
	   
	                      getContentPane().add(StockDe);
	                    StockDe.addActionListener(new ActionListener()
	              		{
	              	public void actionPerformed(ActionEvent e)
	              	{
	              		try
	              		{
	              			
	              			 Class.forName("com.mysql.jdbc.Driver");

	              			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
	                                                                         
	              // popno=cb.addItem();

	              PreparedStatement pstmt=ms.prepareStatement("Select NoOFDRUGS from pharmacy");

	              //pstmt.setInt(1,(int) cb.getSelectedItem()); 
	                       System.out.println("hjhj");                                      
	              ResultSet rs=pstmt.executeQuery();     
	              while(rs.next())
	              {
	            	  stockD1.setText(rs.getString("NoOFDRUGS"));

	              }
	              pstmt.close();
	             // JOptionPane.showMessageDialog(null,"Record Viewed ","Success Data",JOptionPane.INFORMATION_MESSAGE);

	              ms.close();
	                   
	                   



	              //cb.addItem(rs.getString(1));                                                             

	              		}
	              		catch(Exception ex)
	              		{
	              			System.out.println(ex);
	              		}
	              	}
	              		});
	                    res.addActionListener(new ActionListener()
	                    		{
	                    	
	                    		
	                    public void actionPerformed(ActionEvent ae1)
	          	      {
	          	      	if(ae1.getSource()==res)
	          	      	{
	          	      		  int units = Integer.parseInt(dremain.getText());

	          	      		   int unitPrice = Integer.parseInt(stockD1.getText());
	          	      		  int total1 =  (unitPrice-units);

	          	      	output1.setText(String.valueOf(total1));
	          	      	}
	          	      try
	              		{
	              			
	              			 Class.forName("com.mysql.jdbc.Driver");

	              			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
	                                                                         
	              // popno=cb.addItem();

	              PreparedStatement pstmt=ms.prepareStatement("update drugs set istock=? where batchno=?");
                  
	              pstmt.setInt(1,Integer.parseInt(output1.getText()));
	              pstmt.setString(2, dn.getText());
	              pstmt.executeUpdate();
	                       System.out.println("hjhj");                                      
	             	              pstmt.close();
	              JOptionPane.showMessageDialog(null,"Stock checked ","Success Data",JOptionPane.INFORMATION_MESSAGE);

	              ms.close();
	                   
	                   



	              //cb.addItem(rs.getString(1));                                                             

	              		}
	              		catch(Exception ex)
	              		{
	              			System.out.println(ex);
	              		}

	          	      }
	          	      		});


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

				     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
	                                                            
	                                                        

				                                           
	      Dname=dtext.getText();
	     String str = dn.getText(); 
	  PreparedStatement pstmt=ms.prepareStatement("select DRUGNAME,EXDATE,ISTOCK from drugs where BATCHNO= ?");
	  pstmt.setString(1,str);

	  ResultSet rs = pstmt.executeQuery();  
      if (rs.next())
      {  
          String s = rs.getString(1);  
          String s1 = rs.getString(2);  
          String s2 = rs.getString(3);  
        
          dtext.setText(s);  
           
          dexda.setText(s1);  
          dremain.setText(s2);
          JOptionPane.showMessageDialog(null, "Stock checked");
         
	                                                               
      }
	                          
	                                                                                                                                                 
	  pstmt.close();
	                                                                   
	  ms.close();

	                          }

 catch(Exception ex)
				     {  
	 JOptionPane.showMessageDialog(null, "Drug Name Not Found");
	 System.out.println(ex.getMessage()); }
	                   }


	      }
	     	      		   public static void main(String args[])

	    {
	    
	       AbSt a=new AbSt();

	    }

	}





	   

