/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPK_Beasiswa;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IPKBeasiswa {
    public static void main(String[] args) {
        
        float total = 0, totalnilai = 0, ipk, jumlahnilai =0;
        char predikat;
        int jumlahsks = 0, po;
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan Nama Mahasiswa = ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jurusan = ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Semester = ");
        int semester = scanner.nextInt();
        System.out.println();
        
        Scanner input1 = new Scanner(System.in);
        int i = 1;
        int n, jum;
        System.out.print("Banyak Mata Kuliah yang Diambil :");
        n= input1.nextInt();
        
        while (i <= n) {
            
            System.out.println("");
            System.out.println("Mata Kuliah ke :" + i);
            Scanner input2 = new Scanner (System.in);
            System.out.print("Mata Kuliah :");
            String matkul = input2.nextLine();
            
            Scanner input3 = new Scanner (System.in);
            System.out.print("SKS :");
            int sks = input3.nextInt();
            
            Scanner input4 = new Scanner (System.in);
            System.out.print("Nilai :");
            float nilai = input3.nextFloat();
            
            if (nilai >=85) {
                predikat = 'A';
                po = 4;
            } else if (nilai >= 75) {
                predikat = 'B';
                po = 3;  
            } else if (nilai >= 65) {
                predikat = 'C';
                po = 2; 
                
            } else if (nilai >= 50) {
                predikat = 'D';
                po = 2;
            } else {
                predikat = 'E';
                po = 1;
            }
            
            System.out.println("Predikat :" +predikat);
            total = po * sks;
            System.out.println("Total Poin :" +total);
            totalnilai += total;
            jumlahsks += sks;
            jumlahnilai += nilai;
            i++;
        }
        
        System.out.println("==========================");
        System.out.println(""+nama);
        System.out.println(""+jurusan);
        System.out.println("Semester"+semester);
        System.out.println();
        System.out.println("Total Nilai :" +jumlahnilai);
        System.out.println("Total Poin :" + totalnilai);
        System.out.println("Total SKS :" +jumlahsks);
        ipk = totalnilai/jumlahsks;
        System.out.println("IPK :" +ipk);
        
          if (ipk >= 3.25) {
            System.out.println("Selamat Nilai Anda Memenuhi Persyaratan Beasiswa");
        } else {
             System.out.println("Maaf Nilai Anda Belum Memenuhi Persyaratan Beasiswa");
        }   
        
    }
}
        

