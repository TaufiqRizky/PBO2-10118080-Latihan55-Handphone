/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan55.handphone;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        a.setKeyStore("234ibfd3840fo");
        a.displayProduct();
        System.out.println("");
        
        b.setPinBB("BHS249");
        b.displayProduct();
        System.out.println("");
        
        w.setWpKeyStore("UUUQIJWOEJ");
        w.displayProduct();
    }
    
}
