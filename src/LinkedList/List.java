/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author basisc15la
 */
public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    private int size;

    public List() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public void AddFirst(int first) {//nambah di awal
        ListNode baru = new ListNode(first);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;
        } else {
            baru.setNext(firstNode);
            firstNode = baru;
        }
        size++;
    }

    public void AddLast(int last) {     //nambah di akhir
        ListNode baru = new ListNode(last);
        if (isEmpty() == true) {
            firstNode = baru;
            lastNode = baru;
        } else {
            lastNode.setNext(baru);
            lastNode = baru;
        }
        size++;
    }

    public ListNode RemoveFirst() {    //hapus di awal
        ListNode bantu = new ListNode();

        if (isEmpty() == false) {
            bantu = firstNode;
            firstNode = firstNode.getNext();
        }
        size--;
        return bantu;

    }

    public ListNode RemoveLast() {      //hapus di akhir
        ListNode bantuan = new ListNode();
        if (isEmpty() == false) {
            bantuan = firstNode;
            while (bantuan.getNext() != lastNode) {
                bantuan = bantuan.getNext();
            }
            lastNode = bantuan;
            bantuan = bantuan.getNext();
            lastNode.setNext(null);
            size--;
            return bantuan;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (firstNode != null && lastNode != null) {
            //buat nge cek, kosong apa tidak
            return false;
        }
        return true;
    }

    @Override
    public String toString() {     //buat cetak yang ada dlm list{
        String isi = "";
        ListNode pointer = firstNode;
        while (pointer != null) {
            isi += pointer.getData() + " ";
            pointer = pointer.getNext();
        }
        return isi;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
