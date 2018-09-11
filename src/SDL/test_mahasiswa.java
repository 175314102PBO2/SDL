/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SDL;

/**
 *
 * @author basisc23lb
 */
public class test_mahasiswa {

    public static void main(String[] args) {
        mahasiswa[] data = {new mahasiswa(" Budi ", 175314089),
            new mahasiswa(" Redy ", 175314118),
            new mahasiswa(" Frida ", 175314058),
            new mahasiswa(" Aldy ", 175314044)};

        System.out.println(" Algoritma Sequential Search ");

        mahasiswa key = new mahasiswa(" Aldy ", 175314044); //berdasarkan NIM
//         mahasiswa key = new mahasiswa(" Aldy ", 0);    //berdasarkan NAMA

        int result = Larik.sequentialsearch(data, key);

        if (result >= 0) {
            System.out.println(" Data Ketemu di Index ke : " + result);
        } else {
            System.out.println(" Data Tidak Ditemukan ");
        }
    }
}
