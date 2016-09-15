/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author owner
 */
public class Kubus extends BangunRuang{
    private double sisi;
    
    public Kubus(double sisi, int panjang1, int panjang2, int panjang3) {
        super(panjang1, panjang2, panjang3);
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    
    double luasPermukaan(){       
        return 6 * sisi * sisi;
    }
    
    double volume(){
        
        return Math.pow(this.sisi, 3.0);
    }
}
