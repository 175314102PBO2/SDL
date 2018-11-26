/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package COLLECT;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author basisc17
 */

public class ContohLinkedList {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addFirst("111");
        a.addLast("234");

        System.out.println(a.toString());
        Iterator data = a.iterator();
        while (data.hasNext()) {
            System.out.println(data.next());
        }
    }
}
