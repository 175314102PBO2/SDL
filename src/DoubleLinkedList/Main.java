/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        //        List daftar = new List();
//        daftar.RemoveLast();
//        System.out.println(daftar.toString());
//        System.out.println(" Size : "+daftar.getSize());
//
//        List daftar = new List();
//        daftar.AddFirst(78);
//        daftar.RemoveLast();
//        System.out.println(daftar.toString());
//        System.out.println(" Size : " + daftar.getSize());
//
        LinkedList daftar = new LinkedList();
        daftar.addFirst(123);
        daftar.addLast(111);
        daftar.addFirst(120);
        daftar.removeFirst();

        System.out.println(daftar.toString());
        System.out.println(" Size : " + daftar.getSize());

    }
}
