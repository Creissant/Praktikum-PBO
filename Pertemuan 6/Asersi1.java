/**
 * File      : Asersi1.java		29/03/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : program untuk menunjukkan asersi
 *
 */

public class Asersi1 {
    public static void main(String[] args){
        int x = 0; //inisialisai nilai x
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x < 0) : "ada kesalahan kode"; //mengeluarkan output jika tidak memenuhi if
            System.out.println("x bilangan negatif");
        }
    }
}