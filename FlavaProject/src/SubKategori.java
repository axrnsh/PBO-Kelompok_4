import java.util.ArrayList;
import java.util.List;

public class SubKategori extends Kategori {
    private String idSubKategori;
    private String subKategori;
    private List<Produk> daftarProduk;

    public SubKategori() {
        daftarProduk = new ArrayList<>();
    }

    public SubKategori(String idKategori, String kategori, String idSubKategori, String subKategori) {
        super(idKategori, kategori);
        this.idSubKategori = idSubKategori;
        this.subKategori = subKategori;
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

    public String getSubKategori() {
        return subKategori;
    }

    public void setSubKategori(String subKategori) {
        this.subKategori = subKategori;
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(String.format("| %-10s | %-15s | %-19s |", getIdSubKategori(), getKategori(), getSubKategori()));
        builder.append("\nDaftar Produk:\n");
        for (Produk produk : daftarProduk) {
            builder.append(produk.toString()).append("\n");
        }
        return builder.toString();
    }
}