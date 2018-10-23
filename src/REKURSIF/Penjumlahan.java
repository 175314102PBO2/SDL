/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REKURSIF;

/**
 *
 * @author ACER
 */
public class Penjumlahan {

    public static void main(String[] args) {

        System.out.println(penjumlahan(5));
    }

    public static int penjumlahan(int bilangan) {
        if (bilangan > 1) {
            bilangan = bilangan + penjumlahan(bilangan - 1);

        }
        return bilangan;
    }
}
