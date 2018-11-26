/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

import Searching.*;
import java.util.Arrays;

/**
 *
 * @author basisc23lb
 */
public class test_mahasiswa {

    public static void main(String[] args) {
        LinkedListObject mhs = new LinkedListObject();
        
        mhs.addFirst(new mahasiswa(" Tamelio ", 175314102));
        mhs.addFirst(new mahasiswa(" Tamel ", 175314104));
        mhs.addLast(new mahasiswa(" Amelio ", 175314106));
        mhs.addFirst(new mahasiswa(" Melio ", 175314108));
        mhs.addLast(new mahasiswa(" Amelia ", 175314110));
        mhs.addLast(new mahasiswa(" Gwen ", 175314112));

        System.out.println(" List Daftar Mahasiswa adalah :  ");
        System.out.println(" " + mhs.toString() + " ");
        System.out.println("  size " + mhs.getSize());
        System.out.println();

        System.out.println(" Data Pertama Dihapus : ");
        mhs.removeFirst();
        System.out.println(mhs.toString());
        System.out.println("");

        mahasiswa key = new mahasiswa("  ", 175314112);
        System.out.println(" Mahasiswa Dicari            : " + key.getNIM());

        System.out.println(" Data Terdapat pada index ke : "+mhs.Search(key));

    }
}
