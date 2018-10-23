/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

public class mahasiswa implements Comparable {  //untuk membandingkan sebuah tipe data object

    private String nama;
    //variabel nama, bertipe string bersifat private
    private int NIM;
    //variabel NIM bertipe int, bersifat private

    public mahasiswa(String nama, int NIM) {
        //konstruktor, dengan parameter bertipe String,int
        this.nama = nama;
        //nama adalah nama
        this.NIM = NIM;
        //nim adalah nim
    }

    public int getNIM() {
        //mendapakatkan nilai nim
        return NIM;
        //pengembalian nilai nim
    }

    public void setNIM(int NIM) {
        //penyetingan nilai nim, dengan parameter int NIM
        this.NIM = NIM;
        //nim adalah nim
    }

    public String getNama() {
        //mendapatkan nilai nama
        return nama;
        //pengembalian nilai nama
    }

    public void setNama(String nama) {
        //penyetingan nama, dengan parameter String nama
        this.nama = nama;
        //nama adalah nama
    }

    @Override
    public int compareTo(Object o) {
        //method untuk mengubah data menjadi objek mahasiswa
        mahasiswa key = (mahasiswa) o;

//        if (this.nama.compareTo(key.getNama()) == 0) {
//            return 0;
//        } else if (this.nama.compareTo(key.getNama()) > 0) {
//            return 1;
//        } else {
//            return -1;
//        }
        
        
                //proses dibawah ini digunakan untuk membadingkan NIM 
        if (this.NIM == key.getNIM()) {
            return 0;       //karena sama dengan shg return 0
        } else if (this.NIM > key.getNIM()) {
            return 1;       //karena lebih besar jadi return 1
        } else {
            return -1;      //karena kurang dari jadi return -1
        }
    }
    }

