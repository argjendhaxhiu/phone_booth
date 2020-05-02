package items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.text.DecimalFormat;
import java.util.TimerTask;

import javax.swing.Timer;




public class Matesi {
    Timer timer;
    static double tarifa=.5;
    static String pergjigje; 
    public static final int TENTH_SEC = 100;
    private int clockTick;  	//number of clock ticks; tick can be 1.0 s or 0.1 s
	private double clockTime;  	//time in seconds
	private String clockTimeString;
    
    private static double kohezgjatja=Dialer.moneyDouble/tarifa;
    

    public Matesi(final double kohezgjatja) {
        timer = new Timer(TENTH_SEC, new ActionListener() {
    		public void actionPerformed(ActionEvent evt) {
    			DecimalFormat formater = new DecimalFormat("0.0");
    			clockTick++;
    			clockTime = ((double)clockTick)/10.0;
    			clockTimeString = new Double(clockTime).toString();
    			
    			HangUp.labela.setText("Ju mund te flisni " + formater.format(((long)kohezgjatja-clockTime)) + " sekonda");
    			if((long)clockTime == (long) (kohezgjatja))
    			{	timer.stop();
    			
    			Dialer.EndenPanel();  	 
                
//                try {
//    				Thread.sleep(7000);
//    			} catch (InterruptedException e) {
//    				// TODO Auto-generated catch block
//    				e.printStackTrace();
//    			}
    			}//System.out.println(clockTime);
    		    }
    		});

//    			clockTick++;
//    			clockTime = ((double)clockTick)/10.0;
//    			clockTimeString = new Double(clockTime).toString();
//    			System.out.println(clockTimeString);
//    			//System.out.println(clockTime);
    

        timer.start();
//        schedule(new DetyraEMatesit(), (long) (kohezgjatja*1000));
	}

//    class DetyraEMatesit extends TimerTask {
//    	
//    	
//        public void run() {
//            System.out.format("U krye");
//           
//            timer.stop(); //Terminate the timer thread
//            Dialer.EndenPanel();  	 
//            
//            try {
//				Thread.sleep(7000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//           // System.exit(0);
//        }
//    }

    public static void llogKohezgjatjen() {

        Matesi m = new Matesi(kohezgjatja);
        System.out.format("Filloi \n");
        pergjigje = "Ju mund te flisni " +kohezgjatja+ " sekonda";
        System.out.println( pergjigje);
       
        
    }
    
    public static void setKohezgjatja(double kohezgjatja) {
		Matesi.kohezgjatja = kohezgjatja;
	}
    
    public static double getKohezgjatja() {
		return kohezgjatja;
	}
    
   
 
    
}
