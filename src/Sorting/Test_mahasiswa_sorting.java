/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;



/**
 *
 * @author basisc19
 */
public class Test_mahasiswa_sorting {

    public static void main(String[] args) {
        mahasiswa[] mhs = {new mahasiswa(" Cindy ", 105314002),
            new mahasiswa(" Sari ", 105314001),
            new mahasiswa(" Ralph ", 105314007),
            new mahasiswa(" Ronny ", 105314009),
            new mahasiswa(" Yessy ", 105314005),
            new mahasiswa(" Vina ", 105314012)};
//diatas adalah pembuatan objek, yang berasal dari kelas mahasiswa.

        System.out.println(" Data Sebelum Diurutkan ");
        //mencetak kata Data Sebelum Diurutkan
        for (int i = 0; i < mhs.length; i++) {
            //perulangan untuk mencetak data yang telah ada
            System.out.println(" " + mhs[i].getNama());
            //mencetak data sebanyak data yang di input
        }
        
        System.out.println(" ");
        //berfungsi sebagai enter
        System.out.println(" Data Setelah Diurutkan ");
        //mencetak kata Data Setelah Diurutkan
        mhs=Larik.InsertionObjDesc(mhs);
        //perintah untuk memanggil method Insertion Sort Descending
        for (int i = 0; i < mhs.length; i++) {
            //perulangan untuk memanggil objek mahasiswa
            System.out.print(" " + mhs[i].getNama());
            //perintah untuk mencetak nama mahasiswa sebanyak data yang telah dimasukkan
            System.out.println(" ");
            //berfungsi sebagai enter



        }
    }
}
