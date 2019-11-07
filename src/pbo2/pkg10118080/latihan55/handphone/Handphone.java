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
public class Handphone {
    protected String manufacture,opratingSystem,model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.opratingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct(){
        System.out.println("Manufaktur : "+this.manufacture);
        System.out.println("OS : "+this.opratingSystem);
        System.out.println("Model : "+this.model);
        System.out.println("Harga : "+this.harga);
    }
    
    
}
