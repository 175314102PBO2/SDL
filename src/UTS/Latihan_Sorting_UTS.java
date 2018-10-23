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
public class Latihan_Sorting_UTS {

    public static int[] Bubble(int[] index) {
        for (int iterasi = 1; iterasi <= index.length - 1; iterasi++) {
            for (int elemen = 0; elemen <= index.length - 1 - iterasi; elemen++) {
                if (index[elemen] > index[elemen + 1]) {
                    int tampung = index[elemen];
                    index[elemen] = index[elemen + 1];
                    index[elemen + 1] = tampung;
                }

            }

        }
        return index;
    }


    public static int[] Selection(int[] index) {
        for (int iterasi = 0; iterasi <= index.length - 2; iterasi++) {
            int index_minimal = iterasi;
            for (int elemen = iterasi + 1; elemen < index.length - 1; elemen++) {
                if (index[elemen] < index[index_minimal]) {
                    index_minimal=elemen;
                    int tampung = index[iterasi];
                    index[iterasi] = index[index_minimal];
                    index[index_minimal] = tampung;
                }

            }

         }
        return index;
    }

    public static int[] Insertion(int[] index) {
        for (int iterasi = 0; iterasi < index.length; iterasi++) {
            for (int elemen = iterasi; elemen >=1; elemen--) {
                if (index[elemen]< index[elemen - 1]) {
                    int tampung = index[elemen];
                    index[elemen] = index[elemen - 1];
                    index[elemen - 1] = tampung;
                }

            }

        }
        return index;
    }

}
