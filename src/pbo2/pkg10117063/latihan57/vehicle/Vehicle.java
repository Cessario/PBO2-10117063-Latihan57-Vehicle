/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan57.vehicle;

/*
Nama : Cessario Sheva L.P.A
Kelas: IF-2
Nim  : 10117063
Deskripsi Program : Menampilkan kendaraan
 */
public class Vehicle {
    private String myBrand;
    private String mymodel;

    public Vehicle(String myBrand, String mymodel) {
        this.myBrand = myBrand;
        this.mymodel = mymodel;
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMymodel() {
        return mymodel;
    }

    public void setMymodel(String mymodel) {
        this.mymodel = mymodel;
    }
    
    
    
}
