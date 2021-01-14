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
public class Lingkaran extends Luas_Keliling{
    
    
    //Penjelasan
    //Khusus untuk Lingkaran saya menggunakan tipe data FLOAT, 
    //karena ada bilangan koma di bagian rumusnya yaitu Phi nya = 3.14
    
    
    // jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
    
}
