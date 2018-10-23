/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
import java.util.Scanner;
import Searching.Larik;

/**
 *
 * @author basisc19
 */
public class Larik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x, byk, nilai[];
//        System.out.println(" masukan banyak nilai : ");
//        byk = sc.nextInt();
//        nilai = new int[byk];
//        for (x = 0; x < nilai.length; x++) {
//            System.out.print(" nilai ke " + x + " : ");
//            nilai[x] = sc.nextInt();
//            //Arrays.sort(larik);  untuk mengurutkan data yang belum terurut
//            //arrays.sort digunakan untuk algoritma binary, karena perlu pengurutan 
//        }
//        int key;
//        System.out.println(" Masukan Nilai yang Dicari : ");
//        key = sc.nextInt();
//       // System.out.println("DATA DITEMUKAN PADA INDEX : "+Larik.sequentialsearch(nilai, key));
//        System.out.println("Index ke : "+Larik.BinarySearch(nilai, key));
//        
//       int larik [] = {60,34,134,5,7};
//       
//       Arrays.sort(larik);
//       int Kunci = 60;
//        for (int i = 0; i <= larik.length-1; i++) {
//            System.out.print(larik[i] + " ");
//        }
//        System.out.println(" ");
//        System.out.println(" DATA BINARY        : "+Larik.BinarySearch(larik, Kunci));
//        System.out.println(" DATA SEQUENTIAL    :"+Larik.sequentialsearch(larik, kunci));
        int []larik = {3,4,5,6,7,8,9,10};

//        Arrays.sort(larik);
        int Kunci = 3;
        for (int i = 0; i <= larik.length - 1; i++) {
            System.out.print(larik[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" DATA DITEMUKAN PADA INDEX KE     : " + Larik.BinarySearch(larik, Kunci));
    }

}
