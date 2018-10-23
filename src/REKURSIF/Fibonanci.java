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
public class Fibonanci {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibo(i));
            System.out.println("");
        }
    }

    public static int fibo(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }
}
