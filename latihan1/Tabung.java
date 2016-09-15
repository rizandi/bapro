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
public class Tabung extends BangunRuang{
    protected double pi;
    private int jariJari;
    private int tinggi;

    public Tabung(double pi, int jariJari, int tinggi, int panjang1, int panjang2, int panjang3) {
        super(panjang1, panjang2, panjang3);
        this.pi = 3.14;
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getJariJari() {
        return jariJari;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    double luasPermukaan(){
        return (2 * pi * jariJari * tinggi) + (2 * pi * jariJari * jariJari);
    }
    
    double volume(){
        return pi * jariJari * jariJari * tinggi;
    }
    
    
}
