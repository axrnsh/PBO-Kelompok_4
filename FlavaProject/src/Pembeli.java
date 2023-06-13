/* Desthacia
 * class ini berfungsi untuk menyimpan identitas pembeli
 */

public class Pembeli {

    private String namaPembeli;
    private String DaftarProduk;
    private String AlamatPembeli;
    private double ratingProduk;
    private String ulasan;

    public Pembeli() {
    }

    public Pembeli(String namaPembeli, String daftarProduk, String AlamatPembeli, double ratingProduk, String ulasan) {
        this.namaPembeli = namaPembeli;
        this.DaftarProduk = daftarProduk;
        this.AlamatPembeli = AlamatPembeli;
        this.ratingProduk = ratingProduk;
        this.ulasan = ulasan;
    }

    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getDaftarProduk() {
        return this.DaftarProduk;
    }

    public void setDaftarProduk(String DaftarProduk) {
        this.DaftarProduk = DaftarProduk;
    }

    public String setAlamatPembeli() {
        return this.AlamatPembeli;
    }

    public void setAlamatPembeli(String AlamatPembeli) {
        this.AlamatPembeli = AlamatPembeli;
    }

    public String getAlamatPembeli() {
        return this.AlamatPembeli;
    }

    public double getRatingProduk() {
        return this.ratingProduk;
    }

    public void setRatingProduk(double ratingProduk) {
        this.ratingProduk = ratingProduk;
    }

    public String getUlasan() {
        return this.ulasan;
    }

    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
    }

    @Override
    public String toString() {
        return "{" +
                " namaPembeli='" + getNamaPembeli() + "'" +
                ", DaftarProduk='" + getDaftarProduk() + "'" +
                ", AlamatPembeli='" + getAlamatPembeli() + "'" +
                ", ratingProduk='" + getRatingProduk() + "'" +
                ", ulasan='" + getUlasan() + "'" +
                "}";
    }

}