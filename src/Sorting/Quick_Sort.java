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

            while (i <= akhir && x[i] <= x[awal]) {
                i++;
            }
            while (j > awal && x[j] > x[awal]) {
                j--;
            }
            while (i < j) {
                int tampung = x[i];
                x[i] = x[j];
                x[j] = tampung;
                while (i <= akhir && x[i] <= x[awal]) {
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
        int i = awal;
        int j = akhir;

        if (awal < akhir) {

            while (((Comparable) mhs[i]).compareTo(mhs[awal]) == 1) {
                i++;
            }
            while (((Comparable) mhs[i]).compareTo(mhs[awal]) == -1) {
                j--;
            }
            while (i <= j) {
                mahasiswa tampung = mhs[i];
                mhs[i] = mhs[j];
                mhs[j] = tampung;
                i++;
                j--;
            }
        }
        while (i < j);
        mahasiswa tampung = mhs[awal];
        mhs[awal] = mhs[j];
        mhs[j] = tampung;
        if (awal < j) {
            Quick_Sort(mhs, awal, j-1);
        }
        if (i < akhir) {
            Quick_Sort(mhs, i+1, akhir);

        }
        return mhs;

    }
}
