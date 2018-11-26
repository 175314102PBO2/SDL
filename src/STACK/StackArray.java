/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

/**
 *
 * @author basisc17ma
 */
public class StackArray {

    private int front;
    private int size;
    private int[] data;

    public StackArray(int JumlahData) {
        this.data = new int[JumlahData];        //banyaknya data menyesuaikan panjangnya jumlah data
        this.size = 0;
        this.front = -1;       //frontnya kosong
    }

    public int getSize() {
        return size;
    }

    public boolean push(int input) {
        if (data.length != size) {
            front++;
            size++;
            this.data[front] = input;
        }

        return true;
    }

    public void pop() {
        if (isEmpty() == false) {
            front--;
            size--;
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == data.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String isi = " ";
        for (int i = front; i >= 0; i--) {
            isi += data[i] + " ";

        }
        return isi;
    }
}
