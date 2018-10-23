/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class TESTER_SEARCHING {

    public static void main(String[] args) {
        int[] index = {1, 3, 4, 5, 67, 8, 0};
        
        int key = 11;

        System.out.print(" Data yang ada : ");
        for (int i = 0; i < index.length; i++) {
            System.out.print(" " + index[i]);

        }
        System.out.println(" ");
        System.out.print(" Data Setelah Diurutkan Untuk Binary : ");
        for (int i = 0; i < index.length; i++) {
            Arrays.sort(index);
            System.out.print(" "+index[i]);
            
        }
        System.out.println("");
        System.out.println(" Data yang Dicari : " + key);
       // System.out.println(" Data berada pada index ke : " + Latihan_UTS.Squential(index, key));
        System.out.println(" Data berada pada index ke : "+Latihan_Searching_UTS.Binary(index, key));
        

    }

}
