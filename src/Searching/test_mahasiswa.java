/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author basisc23lb
 */
public class test_mahasiswa {
    
    public static void main(String[] args) {
//        mahasiswa[] data = {new mahasiswa(" Budi ", 175314089),
//            new mahasiswa(" Redy ", 175314118),
//            new mahasiswa(" Frida ", 175314058),
//            new mahasiswa(" Aldy ", 175314044)};
//
//        System.out.println(" Algoritma Sequential Search ");
//        System.out.println(" Algoritma Binary Search ");
//        mahasiswa key = new mahasiswa(" Aldy ", 175314044); //berdasarkan NIM
////         mahasiswa key = new mahasiswa(" Aldy ", 0);    //berdasarkan NAMA
//
////        int result = Larik.sequentialsearch(data, key);
//        int result = Larik.Binarysearch(data, key);
//
//        if (result >= 0) {
//            System.out.println(" Data Ketemu di Index ke : " + result);
//        } else {
//            System.out.println(" Data Tidak Ditemukan ");
//        }
        mahasiswa[] mhs = {new mahasiswa(" Cindy ", 105314002),
            new mahasiswa(" Sari ", 105314001),
            new mahasiswa(" Ralph ", 105314007),
            new mahasiswa(" Ronny ", 105314009),
            new mahasiswa(" Yessy ", 105314005),
            new mahasiswa(" Vina ", 105314012)};
//           mahasiswa key = new mahasiswa(" Yessy ", 0);
            mahasiswa key = new mahasiswa(" ", 105314007);
//        int result = Larik.sequentialsearch(data, key);
        int result = Larik.Binarysearch(mhs, key);
        
        if (result>= 0) {
            System.out.println(" Data Ketemu di Index ke : " + result);
        } else {
            System.out.println(" Data Tidak Ditemukan ");
            
        }
    }
}
