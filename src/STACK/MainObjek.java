/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STACK;

/**
 *
 * @author ACER
 */
public class MainObjek {

    public static void main(String[] args) {
        SAObjek stack = new SAObjek();
        stack.push(" Amelia ");
        stack.push(" Paramita ");
        stack.push(" Indah ");
        stack.push(" Pakarti ");
        stack.push(" Melio ");
        stack.push(" Tamelio ");

        int count = stack.count();
        Object object = stack.peek();
        System.out.println(" Banyak Daftar Nama   : " + count);
        System.out.println(" Data Teratas         : " + object);
        System.out.println(" -----------------------------------");

        object = stack.pop();
        System.out.println("Data yang dihapus : " + object);
        count = stack.count();
        System.out.println("Jumlah Data setelah ada yang dihiapus : " + count);
        object = stack.peek();
        System.out.println("Data Teratas setelah dihapus : " + object);
       
    }
}
