import java.util.ArrayList;

public class SubKategori extends Kategori {
    private String idSubKategori;
    private String subKategori;
    private ArrayList<Produk> produk = new ArrayList<Produk>();

    public SubKategori() {
    }

    public SubKategori(String idKategori, String kategori, String idSubKategori, String subKategori) {
        super(idKategori, kategori);
        this.idSubKategori = idSubKategori;
        this.subKategori = subKategori;
    }

    public void tambahProduk(Produk produk) {
        this.produk.add(produk);
    }

    public void hapusProduk(Produk produk) {
        this.produk.remove(produk);
    }

    public String getIdSubKategori() {
        return idSubKategori;
    }

    public void setIdSubKategori(String idSubKategori) {
        this.idSubKategori = idSubKategori;
    }

    public String getSubKategori() {
        return subKategori;
    }

    public void setSubKategori(String subKategori) {
        this.subKategori = subKategori;
    }

    public ArrayList<Produk> getDaftarProduk() {
        return produk;
    }

    @Override
    public String toString() {
        return String.format("| %-11s | %-15s | %-19s |", 
        getIdKategori(), getKategori(), getSubKategori());
    }
}