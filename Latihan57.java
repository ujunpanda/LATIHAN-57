/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan57;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Latihan57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pemanggilan class dari masing2 dan isian
        Bicycle bc = new Bicycle();
        bc.setBrand("Ally skate");
        bc.setModel("Rocket");
        bc.setGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : "+bc.getBrand());
        System.out.println("Model : "+bc.getModel());
        System.out.println("Panjangnya Board : "+bc.getGearCount());
        System.out.println("--------------------------------------------------------");
        
        Skateboard sk = new Skateboard();
        sk.setBrand("Trek Bike");
        sk.setModel("7.4 FX");
        sk.setBoardLength(54.5);
        //printout
        System.out.println("Skateboard");
        System.out.println("Brand : "+sk.getBrand());
        System.out.println("Model : "+sk.getModel());
        System.out.println("Panjangnya Board : "+sk.getBoardLength());
    }
    
}
