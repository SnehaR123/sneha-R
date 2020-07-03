

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
import java.sql.*;

import java.io.*;import java.lang.*;


public class InpatientRec extends JFrame implements ActionListener

{
      String pname,popno,psex,poccu,pdoa,pdod,pdia,pda,ppc,pph,ppe,pi; 

      int page,bedch,nod,am;

      JLabel stop,sdown,name,age,opno,sex,diag,occ,doa,dod,drua,preCom,hpl,ph,pe,inve,bed,days,amount;

      JButton submit,Exit,print;

      JTextField tname,tage,tsex,tdesg,tdoa,topno,tdod,tbed,tdays,tamount;

      JTextArea  adia,ada,aprec,aph,ape,ai;

      JScrollPane jScrollPane1,jScrollPane2,jScrollPane3,jScrollPane4,jScrollPane5,jScrollPane6;

       public InpatientRec()
 
      {
 

          setLayout(null);

          setTitle("In-Patient Registration");

         //  setMinimumSize(new Dimension(1030,730));

	 setBounds(0,0,1020,725);

	  stop=new JLabel(" HEALTH CARE CENTRE,COIMBATORE");

	  stop.setFont(new Font("Arial Narrow",Font.BOLD,24));

	  stop.setForeground(Color.RED);

	  stop.setHorizontalAlignment(SwingConstants.CENTER);

          stop.setBounds(120,20,590,30);

	  getContentPane().add(stop);

          
          sdown=new JLabel("IN-PATIENT CASE RECORD");

	  sdown.setFont(new Font("Arial Narrow",Font.BOLD,18));

	  sdown.setForeground(new Color(0,0,153));

	  sdown.setHorizontalAlignment(SwingConstants.CENTER);

          sdown.setBounds(300,60,250,20);

	  getContentPane().add(sdown);


          name=new JLabel("NAME");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  name.setForeground(new Color(204,0,51));

	  name.setHorizontalAlignment(SwingConstants.CENTER);

          name.setBounds(30,100,50,20);

	  getContentPane().add(name);



	  age=new JLabel("AGE");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  age.setForeground(new Color(204,0,51));

	  age.setHorizontalAlignment(SwingConstants.CENTER); 

          age.setBounds(254,100,40,20);

	  getContentPane().add(age);
	
	  
	  opno=new JLabel("O.P.NO");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  opno.setForeground(new Color(204,0,51));

	  opno.setHorizontalAlignment(SwingConstants.CENTER);

          opno.setBounds(30,140,50,30);

	  getContentPane().add(opno);
  
	  sex=new JLabel("SEX:");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  sex.setForeground(new Color(204,0,51));

	  sex.setHorizontalAlignment(SwingConstants.CENTER);

          sex.setBounds(410,100,40,20);

	  getContentPane().add(sex);

         
          occ=new JLabel("OCCUPATION:");

	  occ.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  occ.setForeground(new Color(204,0,51));

	  occ.setHorizontalAlignment(SwingConstants.CENTER);

          occ.setBounds(615,100,100,20);

	  getContentPane().add(occ);


          doa=new JLabel("DATE OF ADMISSION:");

	  doa.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  doa.setForeground(new Color(204,0,51));

	  doa.setHorizontalAlignment(SwingConstants.LEADING);

          doa.setBounds(240,140,130,20);

	  getContentPane().add(doa);

		
	  dod=new JLabel("DATE OF DISCHARGE:");

	  dod.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  dod.setForeground(new Color(204,0,51));

	  dod.setHorizontalAlignment(SwingConstants.CENTER);

          dod.setBounds(580,140,130,20);

	  getContentPane().add(dod);

         
          diag=new JLabel("DIAGNOSIS:");

	  diag.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  diag.setForeground(new Color(204,0,51));

	  diag.setHorizontalAlignment(SwingConstants.CENTER);

          diag.setBounds(30,180,80,40);

	  getContentPane().add(diag);
	  bed=new JLabel("BED CHARGES:");

	  bed.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  bed.setForeground(new Color(204,0,51));

	  bed.setHorizontalAlignment(SwingConstants.CENTER);

          bed.setBounds(580,180,130,40);

	  getContentPane().add(bed);

	  days=new JLabel("NO.OF DAYS:");

	  days.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  days.setForeground(new Color(204,0,51));

	  days.setHorizontalAlignment(SwingConstants.CENTER);

	  days.setBounds(580,220,130,40);

	  getContentPane().add(days);
	  amount=new JLabel("AMOUNT:");

	  amount.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  amount.setForeground(new Color(204,0,51));

	  amount.setHorizontalAlignment(SwingConstants.CENTER);

	  amount.setBounds(580,260,130,40);

	  getContentPane().add(amount);
	  
          drua=new JLabel("DRUGS ALLERGY:");  

	  drua.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  drua.setForeground(new Color(204,0,51));

	  drua.setHorizontalAlignment(SwingConstants.CENTER);

          drua.setBounds(10,260,140,20);

	  getContentPane().add(drua);

         
          preCom=new JLabel("PRESENT COMPLAINT:");

	  preCom.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  preCom.setForeground(new Color(204,0,51));

	  preCom.setHorizontalAlignment(SwingConstants.CENTER);

          preCom.setBounds(10,330,160,20);

	  getContentPane().add(preCom);


         
		
	  ph=new JLabel("PAST HISTORY:");                          

	  ph.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  ph.setForeground(new Color(204,0,51));

	  ph.setHorizontalAlignment(SwingConstants.CENTER);

          ph.setBounds(10,420,150,20);

	  getContentPane().add(ph);

         
          pe=new JLabel("PHYSICAL EXAMINATION:");

	  pe.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  pe.setForeground(new Color(204,0,51));

	  pe.setHorizontalAlignment(SwingConstants.CENTER);

          pe.setBounds(10,530,160,30);

	  getContentPane().add(pe);


          inve=new JLabel("INVESTIGATION:");

	  inve.setFont(new Font("Arial Narrow",Font.BOLD,14));

	  inve.setForeground(new Color(204,0,51));

	  inve.setHorizontalAlignment(SwingConstants.CENTER);

          inve.setBounds(10,630,110,20);

	  getContentPane().add(inve);

    
          tname=new JTextField(30);

	  tname.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tname.setBounds(90,100,140,20);

          getContentPane().add(tname);

          
	  tage=new JTextField(30);

	  tage.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tage.setBounds(290,100,110,20);

          getContentPane().add(tage);

          
         tsex=new JTextField(30);

	  tsex.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tsex.setBounds(460,100,140,20);

          getContentPane().add(tsex);
               

	  topno=new JTextField(30);

	  topno.setFont(new Font("Arial Narrow",Font.BOLD,12));

          topno.setBounds(90,140,140,20);

          getContentPane().add(topno);



	  tdesg=new JTextField(30);

	  tdesg.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdesg.setBounds(720,100,150,20);

          getContentPane().add(tdesg);


	
	  tdoa=new JTextField(30);

	  tdoa.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdoa.setBounds(400,140,150,20);

          getContentPane().add(tdoa);

          

	  tdod=new JTextField(30);

	  tdod.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdod.setBounds(720,140,150,20);

          getContentPane().add(tdod);

          tbed=new JTextField("1700");
  
    	  tbed.setFont(new Font("Arial Narrow",Font.BOLD,12));

              tbed.setBounds(720,190,150,20);

               getContentPane().add(tbed);
             
              tdays=new JTextField(30);
               tdays.setFont(new Font("Arial Narrow",Font.BOLD,12));

               tdays.setBounds(720,230,150,20);
               
               getContentPane().add(tdays);

               tamount=new JTextField(30);
               tamount.setFont(new Font("Arial Narrow",Font.BOLD,12));

               tamount.setBounds(720,270,150,20);
                getContentPane().add(tamount);
	  adia=new JTextArea(5,10);
	  adia.setFont(new Font("Arial Narrow",Font.BOLD,12));


	  adia.setBounds(190, 180, 330, 50);

	  getContentPane().add(adia);

	
	  ada=new JTextArea(5,10);

	  ada.setBounds(190, 250, 330, 50);
	  ada.setFont(new Font("Arial Narrow",Font.BOLD,12));


          getContentPane().add(ada);

                                        
           
          aprec=new JTextArea(5,10);
          aprec.setFont(new Font("Arial Narrow",Font.BOLD,12));


	  aprec.setBounds(190, 330, 330, 60);

	  getContentPane().add(aprec);


          aph=new JTextArea(5,10);
          aph.setFont(new Font("Arial Narrow",Font.BOLD,12));


	  aph.setBounds(190, 430, 330, 60);

          getContentPane().add(aph);
          

          ape=new JTextArea(5,10);

	  ape.setFont(new Font("Arial Narrow",Font.BOLD,12));

	  ape.setBounds(190, 540, 330, 60);

          getContentPane().add(ape);

    
           ai=new JTextArea(5,10);
           ai.setFont(new Font("Arial Narrow",Font.BOLD,12));


       	   ai.setBounds(190,650,330,60);

           getContentPane().add(ai);
         
           submit=new JButton("Submit");

          submit.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
          submit.setBounds(780,520,100,40);

	  submit.setForeground(new Color(51,153,255));

          submit.setMnemonic(KeyEvent.VK_S);
  
          submit.addActionListener(this);

          submit.setToolTipText("Press to submit the details");
   
          getContentPane().add(submit); 

                    
          Exit=new JButton("Exit");

          Exit.setFont(new Font("Arial Narrow",Font.BOLD,18));              // jLabel2.setForeground(new java.awt.Color(51, 51, 255));
 
          Exit.setBounds(780,580,100,40);

	  Exit.setForeground(new Color(51,153,255));

          Exit.setMnemonic(KeyEvent.VK_X);
  
          Exit.addActionListener(this);

          Exit.setToolTipText("Press to Register Student as the In-Paitent ");
   
          getContentPane().add(Exit); 
      
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

           if(ae.getActionCommand().equals("Submit"))
            {
        	   tbed.setText("1700");
               int t1=Integer.parseInt(tbed.getText());
                int t2=Integer.parseInt(tdays.getText());
                int t3=t1*t2;
                tamount.setText(String.valueOf(t3));
              

	      try
           
	       {
          
	    	  Class.forName("com.mysql.jdbc.Driver");

			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                                                         
                                                     

                pname=tname.getText();

		page=Integer.parseInt(tage.getText());

		psex=tsex.getText();

		poccu=tdesg.getText();

		popno=topno.getText();

		pdoa=tdoa.getText();

		pdod=tdod.getText();

		pdia=adia.getText();

		pda=ada.getText();

		ppc=aprec.getText();

		pph=aph.getText();

		ppe=ape.getText();

		pi=ai.getText();
		bedch=Integer.parseInt(tbed.getText());
		nod=Integer.parseInt(tdays.getText());
		am=Integer.parseInt(tamount.getText());

		PreparedStatement psms=ms.prepareStatement("insert into inpatientcase values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

		psms.setString(1,pname);

		psms.setInt(2,page);

		psms.setString(3,psex);

		psms.setString(4,poccu);

		psms.setString(5,popno);
 
		psms.setString(6,pdoa);

		psms.setString(7,pdod);

		psms.setString(8,pdia);

		psms.setString(9,pda);

		psms.setString(10,ppc);

		psms.setString(11,pph);

		psms.setString(12,ppe);

		psms.setString(13,pi);
		psms.setInt(14,bedch );
		psms.setInt(15,nod );

		psms.setInt(16, am);


                 psms.executeUpdate();
                 JOptionPane.showMessageDialog(null,"inpatient record added","success",JOptionPane.INFORMATION_MESSAGE);
             	

		psms.close();
		

	     }
              catch(Exception ex){ System.out.println(ex.getMessage());
              JOptionPane.showMessageDialog(null,"Incorrect Data","Wrong Password",JOptionPane.ERROR_MESSAGE);
          	
              }

            }
           else if(ae.getActionCommand().equals("Exit"))
               {
                 dispose();

               }
          
           
        }

 public static void main(String args[])

      {
  

           InpatientRec i=new InpatientRec();
  
     }  
}