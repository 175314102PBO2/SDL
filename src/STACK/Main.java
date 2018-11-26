/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

/**
 *
 * @author basisc17ma
 */
public class Main {

    public static void main(String[] args) {
        StackArray c = new StackArray(5);

        c.push(3);
        c.push(2);
        c.push(1);
        c.pop();
        c.pop();
        c.pop();
        c.push(123);
        c.push(111);

        System.out.println(" Data :" + c.toString());
        System.out.println(" Size : " + c.getSize());
    }
}
