/* Desthacia
 * class ini berfungsi untuk menyimpan identitas pembeli
 */


public class Pembeli {

    private String namaPembeli;
    private String DaftarProduk;
    private String AlamatPembeli;

    public Pembeli() {
    }

    public Pembeli(String namaPembeli, String daftarProduk, String AlamatPembeli) {
        this.namaPembeli = namaPembeli;
        this.DaftarProduk = daftarProduk;
        this.AlamatPembeli = AlamatPembeli;
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

    @Override
    public String toString() {
        return "{" +
                " namaPembeli='" + getNamaPembeli() + "'" +
                ", DaftarProduk='" + getDaftarProduk() + "'" +
                "}";
    }

}