/*
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String kategoriProduk;
    private String namaProduk;
    private String namaPenjual;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String namaProduk, String namaPenjual) {
        this.kategoriProduk = kategoriProduk;
        this.namaProduk = namaProduk;
        this.namaPenjual = namaPenjual;
    }

    public String getKategoriProduk() {
        return this.kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    @Override
    public String toString() {
        return String.format("Kategori produk\t: %s \nNama produk\t: %s \nNama Penjual\t: %s", 
        kategoriProduk, namaProduk, namaPenjual);
    }
}