/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String kategoriProduk;
    private String daftarProduk;
    private String namaPenjualProduk;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String daftarProduk, String namaPenjualProduk) {
        this.kategoriProduk = kategoriProduk;
        this.daftarProduk = daftarProduk;
        this.namaPenjualProduk = namaPenjualProduk;
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

    public String getNamaPenjualProduk() {
        return namaPenjualProduk;
    }

    public void setNamaPenjualProduk(String namaPenjualProduk) {
        this.namaPenjualProduk = namaPenjualProduk;
    }

    @Override
    public String toString() {
        return String.format("Kategori produk\t: %s \nNama produk\t: %s \nNama Penjual\t: %s", 
        kategoriProduk, daftarProduk, namaPenjualProduk);
    }
}