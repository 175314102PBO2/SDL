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
public class Faktorial {

    public static void main(String[] args) {
        System.out.println(faktorial(5));
    }

    public static int faktorial(int index) {
        if (index > 1) {
            index = index * faktorial(index - 1);

        }
        return index;
    }
}
