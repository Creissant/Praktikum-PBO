/**
 * File      : Segitiga.java		08/03/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
 */
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = tinggi;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return (alas * tinggi) * 1/2;
	}
	
	public void printInfo(){
		System.out.println("Bangun segitiga bersisi "+this.getJumlahSisi());
	}
}
