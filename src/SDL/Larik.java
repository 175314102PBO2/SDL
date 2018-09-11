/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SDL;

/**
 *
 * @author basisc19
 */
public class Larik {
//  static int []nilai;
//
//    public static void setNilai(int[] n) {
//        Larik.nilai = n;
//    }
//
//    public int[] getNilai() {
//        return nilai;
//        }
//  public static void Cetak(){
//      for (int i = 0; i < nilai.length; i++) {
//       System.out.println(nilai[i]);   
//
//          
//      }
//          
//          
//      }
    

    static int[] nilai;

    public static void setNilai(int[] n) {
        Larik.nilai = n;
    }

    public int[] getNilai() {
        return nilai;
    }

    public static void Cetak() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }


    }

    public static int sequentialsearch(int[] Larik, int Kunci) {
        for (int counter = 0; counter <= Larik.length - 1; counter++) {
            if (Kunci == Larik[counter]) {
                return counter;
            }

        }

        return -1;

    }

    public static int BinarySearch(int[] Larik, int Kunci) {
        int Awal = 0;
        int Akhir = Larik.length - 1;
        int i = 0;
        boolean ketemu = false;

        if (Awal <= Akhir && !ketemu) {
            i = (Awal + Akhir) / 2;
            if (Larik[i] == Kunci) {
                ketemu = true;
            } else if (Kunci < Larik[i]) {
                Akhir = i - 1;
            } else {
                Awal = i + 1;
            }
        }
        if (ketemu) {
            return i;
        } else {
            return -1;
        }
    }
    //dibawah ini digunakan untuk membandingkan compare

    public static int sequentialsearch(Object[] object, Object Kunci) {
        mahasiswa[] data = (mahasiswa[]) object;       //pengcasetingan objek menjadi mahasiswa
        
        for (int i = 0; i <= data.length - 1; i++) {
            // cara lama if (Data[i] == Kunci) {
            if((Comparable) data[i].compareTo(Kunci)==0){     
                
                return i;
            }

        }

        return -1;

    }
}
