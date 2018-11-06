/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author basisc15la
 */
public class main {

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
        daftar.AddFirst(78);
        daftar.AddFirst(33);
        daftar.AddFirst(12);
        daftar.AddLast(344);
        daftar.AddLast(123);
        daftar.RemoveLast();
        System.out.println(daftar.toString());
        System.out.println(" Size : " + daftar.getSize());
    }
}
