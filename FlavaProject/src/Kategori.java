/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String kategoriProduk;
    private String subKategoriProduk;
    private String daftarProduk;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String subKategoriProduk, String daftarProduk) {
        this.kategoriProduk = kategoriProduk;
        this.subKategoriProduk = subKategoriProduk;
        this.daftarProduk = daftarProduk;
    }

    public String getKategoriProduk() {
        return this.kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public String getSubKategoriProduk() {
        return this.subKategoriProduk;
    }

    public void setSubKategoriProduk(String subKategoriProduk) {
        this.subKategoriProduk = subKategoriProduk;
    }

    public String getDaftarProduk() {
        return this.daftarProduk;
    }

    public void setDaftarProduk(String daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-19s | %-16s |", 
        kategoriProduk, subKategoriProduk, daftarProduk);
    }
}