/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SDL;

import java.util.Arrays;
import java.util.Scanner;
import SDL.Larik;

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
       int larik [] = {60,34,134,5,7};
       int kunci = 7;
       Arrays.sort(larik);
        for (int i = 0; i < larik.length; i++) {
            System.out.print(larik[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" DATA : "+Larik.BinarySearch(larik, kunci));
        
            
        }
        
    }


