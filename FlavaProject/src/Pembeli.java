/* Desthacia
 * class ini berfungsi untuk menyimpan identitas pembeli
 */

public class Pembeli {

    private String namaPembeli;
    private String daftarTransaksi;
    private String alamatPembeli;

    public Pembeli() {
    }

    public Pembeli(String namaPembeli, String daftarTransaksi, String alamatPembeli) {
        this.namaPembeli = namaPembeli;
        this.daftarTransaksi = daftarTransaksi;
        this.alamatPembeli = alamatPembeli;
    }

    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getDaftarTransaksi() {
        return this.daftarTransaksi;
    }

    public void setDaftarTransaksi(String daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public String getAlamatPembeli() {
        return this.alamatPembeli;
    }

    @Override
    public String toString() {
        return "{" +
                " namaPembeli='" + getNamaPembeli() + "'" +
                ", daftarTransaksi='" + getDaftarTransaksi() + "'" +
                ", alamatPembeli='" + getAlamatPembeli();
    }

}