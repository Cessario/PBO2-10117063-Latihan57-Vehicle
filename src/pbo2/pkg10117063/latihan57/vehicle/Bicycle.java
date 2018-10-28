/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan57.vehicle;

/**
 *
 * @author Deadpool
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle(int myGearCount, String myBrand, String mymodel) {
        super(myBrand, mymodel);
        this.myGearCount = myGearCount;
        
        System.out.println("Bicycle");
        System.out.println("Brand : "+myBrand);
        System.out.println("Model : "+mymodel);
        System.out.println("Jumlah Gear : "+myGearCount);
        System.out.println("");
    }

    

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
