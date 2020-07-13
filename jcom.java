import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class jcom extends JFrame implements ItemListener,ActionListener
{
        JComboBox jcb;
        JTextField t1;
        JButton b1;
        Container cp;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        jcom(String s)
        {
            super(s);
            cp=getContentPane();
            jcb=new JComboBox();
           b1=new JButton("Add me");
           t1=new JTextField(20);
           cp.setLayout(null);
           jcb.setBounds(40,40,100,30);
           t1.setBounds(40,80,100,30);
           b1.setBounds(40,120,100,30);
           cp.add(jcb);
           cp.add(b1);
           cp.add(t1);
            b1.addActionListener(this);
            jcb.addItemListener(this);
            setSize(getToolkit().getScreenSize());
            setVisible(true);
        }
       public void actionPerformed(ActionEvent ae)
      {
       try
      {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
             con=DriverManager.getConnection("jdbc:odbc:kart","sa","madurai");
             ps=con.prepareStatement("select * from sample");
             rs=ps.executeQuery();
            while(rs.next())
           {
                 jcb.addItem(rs.getString(1));
          }
     }
      catch(Exception ex)
{
    System.out.println(ex);
}
      }
      public void itemStateChanged(ItemEvent ie)
     {
            t1.setText((String)jcb.getSelectedItem());
     }
      public static void main(String args[])
     {
             new jcom("Combobox");
      }
}