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
public class Segitiga extends Luas_Keliling {
    //Penjelasan
    //Saya menggunakan tipe data INT di bagian Segitiga karena saya sudah mengetahui nilai dari-
    //alas, tinggi, dan sisi yaitu karena NIM saya 2 (bukan bilangan koma)
    //(Agar hasi RUN tidak terdapat koma)
    int alas;
    int tinggi;
    int sisi;

    @Override
    float luas() {
        int luas = alas * tinggi/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   
     @Override
    float keliling(){
        int keliling = 3 * sisi; //Rumus juga bisa menggunakan a+b+c atau sisi+sisi+sisi
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
}
}
