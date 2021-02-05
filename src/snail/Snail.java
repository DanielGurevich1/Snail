
package snail;

import java.util.ArrayList;

public class Snail {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String>  rezultatuList = new ArrayList(); //listas saugojimui
        Snail1 s1 = new Snail1("Tio", rezultatuList);
        Snail1 s2 = new Snail1("Rio", rezultatuList);
        Snail1 s3 = new Snail1("Mio", rezultatuList);
        Snail1 s4 = new Snail1("Gio", rezultatuList);
        Snail1 s5 = new Snail1("Lio", rezultatuList);
        Snail1 s6 = new Snail1("Nio", rezultatuList);
        Snail1 s7 = new Snail1("Sio", rezultatuList);
        Snail1 s8 = new Snail1("Wio", rezultatuList);
        s1.start(); // pats surands run metoda
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start(); 
        
         s1.join(); // pats surands run metoda
        s2.join();
        s3.join();
        s4.join();
        s5.join();
        s6.join();
        s7.join();
        s8.join(); 
        
        System.out.println("---Rezultatai---");
//        for (String i:rezultatuList){
//            System.out.println(i);
            for (int i = 0; i < Snail1.rl1.size(); i++) {
                System.out.println("position: " + (i+1) + " " + Snail1.rl1.get(i));
        }
    }

    
    
}
