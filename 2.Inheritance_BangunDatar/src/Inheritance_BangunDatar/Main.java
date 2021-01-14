/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_BangunDatar;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        
        //NIM 201969040002 (dua digit NIM belakang = 02)
        
        Luas_Keliling bangunDatar = new Luas_Keliling();
        
        //Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 02;
        
        // Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 02;
        segitiga.tinggi = 02;
        segitiga.sisi = 02;
        
        // Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 02;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        segitiga.luas();
        segitiga.keliling();
    }
}
