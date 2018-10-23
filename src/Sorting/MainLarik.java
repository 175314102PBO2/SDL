/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author basisc19la
 */
public class MainLarik {

    public static void main(String[] args) {
        Quick_Sort x = new Quick_Sort();
        int data[] = {10, 100, 5, 4};

        System.out.print(" Data Sebelum Diurutkan : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        
        System.out.println("");
         System.out.print(" Data Setelah Diurutkan : ");
         Quick_Sort.Quick_Sort(data, 0, data.length-1);
 //int Data[] = Larik.BubbleSort(data);
//         int Data[] = Larik.Selection(data);
         //int Data[] = Larik.BubbleSortDesc(data);
////         int Data[] = Larik.BubbleSort(data);
//         int Data[] = Larik.BubbleSortObj(data);
         //int Data[] = Larik.Insertion(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(" "+data[i]);
        }
        System.out.println(" ");
       
    }
}
