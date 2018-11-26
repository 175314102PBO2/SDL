/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package COLLECT;

import java.util.Enumeration;
import sun.misc.Queue;

/**
 *
 * @author basisc17
 */
public class ContohQueue {

    public static void main(String[] args) throws InterruptedException {
        Queue a = new Queue();
        a.enqueue(123);
        a.enqueue(345); // menambah data dari belakang 
        a.dequeue();    //menghapus paling depan, front nambah 1
        Enumeration name = a.elements();
        while (name.hasMoreElements()) {
            System.out.println(name.nextElement());
        }

    }
}
