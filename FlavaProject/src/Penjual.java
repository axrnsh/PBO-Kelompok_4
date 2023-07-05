/* Vanessa
 * class ini berfungsi untuk menyimpan identitas penjual
 */

import java.util.ArrayList;

public class Penjual {

    private String idPenjual;
    private String namaPenjual;
    private ArrayList<Produk> daftarProduk;

    public Penjual(String idPenjual, String namaPenjual, ArrayList<Produk> daftarProduk) {
        this.idPenjual = idPenjual;
        this.namaPenjual = namaPenjual;
        this.daftarProduk = daftarProduk;
    }

    public String getIdPenjual() {
        return this.idPenjual;
    }

    public void setIdPenjual(String idPenjual) {
        this.idPenjual = idPenjual;
    }

    public String getNamaPenjual() {
        return this.namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public ArrayList<Produk> getDaftarProduk() {
        return this.daftarProduk;
    }

    public void setDaftarProduk(ArrayList<Produk> daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    public Penjual() {
        daftarProduk = new ArrayList<>();
    }

    // Override metode toString()
    @Override
    public String toString() {
        return String.format("| %-16s | %-16s | %-14f |",
                idPenjual, namaPenjual, daftarProduk);
    }
}