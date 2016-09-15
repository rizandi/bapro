/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author owner
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        BangunRuang bangunRuang = new BangunRuang();

        do{
            bangunRuang.menu();

            int pilih = scanner.nextInt();

            if (pilih == 1) {
                bangunRuang.hitungKubus();            
            }

            else if (pilih == 2) {
                bangunRuang.hitungBalok();
            }

            else if (pilih == 3) {
                bangunRuang.hitungTabung();
            }

            else if (pilih == 4) {
                System.exit(0);
            }

            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = null;
                try{
                    s = br.readLine();
                }catch (IOException e){
                }
                if (s.length() == 0){
                    break;
                }
            }
        }
        while (true);
    }
}
