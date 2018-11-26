/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

import java.util.ArrayList;

/**
 *
 * @author basisc17ma
 */
public class SAObjek {

    private ArrayList<Object> Stack = new ArrayList<Object>();
    private int front = -1;

    public void push(Object object) {
        Stack.add(object);
        front++;
    }

    public Object pop() {
        Object object = Stack.remove(front);
        front--;
        return object;
    }

    public int count() {
        return Stack.size();
    }

    public Object peek() {
        return Stack.get(front);
    }

    public void clear() {
        Stack.clear();
        front = -1;
    }
}
