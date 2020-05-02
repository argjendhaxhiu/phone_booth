package items;

import java.awt.*;


import javax.swing.*;





import java.awt.event.*;


public class Dialer extends JFrame {


static double moneyDouble=0;	
private static String PhoneNumber = "";
static JLabel Result;
static JLabel Credits;
private static JPanel upper;
static JPanel upperParent;


public static void main (String [] args) {
        new Dialer().setVisible(true);
        }

public Dialer () {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3,1));

// Upper panel - responses

        upperParent = new JPanel();
        
        setUpper(new JPanel());
        upperParent.add(getUpper());
        getUpper().setLayout(new GridLayout(2,1));
        
        JPanel upper1=new JPanel();
        upper1.setLayout(new GridLayout(1,3));
        
        getUpper().add(new JLabel("Numri: "));
        getUpper().add(Result = new JLabel(""));
        getUpper().add(new JLabel("Kredita: "));
        getUpper().add(Credits = new JLabel(""));
        
        JButton OK;
        JButton OK1;
        JButton OK2;
       
  
        upper1.add(OK = new JButton());
        upper1.add(OK1 = new JButton());
        upper1.add(OK2 = new JButton());
     
//      
        
        

//        
        OK.setIcon(new ImageIcon(Dialer.class.getResource("/items/Phone-icon.png")));
        OK1.setIcon(new ImageIcon(Dialer.class.getResource("/items/end-call.png")));
        OK2.setIcon(new ImageIcon(Dialer.class.getResource("/items/1euro.png")));
       
        
        
        /// THIIIIIIIRRR
        
        
                OK.addActionListener(
                        new ActionListener()
// Definition through an inner class ============
        {
        public void actionPerformed(ActionEvent e) {
        if(moneyDouble == 0)
        {
        	JOptionPane.showMessageDialog(null,"Nuk keni impulsa");
        		
        }
        else if(getPhoneNumber()=="")
        {
        	JOptionPane.showMessageDialog(null,"shkruje numrin e telefonit !!!");
        }	
         
        else 
        {
        	final PaneliThirr panel2 = new PaneliThirr();
  
        	        	upperParent.remove(getUpper());
        	        	upperParent.add(panel2);
        	        	upperParent.validate();
        	        	upperParent.repaint();


        	
        	System.out.println("Called "+getPhoneNumber());
    		System.out.println("Dialling Completed");
    		System.out.println("kredita gjithsejt " + moneyDouble);
  		
    		
    		
    		final HangUp panel3 = new HangUp(Matesi.getKohezgjatja());
    		
    		
    		SwingUtilities.invokeLater(new Runnable() {
      		  public void run() {
      			try{Thread.sleep(12000);}
        		catch(Exception e2){}
      		
      			
      			Manager.playOneShot(Dialer.class.getResource("/items/phone-receiver-button-1.wav"));
      			
      			Matesi.llogKohezgjatjen(); // LLOGARIT TAAARIFEN
      	        upperParent.remove(panel2);
      	        upperParent.add(panel3);
      	        upperParent.validate();
      	        upperParent.repaint();
      		  }
      		});
    		
    			
        }
       }
      }
// End of inner class definition ================
        );
                
                
                // NDERPREJJJEEE
                
                OK1.addActionListener(
                        new ActionListener()
// Definition through an inner class ============
        {
        public void actionPerformed(ActionEvent e) {
        	
        	
        		EndenPanel();

                }
        }
// End of inner class definition ================
        );
                
                
               
                
                
                
                
                
                /// JEP PARE
                
                OK2.addActionListener(
                        new ActionListener()
// Definition through an inner class ============
        {
        public void actionPerformed(ActionEvent e) {
         System.out.println("Paret");
         String paret = JOptionPane.showInputDialog("Cakto vleren e parave(kreditave): ");
         if(Manager.checkIsNumber(paret))
         {
         moneyDouble = Double.parseDouble(paret);
         System.out.println("Jane shtuar qikaq pare: " + paret);
         Credits.setText(moneyDouble + " €");
         }
         else
         {
        	 JOptionPane.showMessageDialog(null, "Nuk eshte validuar shifra, sistemi pranon veq numra");
         }
                }
        }
// End of inner class definition ================
        );
       

// Lower panel - keypad

        JPanel lower = new JPanel();
        lower.setLayout(new GridLayout(4,3));

        String [] Phone = {"7","8","9","4","5","6",
                        "1","2","3","*","0","#"};

        for (int i=0;i<Phone.length;i++) {
                JButton current;
                lower.add(current = new JButton(Phone[i]));
                current.addActionListener(
                        new ActionListener()
                        
        //METODA
                        

// Definition through an inner class =============================
        {
        public void actionPerformed(ActionEvent e) {
                setPhoneNumber(getPhoneNumber() + e.getActionCommand());
                Result.setText(getPhoneNumber());
                }
        }
// End of inner class definition =================================
        );
        }
        cp.add(upperParent);
        
        cp.add(upper1);
        cp.add(lower);
        this.pack();

        }

public static String getPhoneNumber() {
	return PhoneNumber;
}

public static void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}

public static double getmoneyDouble() {
	return moneyDouble;
}

public static void setMoneyDouble(double moneyDouble) {
	Dialer.moneyDouble = moneyDouble;
}

public static JPanel getUpper() {
	return upper;
}

public void setUpper(JPanel upper) {
	this.upper = upper;
}

public static void EndenPanel()
{ 	final CallEnded panel4 = new CallEnded();
	Manager.playOneShot(Dialer.class.getResource("/items/phone-busy-1.wav"));
	upperParent.removeAll();//t(Dialer.getUpper());
	upperParent.add(panel4);
	upperParent.validate();
	upperParent.repaint();
	
	
	SwingUtilities.invokeLater(new Runnable() {
		  public void run() {
			try{Thread.sleep(7000);}
  		catch(Exception e2){}
	
			Result.setText("");
			Credits.setText("0");
	        upperParent.removeAll();
	        upperParent.add(upper);
	        upperParent.validate();
	        upperParent.repaint();
		  }
		});

	}

}