/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Main_QuickSort {

    public static void main(String[] args) {

        mahasiswa[] mhs = {new mahasiswa(" Cindy ", 105314002),
            new mahasiswa(" Sari ", 105314001),
            new mahasiswa(" Ralph ", 105314007)};

        System.out.print(" Data Sebelum Diurutkan : ");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println(" " + mhs[i].getNIM());
        }
        Arrays.sort(mhs);
        System.out.println("");
        System.out.print(" Data Setelah Diurutkan : ");

        for (int i = 0; i < mhs.length; i++) {
            System.out.println(" " + mhs[i].getNIM());
        }
        System.out.println(" ");
    }
}
