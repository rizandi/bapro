/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.util.Scanner;

/**
 *
 * @author owner
 */
public class BangunRuang {
    private int panjang1;
    private int panjang2;
    private int panjang3;

    public BangunRuang() {
    }

    public BangunRuang(int panjang1, int panjang2, int panjang3) {
        this.panjang1 = panjang1;
        this.panjang2 = panjang2;
        this.panjang3 = panjang3;
    }
    
    void menu(){
        System.out.printf("======================\n"
                + "Perhitungan Bangun Ruang\n"
                + "======================\n"
                + "Menu:\n"
                + "1. Kubus\n"
                + "2. Balok\n"
                + "3. Tabung\n"
                + "4. Exit\n"
                + "Masukkan pilihan anda : ");
    }
    
    void hitungKubus(){
        Scanner scanner = new Scanner(System.in);
        int sisi;
        System.out.printf("Masukkan panjang sisi (cm) : ");
        sisi = scanner.nextInt();
        Kubus kubus = new Kubus(sisi, 0, 0, 0);
        System.out.println("Luas Permukaan       (cm2) : " + kubus.luasPermukaan());        
        System.out.println("Volume               (cm3) : " + kubus.volume());
    }   

    void hitungBalok() {
        Scanner scanner = new Scanner(System.in);
        int panjang, lebar, tinggi;
        System.out.printf("Masukkan panjang      (cm) : ");
        panjang = scanner.nextInt();
        System.out.printf("Masukkan lebar        (cm) : ");
        lebar = scanner.nextInt();
        System.out.printf("Masukkan tinggi       (cm) : ");
        tinggi = scanner.nextInt();
        Balok balok = new Balok(panjang, lebar, tinggi, 0, 0, 0);
        System.out.println("Luas Permukaan       (cm2) : " + balok.luasPermukaan());        
        System.out.println("Volume               (cm3) : " + balok.volume());
    }

    void hitungTabung() {
        Scanner scanner = new Scanner(System.in);
        int jariJari, tinggi;
        System.out.printf("Masukkan jari-jari    (cm) : ");
        jariJari = scanner.nextInt();
        System.out.printf("Masukkan tinggi       (cm) : ");
        tinggi = scanner.nextInt();
        Tabung tb = new Tabung(0, jariJari, tinggi, 0, 0, 0);
        System.out.println("Luas Permukaan       (cm2) : " + tb.luasPermukaan());        
        System.out.println("Volume               (cm3) : " + tb.volume());
    }
    
    
}
