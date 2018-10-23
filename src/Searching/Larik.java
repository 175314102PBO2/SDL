/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author basisc19
 */
public class Larik {
//  static int []nilai;
//
//    public static void setNilai(int[] n) {
//        Larik.nilai = n;
//    }
//
//    public int[] getNilai() {
//        return nilai;
//        }
//  public static void Cetak(){
//      for (int i = 0; i < nilai.length; i++) {
//       System.out.println(nilai[i]);   
//
//          
//      }
//          
//          
//      }

    static int[] nilai;

    public static void setNilai(int[] n) {
        Larik.nilai = n;
    }

    public int[] getNilai() {
        return nilai;
    }

    public static void Cetak() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }


    }

//    public static int sequentialsearch(int[] Larik, int Kunci) {
//        for (int counter = 0; counter <= Larik.length - 1; counter++) {
//            if (Kunci == Larik[counter]) {
//                return counter;
//            }
//
//        }
//
//        return -1;
//
//    }
    public static int BinarySearch(int[] Larik, int Kunci) {
//        //diatas adalah method binary search
//        int Awal = 0;
//        //berikut adalah penunjuk bahwa index awal adalah index ke 0
//        int Akhir = Larik.length-1;
//        //berikut adalah penunjuk bahwa index akhir adalah index ke sesuai panjang larik
//        //dikurangi 1
//        int i = 0;
//        //menunjukkan bahwa index dimulai dari 0
//        boolean ketemu = false;
//        //variabel bertipe boolean 
//
//        if (Awal <= Akhir && !ketemu) {
//            i = (Awal + Akhir) / 2;
//            if (Larik[i] == Kunci) {
//                ketemu = true;
//            } else if (Kunci < Larik[i]) {
//                Akhir = i - 1;
//            } else {
//                Awal = i + 1;
//            }
//        }
//        if (ketemu) {
//            return i;
//        } else {
//            return -1;
//        }

        int index_awal = 0;
        int index_akhir = Larik.length - 1;
        int index_tengah;

        while (index_awal <= index_akhir) {
            index_tengah = (index_akhir + index_awal) / 2;

            if (Kunci == Larik[index_tengah]) {
                return index_tengah;
            } else if (Larik[index_tengah] > Kunci) {
                index_akhir = index_tengah - 1;
            } else if (Larik[index_tengah] < Kunci) {
                index_awal = index_tengah + 1;
            }

        }
        return -1;
    }

    public static int Binarysearch(Object[] object, Object Kunci) {
        mahasiswa[] data = (mahasiswa[]) object;
        Arrays.sort(data);
        int index_awal = 0;
        int index_akhir = data.length - 1;
        int index_tengah;

        while (index_awal <= index_akhir) {
            index_tengah = (index_akhir + index_awal) / 2;

            if (((Comparable) data[index_tengah]).compareTo(Kunci) == 0) {
                return index_tengah;
            } else if (((Comparable) data[index_tengah]).compareTo(Kunci) == 1) {
                index_akhir = index_tengah - 1;
            } else if (((Comparable) data[index_tengah]).compareTo(Kunci) == -1) {
                index_awal = index_tengah + 1;
            }

        }
        return -1;


    }

    public static int sequentialsearch(Object[] object, Object Kunci) {
        mahasiswa[] data = (mahasiswa[]) object;       //pengcasetingan objek menjadi mahasiswa   
        for (int i = 0; i <= data.length - 1; i++) {
            // cara lama if (Data[i] == Kunci) {
            if (((Comparable) data[i]).compareTo(Kunci) == 0) {

                return i;
            }


        }

        return -1;

    }
}
