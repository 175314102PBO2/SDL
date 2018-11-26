/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LAT;

import java.util.LinkedList;

/**
 *
 * @author basisc17
 */
public class Mahasiswa {

    private int NIM;
    private String nama;
    private LinkedList nilai;

    public Mahasiswa() {
    }

    public Mahasiswa(int NIM, String nama, LinkedList nilai) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilai = nilai;
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

    public LinkedList getNilai() {
        return nilai;
    }

    public void setNilai(LinkedList nilai) {
        this.nilai = nilai;
    }
}
