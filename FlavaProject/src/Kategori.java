/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String idKategori;
    private String kategoriProduk;
    private String subKategoriProduk;

    public Kategori() {
    }

    public Kategori(String idKategori, String kategoriProduk, String subKategoriProduk) {
        this.idKategori = idKategori;
        this.kategoriProduk = kategoriProduk;
        this.subKategoriProduk = subKategoriProduk;
    }

    public String getIdKategori() {
        return this.idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
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


    @Override
    public String toString() {
        return String.format("| %-11s | %-15s | %-19s |", 
        idKategori, kategoriProduk, subKategoriProduk);
    }
}