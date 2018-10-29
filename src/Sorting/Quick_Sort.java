/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author basisc19ma
 */
public class Quick_Sort {

    public static int[] Quick_Sort(int[] x, int awal, int akhir) {

        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;

            while (i <= akhir && x[i] >= x[awal]) {
                i++;
            }
            while (j > awal && x[j] < x[awal]) {
                j--;
            }
            while (i < j) {
                int tampung = x[i];
                x[i] = x[j];
                x[j] = tampung;
                while (i <= akhir && x[i] >= x[awal]) {
                    i++;
                }
                while (j > awal && x[j] > x[awal]) {
                    j--;
                }
            }

            int tampung = x[awal];
            x[awal] = x[j];
            x[j] = tampung;

            Quick_Sort(x, awal, j - 1);
            Quick_Sort(x, j + 1, akhir);

        }
        return x;
    }
    public static mahasiswa[] Quick_Sort(Object[] data, int awal, int akhir) {
        mahasiswa[] mhs = (mahasiswa[]) data;
        if (awal < akhir) {
            int i = awal + 1;
            int j = akhir;

            if (i <= j && ((Comparable) data[i]).compareTo(data[awal]) == 0) {
                i++;
            }
            if (j > awal && ((Comparable) data[j]).compareTo(data[awal]) == 0) {
                j--;
            }
            while (i < j) {
                Object tampung = data[i];
                data[i] = data[j];
                data[j] = tampung;
                if (i <= j && ((Comparable) data[i]).compareTo(data[awal]) == 0) {
                    i++;
                }
                if (i > j && ((Comparable) data[i]).compareTo(data[awal]) == 0) {
                    j--;
                }
            }
            Object tampung = data[awal];
            data[awal] = data[j];
            data[j] = tampung;

            Quick_Sort(data, awal, j - 1);
            Quick_Sort(data, j + 1, akhir);
        }
        return mhs;
    }

}
