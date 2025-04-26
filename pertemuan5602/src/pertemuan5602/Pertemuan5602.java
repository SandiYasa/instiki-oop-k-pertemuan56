/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Sandi
 * TGL: 4/26/2025
 */
public class Pertemuan5602 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        // Membuat objek LuasSegiTiga
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();

        // Meminta input dari pengguna untuk alas dan tinggi
        System.out.print("Masukkan alas segitiga: ");
        SegiTiga01.alas = scanner.nextInt();  // Membaca input untuk alas

        System.out.print("Masukkan tinggi segitiga: ");
        SegiTiga01.tinggi = scanner.nextInt();  // Membaca input untuk tinggi

        // Menghitung dan menampilkan hasil luas segitiga
        System.out.println("Luas Segitiga: " + SegiTiga01.HitungLuas());
        
        // Menutup scanner setelah selesai digunakan
        scanner.close();
                
    }
    
}
