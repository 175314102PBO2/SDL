/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author basisc26
 */
public class ListNodeObject {

    private mahasiswa data;
    private ListNodeObject next, prev;

    public ListNodeObject() {
    }

    public ListNodeObject(mahasiswa data) {
        this.data = data;
    }

    public ListNodeObject(mahasiswa data, ListNodeObject next, ListNodeObject prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public mahasiswa getData() {
        return data;
    }

    public void setData(mahasiswa data) {
        this.data = data;
    }

    public ListNodeObject getNext() {
        return next;
    }

    public void setNext(ListNodeObject next) {
        this.next = next;
    }

    public ListNodeObject getPrev() {
        return prev;
    }

    public void setPrev(ListNodeObject prev) {
        this.prev = prev;
    }

}
