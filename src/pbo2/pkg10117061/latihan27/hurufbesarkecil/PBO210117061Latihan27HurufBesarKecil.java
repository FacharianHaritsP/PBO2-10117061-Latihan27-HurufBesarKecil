/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan huruf besar dan kecil
 */
public class PBO210117061Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String kata;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kata = scan.nextLine();

        //Mengubah ke Uppercase dan Lowercase
        System.out.println("");
        System.out.println("===Hasil Formatting===");
        System.out.println("Huruf Besar : " + kata.toUpperCase());
System.out.println("Huruf Kecil : " + kata.toLowerCase());
    
    }
    
}
