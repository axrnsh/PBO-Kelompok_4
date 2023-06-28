public class SubKategori extends Kategori {
    private String daftarProduk;

    public SubKategori() {
    }

    public SubKategori(String kategoriProduk, String subKategoriProduk, String daftarProduk) {
        super(kategoriProduk, subKategoriProduk);
        this.daftarProduk = daftarProduk;
    }

    public String getDaftarProduk() {
        return daftarProduk;
    }

    public void setDaftarProduk(String daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-19s | %-16s |",
                getKategoriProduk(), getSubKategoriProduk(), getDaftarProduk());
    }
}
