/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String kategoriProduk;
    private String daftarProduk;
    private String namaPenjual;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String daftarProduk, String namaPenjual) {
        this.kategoriProduk = kategoriProduk;
        this.daftarProduk = daftarProduk;
        this.namaPenjual = namaPenjual;
    }

    public String getKategoriProduk() {
        return this.kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public String getDaftarProduk() {
        return this.daftarProduk;
    }

    public void setDaftarProduk(String daftarProduk) {
        this.daftarProduk = daftarProduk;
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
        kategoriProduk, daftarProduk, namaPenjual);
    }
}