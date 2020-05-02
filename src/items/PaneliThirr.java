package items;

import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaneliThirr extends JPanel
{
	
	public PaneliThirr() 
	{
		setLayout(null);
		
		setLayout(new GridLayout(2,1));
        
        add(new JLabel("Calling... " + Dialer.getPhoneNumber()));

 
        Manager.play(Dialer.class.getResource("/items/ring.wav"));
       
	}
	
	


}
