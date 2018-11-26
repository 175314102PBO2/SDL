/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author basisc26
 */
public class LinkedListObject {

    private ListNodeObject head;
    private int size;

    public LinkedListObject() {
        head = new ListNodeObject();
        head.setNext(head);
        head.setPrev(head);
    }

    public ListNodeObject getHead() {
        return head;
    }

    public void setHead(ListNodeObject head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if ((head.getNext() != null && head.getPrev() != null)) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(mahasiswa first) {
        addBefore(first, head.getNext());
    }

    public void addLast(mahasiswa Last) {
        addBefore(Last, head);
    }

    public ListNodeObject addBefore(mahasiswa elemen, ListNodeObject bantu) {
        ListNodeObject baru = new ListNodeObject(elemen);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size++;
        return baru;

    }

    public ListNodeObject remove(ListNodeObject item) {
        ListNodeObject point = item;
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        size--;
        return point;
    }

    public int Search(Object cari) {
        ListNodeObject pointer = head.getNext();
        int index = 0;
        while (pointer != head) {
            if (cari == pointer.getData()) {
                return index;
            } else {
                pointer = pointer.getNext();
                index++;
            }
        }
        return index++;
    }

    public ListNodeObject removeFirst() {
        return remove(head.getNext());
    }

    public ListNodeObject removeLast() {
        return remove(head.getPrev());
    }

    public ListNodeObject removeMID() {
        int Mid = size / 2;
        ListNodeObject pointer = head.getNext();
        for (int i = 0; i < Mid; i++) {
            pointer = pointer.getNext();
        }
        return remove(pointer.getNext());
    }

    @Override
    public String toString() {// cetak elemen yang ada di list
        String isi = "";
        ListNodeObject pointer = head.getNext();
        while (pointer != head) {
            isi += pointer.getData().getNama() + " " + pointer.getData().getNIM() + " \n";
            pointer = pointer.getNext();
        }
        return isi;
    }

}
