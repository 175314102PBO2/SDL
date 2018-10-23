/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author melio
 */
public class Larik {

    public static int[] BubbleSort(int[] data) { //data disni belum terurut
        for (int i = 1; i <= data.length - 1; i++) {
            for (int elemen = 0; elemen <= data.length - 1 - i; elemen++) {
                if (data[elemen] > data[elemen + 1]) {
                    int tampung = data[elemen]; //buat simpan data yang akan digeser biar nggak hilang
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = tampung;
                }
            }

        }
        return data;


    }

    public static mahasiswa[] BubbleSortObjASC(Object[] data) { //data disni belum terurut
        mahasiswa[] mhs = (mahasiswa[]) data;
        //disini merupakan pembuatan objek bahwa, data yang akan disimpan lalu
        //ditampilkan adalah berasal dari kelas mahasiswa 
        //karena data yang disimpan lebih dari 1, makan menggunakan mahasiswa
        //dengan array
        for (int i = 1; i <= mhs.length - 1; i++) {
            //perulangan selama i adalah mulai dari 1, dan i adalah kurang dari sama dengan
            //banyaknya mahasiswa dikurangi 1.
            
            for (int elemen = 0; elemen <= mhs.length - 1 - i; elemen++) {
                //perulangan selama elemen mulai dari o,
                //dan hingga elemen kurang dari sama dengan
                //banyaknya mahasiswa, dikurangi 1 lalu dikurangi lagi dengan i
                if (((Comparable) mhs[elemen]).compareTo(mhs[elemen + 1]) == 1) {
                    //pernyataan bahwa mahasiswa dengan elemen array,
                    //di compare ke mahasiswa dengan elemen array+1, 
                    //dan mengasilkan sama dengan 1
                    mahasiswa tampung = (mahasiswa) data[elemen]; //buat simpan data yang akan digeser biar nggak hilang
                    data[elemen] = data[elemen + 1];//pernyataan bahwa data elemen, sama dengan data elemen+1
                    data[elemen + 1] = tampung;
                    //pernyataan bahwa tampung adalah data elemen+1
                }
            }

        }
        return mhs;
        //pengembalian nilai mhs yang sudah di simpan dalam method di atas.


    }

    public static int[] BubbleSortDesc(int[] data) {
        for (int i = 1; i <= data.length - 1; i++) {
            for (int elemen = 0; elemen <= data.length - 1 - i; elemen++) {
                if (data[elemen] < data[elemen + 1]) {
                    int tampung = data[elemen]; //buat simpan data yang akan digeser biar nggak hilang
                    data[elemen] = data[elemen + 1];
                    data[elemen + 1] = tampung;
                }

            }

        }
        return data;
    }

    public static int[] Selection(int[] data) {
        for (int j = 0; j <= data.length - 2; j++) {
            int minIdx = j;
            for (int elemen = j + 1; elemen <= data.length - 1; elemen++) {
                if (data[elemen] < data[minIdx]) {
                    minIdx = elemen;

                }

            }
            int tampung = data[j];
            data[j] = data[minIdx]; // penukaran larik iterasi dengan larik minIdx
            data[minIdx] = tampung;

        }
        return data;
    }

    public static mahasiswa[] SelectionObj(Object[] data) {
        mahasiswa[] mhs = (mahasiswa[]) data;
         //disini merupakan pembuatan objek bahwa, data yang akan disimpan lalu
        //ditampilkan adalah berasal dari kelas mahasiswa 
        //karena data yang disimpan lebih dari 1, makan menggunakan mahasiswa
        //dengan array
        for (int j = 0; j <= data.length - 2; j++) {
            //perulangan jika j = 0 dan j akan berakhir jiika J kurang dari sama dengan
            //panjang data - 2
            int minIdx = j;
            //variabel minIdx, bertipe integer, dan bernilai sama dengan J
            for (int elemen = j + 1; elemen <= data.length - 1; elemen++) {
                //perulangan jika nilai elemen = j+1
                //dan akan berakhir saat nilai elemen kurang dari sama dengan
                //panjang data -1
                if (((Comparable) mhs[elemen]).compareTo(mhs[minIdx]) == -1) {
                    //pengcompare, array mhs elemen ke mhs array minIdx
                    //dan bernilai -1;
                    minIdx = elemen;
                    //maka nilai minIdx sama dengan elemen
                }

            }
            mahasiswa tampung = (mahasiswa) data[j];
            //objek tampung bertipe mahasiswa, sepanjang data array j
            data[j] = data[minIdx]; // penukaran larik iterasi dengan larik minIdx
            data[minIdx] = tampung;
            //nilai objek tampung sama dengan data array minIdx

        }
        return mhs;
        //pengembalian nilai mahasiswa 
    }

    public static int[] SelectionDesc(int[] data) {
        for (int j = 0; j <= data.length - 2; j++) {
            int minIdx = j;
            for (int elemen = j + 1; elemen <= data.length - 1; elemen++) {
                if (data[elemen] > data[minIdx]) {
                    minIdx = elemen;

                }

            }
            int tampung = data[j];
            data[j] = data[minIdx]; // penukaran larik iterasi dengan larik minIdx
            data[minIdx] = tampung;

        }
        return data;
    }

    public static int[] Insertion(int[] data) {

        for (int i = 1; i < data.length; i++) {
            for (int elemen = i; elemen < data.length; elemen++) {
                if (data[elemen] < data[elemen - 1]) {
                    int tampung = data[elemen];
                    data[elemen] = data[elemen - 1];
                    data[elemen - 1] = tampung;
                }

              
            }
        }  return data;
    }

    public static mahasiswa[] InsertionObjDesc(Object[] data) {
        mahasiswa[] mhs = (mahasiswa[]) data;
        //pengcastingan data, menjadi data mahasiswa
        for (int i = 1; i < mhs.length; i++) {
            //perulangan dimana iterasi dimulai dari 1, dan berakhir pada N-1
            for (int j = i; j >= 1; j--) {
                //perulangan dimana j sama dengan i, dan berakhir pada j = 1
                if (((Comparable) mhs[j]).compareTo(mhs[j - 1]) == 1) {
                    //pengcompare bahwa nilai mahasiswa[j] dan mahasiswa[j-1] adalah 1
                    mahasiswa tampung = (mahasiswa) mhs[j];
                    //penampungan untuk pertukaran posisi urutan
                    mhs[j] = mhs[j - 1];
                    //penampungan untuk pertukaran posisi urutan
                    mhs[j - 1] = tampung;
                    //penampungan untuk pertukaran posisi urutan
                }

            }

        }
        return mhs;
        //pengembalian nilai mhs

    }
}
