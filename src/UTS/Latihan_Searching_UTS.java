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
public class Latihan_Searching_UTS {

    public static int Squential(int[] index, int key) {
        for (int counter = 0; counter <= index.length - 1; counter++) {
            if (key == index[counter]) {
                return counter;
            }

        }
        return -1;
    }

    public static int Binary(int[] index, int key) {
        int index_awal = 0;
        int index_akhir = index.length - 1;
        int index_tengah;

        if (index_awal <= key) {
            index_tengah = (index_awal + index_akhir) / 2;
            if (index[index_tengah] == key) {
                return index_tengah;
            } else if (index[index_tengah] > key) {
                index_akhir = index_tengah - 1;
            } else {
                index_awal = index_tengah + 1;
            }
        }
        return -1;
    }
}
