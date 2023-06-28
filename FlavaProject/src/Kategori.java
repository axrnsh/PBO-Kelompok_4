/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String kategoriProduk;
    private String subKategoriProduk;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String subKategoriProduk) {
        this.kategoriProduk = kategoriProduk;
        this.subKategoriProduk = subKategoriProduk;
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
        return String.format("| %-15s | %-19s |", 
        kategoriProduk, subKategoriProduk);
    }
}