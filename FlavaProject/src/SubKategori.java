import java.util.ArrayList;
import java.util.List;

public class SubKategori extends Kategori {
    private String idSubKategori;
    private List<Produk> daftarProduk;

    public SubKategori() {
        daftarProduk = new ArrayList<>();
    }

    public SubKategori(String idKategori, String kategoriProduk, String subKategoriProduk) {
        super(idKategori, kategoriProduk, subKategoriProduk);
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public void hapusProduk(Produk produk) {
        daftarProduk.remove(produk);
    }

    public String getIdSubKategori() {
        return idSubKategori;
    }

    public void setIdSubKategori(String idSubKategori) {
        this.idSubKategori = idSubKategori;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-15s | %-19s | %-16s |",
            getIdSubKategori(), getKategoriProduk(), getSubKategoriProduk(), getDaftarProduk());
    }
}