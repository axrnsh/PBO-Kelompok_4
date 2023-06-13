/* Devina
 * class ini berfunsi untuk menyimpan informasi transaksi yang terjadi
 */

public class Transaksi {
    private String idTransaksi;
    private String namaProduk;
    private String namaPembeliProduk;
    private String tanggal;
    private double total;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi, String namaProduk, String namaPembeliProduk, String tanggal, double total) {
        this.idTransaksi = idTransaksi;
        this.namaProduk = namaProduk;
        this.namaPembeliProduk = namaPembeliProduk;
        this.tanggal = tanggal;
        this.total = total;
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

    // Getter untuk tanggal
    public String getTanggal() {
        return tanggal;
    }

    // Setter untuk tanggal
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Getter untuk total
    public double getTotal() {
        return total;
    }

    // Setter untuk total
    public void setTotal(double total) {
        this.total = total;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    @Override
    public String toString() {
        return "{" +
                " idTransaksi='" + getIdTransaksi() + "'" +
                ", namaProduk='" + getNamaProduk() + "'" +
                ", namaPembeliProduk='" + getNamaPembeliProduk() + "'" +
                ", tanggal='" + getTanggal() + "'" +
                ", total='" + getTotal() + "'" +
                "}";
    }

}
