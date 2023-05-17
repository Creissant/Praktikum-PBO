/**
 * File      : Segitiga.java		03/05/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}
