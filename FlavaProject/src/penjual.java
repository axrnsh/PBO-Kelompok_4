public class penjual {

    private String namaPenjual;
    private String DaftarProduk;
    private double ratingPenjual;

    public penjual() {
    }

    public penjual(String namaPenjual, String DaftarProduk, double ratingPenjual) {
        this.namaPenjual = namaPenjual;
        this.DaftarProduk = DaftarProduk;
        this.ratingPenjual = ratingPenjual;
    }

    public String getNamaPenjual() {
        return this.namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getDaftarProduk() {
        return this.DaftarProduk;
    }

    public void setDaftarProduk(String DaftarProduk) {
        this.DaftarProduk = DaftarProduk;
    }

    public double getRatingPenjual() {
        return this.ratingPenjual;
    }

    public void setRatingPenjual(double ratingPenjual) {
        this.ratingPenjual = ratingPenjual;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama Penjual: " + namaPenjual + "\n"
                + "Daftar Produk: " + DaftarProduk + "\n"
                + "Rating Penjual: " + ratingPenjual;
    }
}