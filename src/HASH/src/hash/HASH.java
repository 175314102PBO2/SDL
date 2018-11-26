/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Hashtable;

/**
 *
 * @author basisc17
 */
public class HASH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable nilai = new Hashtable();
        nilai.put(1854621, " Struktur Data Linier ");
        nilai.put(1854688, " Algoritma dan Pemrograman ");
        System.out.println(nilai.get(1854621));
        System.out.println(nilai.get(1854688));
    }
}
