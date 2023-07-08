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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(String.format("%-10s", idPenjual)).append(" | ")
                .append(String.format("%-10s", namaPenjual)).append("   ");

        if (daftarProduk.isEmpty()) {
            sb.append("<Tidak ada produk>");
        } else {
            sb.append("|");
            for (Produk produk : daftarProduk) {
                sb.append(" ").append(produk.getNamaProduk()).append(" |");
            }
        }

        return sb.toString();
    }

}
