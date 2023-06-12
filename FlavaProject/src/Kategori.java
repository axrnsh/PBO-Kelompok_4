public class Kategori {
    private String kategoriProduk;
    private String subKategoriProduk;
    private String namaProduk;
    private String namaPenjual;

    public Kategori() {
    }

    public Kategori(String kategoriProduk, String subKategoriProduk, String namaProduk, String namaPenjual) {
        this.kategoriProduk = kategoriProduk;
        this.subKategoriProduk = subKategoriProduk;
        this.namaProduk = namaProduk;
        this.namaPenjual = namaPenjual;
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

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    @Override
    public String toString() {
        return String.format("Nama produk\t: %s \nKategori produk\t: %s \nHarga produk\t: Rp. %d", 
        kategoriProduk, subKategoriProduk, namaProduk);
    }
}