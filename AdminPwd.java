


	import java.awt.*;

	import java.awt.event.*;

	import javax.swing.*;

	import java.sql.*;

	public class AdminPwd extends JDialog implements ActionListener,KeyListener

	 {


	  
		private static final long serialVersionUID = 1L;

	JTextField username;
JPasswordField password;
	   JLabel l,l1;

	   JButton ok,cancel;

	   JPanel p;

	   String pass=null;

	   int i=0;

	   public AdminPwd(JFrame f)

	    {

	      super(f,"Administrative Password",true);

	      setLayout(null);
	      l1=new JLabel("USERNAME:");

	      l1.setForeground(Color.red);

	      l1.setFont(new Font("arial",Font.BOLD,20));

	      l1.setBounds(50,40,200,30);

	      add(l1);
	  

	      l=new JLabel("PASSWORD:");

	      l.setForeground(Color.red);

	      l.setFont(new Font("arial",Font.BOLD,20));

	      l.setBounds(50,80,200,30);

	      add(l);
	      username=new JTextField(20);

	     // pwd1.setEchoChar('*');

	      username.setFont(new Font("arial",Font.BOLD,20));

	      username.setBounds(180,40,200,30);

	      add(username);
	      password=new JPasswordField(20);

	      password.setEchoChar('*');

	      password.setFont(new Font("arial",Font.BOLD,20));

	      password.setBounds(180,80,200,30);

	      add(password);

	      addWindowListener(new WindowAdapter()

	       {

	          public void windowClosing(WindowEvent we)

	           {

	             dispose();

	           }

	       });

	      ok=new JButton("OK");

	      cancel =new JButton("CANCEL");

	     // ok.setDisplayedMnemonicIndex(0);

	      ok.addActionListener(this);

	      ok.addKeyListener(this);

	      ok.setToolTipText("Press it after entering Password to Validate Your Password and Enter into Administrator Module if valid");

	     // cancel.setDisplayedMnemonicIndex(0);

	      cancel.addActionListener(this);

	      cancel.setToolTipText("Press it to exit");

	      cancel.addKeyListener(this);

	      p=new JPanel();

	      p.setLayout(new GridLayout(1,2));

	      p.setBounds(90,150,200,30);

	      p.add(ok);

	      p.add(cancel);

	      getContentPane().add(p);

	      setBounds(320,350,400,220);

	      setVisible(true);

	    }

	   public void actionPerformed(ActionEvent ae)

	    {

	      if(ae.getActionCommand().equals("OK"))

	       {

	          passwordCheck();

	       }

	      else if(ae.getActionCommand().equals("CANCEL"))

	       {
	         dispose();

	       }

	    }

	   public void keyPressed(KeyEvent ke)

	    {

	      int key=ke.getKeyCode();

	     if(((JButton)ke.getSource())==ok)

	      {

	      if(key==KeyEvent.VK_O||key==KeyEvent.VK_ENTER)

	       {

	          passwordCheck();

	       }

	      }

	      else if(key==KeyEvent.VK_C||key==KeyEvent.VK_ENTER)

	       {
	            dispose();

	       }

	    }

	   public void passwordCheck()

	    {

	      pass=password.getText();

	      String pwd1=pass;

	      try

	       {

	    	  Class.forName("com.mysql.jdbc.Driver");

			     Connection ms=DriverManager.getConnection("jdbc:mysql://localhost:3306/sneha","root","root");
                                                         
                                                     

	         Statement st=ms.createStatement();

	         ResultSet rs=st.executeQuery("select * from login");

	         while(rs.next())

	          pwd1=rs.getString(1);

	       }

	      catch(Exception ex){}

	         if(pass.equals(pwd1))

	          {
	        	  JOptionPane.showMessageDialog(null,"Login successful","login",JOptionPane.NO_OPTION);
	            dispose();

	            HcHome a=new HcHome();
	           
	            i=0;

	          }

	         else

	          {

	            JOptionPane.showMessageDialog(null,"Incorrect Password","login",JOptionPane.ERROR_MESSAGE);

	             password.setText("");

	             i++;

	             if(i>=3)

	              System.exit(0);

	          }

	     }


	   public void keyTyped(KeyEvent ke){}

	   public void keyReleased(KeyEvent ke){}
	      
	  

public static void main(String[]args)
{
	AdminPwd ad= new  AdminPwd(null);
}
	 }



