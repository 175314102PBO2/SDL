/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LAT;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author basisc17
 */
public class main {

    public static void main(String[] args) {
        LinkedList daftarMahasiswa = new LinkedList();
        //linked list itu dinamis, jd jika data kosong tidak menambah memori.
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNIM( 175314099);
        mhs1.setNama(" Rosa ");
        LinkedList nilaimhs1 = new LinkedList();
        nilaimhs1.addLast(90);
        nilaimhs1.addLast(70);
        nilaimhs1.addLast(100);
        mhs1.setNilai(nilaimhs1);
        daftarMahasiswa.addLast(mhs1);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNIM( 175314033);
        mhs2.setNama(" Damai ");
        LinkedList nilaimhs2 = new LinkedList();
        nilaimhs2.addLast(60);
        nilaimhs2.addLast(50);
        mhs2.setNilai(nilaimhs2);
        daftarMahasiswa.addLast(mhs2);


        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNIM( 175314111);
        mhs3.setNama(" Gagas ");
        LinkedList nilaimhs3 = new LinkedList();
        nilaimhs3.addLast(80);
        nilaimhs3.addLast(30);
        nilaimhs3.addLast(100);
        mhs3.setNilai(nilaimhs3);
        daftarMahasiswa.addLast(mhs3);
        
        Iterator data = daftarMahasiswa.iterator();
        while(data.hasNext()){
            Mahasiswa print = (Mahasiswa) data.next();
            System.out.println(print.getNIM());
            System.out.println(print.getNama());
            System.out.println(print.getNilai().toString());
        }
    }
}
