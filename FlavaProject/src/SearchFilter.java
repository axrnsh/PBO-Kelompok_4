import java.util.ArrayList;
import java.util.List;

/* class ini berisikan getter dari fitur pencarian barang dan filter
 * sesuai keinginan user berdasarkan nama, kategori, dan harga produk
*/
class Produk {
    private String namaProduk;
    private String kategoriProduk;
    private double hargaProduk;

    public Produk(String namaProduk, String kategoriProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.kategoriProduk = kategoriProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getKategoriProduk() {
        return kategoriProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }
}

public class SearchFilter {
    private List<Produk> produkProduk;
    public SearchFilter(List<Produk>produkProduk) {
        this.produkProduk = produkProduk;
    }

    // Untuk mencari nama produk berdasarkan kata kunci
    public List<Produk> searchByName(String kataKunci){
        return null;
    }

    // Untuk mencari kategori menggunakan filter 
    public List<Produk> filterByCategory(String kategori){
        return null;
    }

    //Untuk mencari range harga menggunakan filter
    public List<Produk> filterByPrice(String harga){
        return null;
    }
}
