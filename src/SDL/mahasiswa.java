/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SDL;

/**
 *
 * @author basisc23lb
 */
public class mahasiswa implements Comparable {  //untuk membandingkan sebuah tipe data object

    private String nama;
    private int NIM;

    public mahasiswa(String nama, int NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
        mahasiswa key = (mahasiswa) o;
//        //proses dibawah ini digunakan untuk membadingkan NIM 
//        if (this.NIM == key.getNIM()) {
//            return 0;       //karena sama dengan shg return 0
//        } else if (this.NIM > key.getNIM()) {
//            return 1;       //karena lebih besar jadi return 1
//        } else {
//            return -1;      //karena kurang dari jadi return -1
//        }
//    }
        if (this.nama.compareTo(key.getNama()) == 0) {
            return 0;
        } else if (this.nama.compareTo(key.getNama()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
