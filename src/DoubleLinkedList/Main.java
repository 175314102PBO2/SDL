/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        LinkedList daftar = new LinkedList();

        daftar.addFirst(123);
        daftar.addLast(111);
        daftar.addFirst(120);
        daftar.addLast(114);
        daftar.removeFirst();
        daftar.removeLast();
        System.out.println(daftar.toString());
        System.out.println(" Size : " + daftar.getSize());
        System.out.println("----------------------------------------------------");
        
        System.out.println(" Data yang dicari di index ke : "+daftar.Search(123));
        System.out.println("----------------------------------------------------");
        
        daftar.removeMid(123);
        System.out.println(daftar.toString());
        System.out.println("Size : "+daftar.getSize());
        System.out.println("----------------------------------------------------");
  

    }
}
