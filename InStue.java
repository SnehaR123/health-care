

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class InStue extends JFrame implements ActionListener

{    

    
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel head,shead,name,age,opno,date,sex,diag;

     JTextField tname,tage,tdate,topno;

     JButton but1,but2;
 
    

     JTextArea dtext;
 
     JScrollPane scrol;

    

     public InStue()
 
      {
 

          setLayout(null);

          setTitle("Student Registration");

    
             setBounds(0,0,1020,725);

	  head=new JLabel("HEALTH CARE CENTER COIMBATORE");

	  head.setFont(new Font("Arial Narrow",Font.BOLD,40));

	  head.setForeground(new Color(255,51,255));

	  head.setHorizontalAlignment(SwingConstants.CENTER);

                    head.setBounds(150,50,660,60);

	  getContentPane().add(head);

	  
	  shead=new JLabel("Out-Patient Registration");

	  shead.setFont(new Font("Arial Narrow",Font.BOLD,30));

	  shead.setForeground(new Color(51,51,255));


          shead.setBounds(280,120,330,50);

	  getContentPane().add(shead);

	
	  name=new JLabel("Name");

	  name.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  name.setForeground(new Color(204,0,51));


          name.setBounds(120,200,80,30);

	  getContentPane().add(name);



	  age=new JLabel("Age");

	  age.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  age.setForeground(new Color(204,0,51));



          age.setBounds(500,200,40,30);

	  getContentPane().add(age);
	
	  
	  opno=new JLabel("O.P.No");

	  opno.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  opno.setForeground(new Color(204,0,51));



          opno.setBounds(500,200,40,30);

	  getContentPane().add(opno);
  

	  date=new JLabel("Date");

	  date.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  date.setForeground(new Color(204,0,51));

          date.setBounds(530,250,40,30);

	  getContentPane().add(date);

		
	  sex=new JLabel("Sex");

	  sex.setFont(new Font("Arial Narrow",Font.BOLD,16));

	  sex.setForeground(new Color(204,0,51));



          sex.setBounds(120,310,60,30);

	  getContentPane().add(sex);

         
          diag=new JLabel("Diagnosis");

	  diag.setFont(new Font("Arial Narrow",Font.BOLD,16));


          diag.setBounds(124,374,120,30);

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

	
	  tdate=new JTextField(30);

	  tdate.setFont(new Font("Arial Narrow",Font.BOLD,12));

          tdate.setBounds(590,200,250,30);

          getContentPane().add(tdate);


          
          scrol.setViewportView(dtext);
        
          scrol.setBounds(210, 380, 580, 300);

          getContentPane().add(scrol);
           

          
          but1=new JButton("Submit");

          but1.setFont(new Font("Arial Narrow",Font.BOLD,18));
 
          but1.setBounds(100,160,260,40);


          but1.setMnemonic(KeyEvent.VK_S);
  
          but1.addActionListener(this);

          but1.setToolTipText("Press to submit the detials");
   
         getContentPane().add(but1); 

                    
          but2=new JButton("Exit");

          but2.setFont(new Font("Arial Narrow",Font.BOLD,18));             
          but2.setBounds(100,160,260,40);


          but2.setMnemonic(KeyEvent.VK_S);
  
          but2.addActionListener(this);

          but2.setToolTipText("Press to Register Student as the In-Paitent ");
   
          getContentPane().add(but2); 
               
               

	
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
   
           if(ae.getActionCommand().equals("Exit"))

              {
                     
                       dispose();

              }

               else if(ae.getActionCommand().equals("Submit"))

                 {
                      
                       
       }
}

  
  public static void main(String args[])
  
      {
 
          InStue i=new InStue();

       }
}                     
                        