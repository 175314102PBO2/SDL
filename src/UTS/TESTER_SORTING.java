/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ACER
 */
public class TESTER_SORTING {

    public static void main(String[] args) {
        int[] data = {2, 5, 1, 2, 22, 12, 12, 12, 15, 12, 10};

        System.out.print(" Datanya adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);

        }

        System.out.println(" ");
//        int Data[] = Latihan_Sorting_UTS.Bubble(data);
//        int Data[] =Latihan_Sorting_UTS.Insertion(data);
        int Data[] = Latihan_Sorting_UTS.Selection(data);
        System.out.print(" Data Setelah Diurutkan adalah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + Data[i]);

        }
        System.out.println(" ");

    }
}
