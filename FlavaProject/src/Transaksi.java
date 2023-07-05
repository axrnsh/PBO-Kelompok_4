/* Devina
 * class ini berfunsi untuk menyimpan informasi transaksi yang terjadi
 */

public class Transaksi {
    private String idTransaksi;
    private String namaPembeliProduk;
    private String namaProduk;
    private String tanggal;
    private double harga;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi, String namaPembeliProduk, String namaProduk, String tanggal, double harga) {
        this.idTransaksi = idTransaksi;
        this.namaPembeliProduk = namaPembeliProduk;
        this.namaProduk = namaProduk;
        this.tanggal = tanggal;
        this.harga = harga;
    }

    // Getter untuk idTransaksi
    public String getIdTransaksi() {
        return idTransaksi;
    }

    // Setter untuk idTransaksi
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaPembeliProduk() {
        return namaPembeliProduk;
    }

    public void setNamaPembeliProduk(String namaPembeliProduk) {
        this.namaPembeliProduk = namaPembeliProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // Getter untuk tanggal
    public String getTanggal() {
        return tanggal;
    }

    // Setter untuk tanggal
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.format("| %-14s | %-16s | %-16s | %-11s | %-17f |",
                idTransaksi, namaPembeliProduk, namaProduk, tanggal, harga);
    }

}
