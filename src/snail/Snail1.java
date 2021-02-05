
package snail;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DanielMac
 */
public class Snail1 extends Thread {
    static ArrayList<String> rl1  = new ArrayList();
    ArrayList<String> rezultatuList; 
    public String vardas;
    public final int finish = 100;
    public int nueitasKelias;
    
    public Snail1(String vardas, ArrayList<String> rezultatuList){
        this.vardas = vardas;
        this.rezultatuList = rezultatuList;
    }

    
    public void run() {
        do {
        int step = new Random().nextInt(5)+1; // nuo 0 iki 4 + 1 -> tai random iki 5
           nueitasKelias += step; 
        if (this.nueitasKelias < finish) {
            System.out.println(vardas + " " + nueitasKelias);
            
        } else  
        synchronized(rl1) {
            
        rl1.add(this.vardas);
        System.out.println(this.vardas + " " + "reached " + finish);
        }
        
        
            try {
                Thread.sleep((new Random().nextInt(5)+1)*5);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Snail1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
        
        } while (nueitasKelias < finish);
            
        
        
//        Random r = new Random();
//        r.nextInt(5);


    }
 }
