/* Vanessa
 * class ini berfungsi untuk menyimpan identitas penjual
 */

public class Penjual {

    private String namaPenjual;
    private String DaftarProduk;
    private double ratingPenjual;

    public Penjual() {
    }

    public Penjual(String namaPenjual, String DaftarProduk, double ratingPenjual) {
        this.namaPenjual = namaPenjual;
        this.DaftarProduk = DaftarProduk;
        this.ratingPenjual = ratingPenjual;
    }

    public String getNamaPenjual() {
        return this.namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getDaftarProduk() {
        return this.DaftarProduk;
    }

    public void setDaftarProduk(String DaftarProduk) {
        this.DaftarProduk = DaftarProduk;
    }

    public double getRatingPenjual() {
        return this.ratingPenjual;
    }

    public void setRatingPenjual(double ratingPenjual) {
        this.ratingPenjual = ratingPenjual;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return String.format("| %-16s | %-16s | %-14f |", 
        namaPenjual, DaftarProduk, ratingPenjual);
    }
}
