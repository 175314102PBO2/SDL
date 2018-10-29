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
        List daftar = new List();
        
        daftar.AddFirst(23);
        daftar.AddFirst(67);
        daftar.AddFirst(78);
        
        daftar.AddLast(700);
        daftar.AddLast(22);
        
        daftar.RemoveFirst();
        daftar.RemoveLast();
        
        System.out.println(daftar.toString());
        System.out.println(" Size : "+daftar.getSize());
    }
}
