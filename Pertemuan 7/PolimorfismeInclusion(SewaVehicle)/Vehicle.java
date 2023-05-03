/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Varrel / 24060121130062
 * Deskripsi : Vehicle.java adalah adalah kelas yang berisi rumus untuk menghitung harga sewa kendaraan.
 *
 */

package PolimorfismeInclusion;

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}
