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
class Persegi extends Luas_Keliling {
    
    //Penjelasan
    //Saya menggunakan tipe data INT di bagian Persegi karena saya sudah mengetahui nilai dari-
    //sisi yaitu karena NIM saya 2 (bukan bilangan koma)
    //(Agar hasi RUN tidak terdapat koma)
    int sisi;

    @Override
    float luas(){
        int luaspersegi = sisi * sisi;
        System.out.println("Luas Persegi: " + luaspersegi);
        return luaspersegi;
    }

    @Override
    float keliling(){
        int kelilingpersegi = 4 * sisi;
        System.out.println("Keliling Persegi: " + kelilingpersegi);
        return kelilingpersegi;
    }
}
