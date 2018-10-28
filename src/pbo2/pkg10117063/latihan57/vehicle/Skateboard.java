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
public class Skateboard extends Vehicle {
    private double myBoardlength;

    public Skateboard(double myBoardlength, String myBrand, String mymodel) {
        super(myBrand, mymodel);
        this.myBoardlength = myBoardlength;
        
        System.out.println("Skateboard");
        System.out.println("Brand : "+myBrand);
        System.out.println("Model : "+mymodel);
        System.out.println("Panjangnya Board : "+myBoardlength);
    }

    

    public double getMyBoardlength() {
        return myBoardlength;
    }

    public void setMyBoardlength(double myBoardlength) {
        this.myBoardlength = myBoardlength;
    }
    
    
}
