/* Devina
 * class ini berfunsi untuk menyimpan informasi transaksi yang terjadi
 */

public class Transaksi {
    private String idTransaksi;
    private String namaPembeliProduk;
    private String tanggal;
    private double total;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi, String namaPembeliProduk, String tanggal, double total) {
        this.idTransaksi = idTransaksi;
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
    
    @Override
    public String toString() {
        return "{" +
            " idTransaksi='" + getIdTransaksi() + "'" +
            ", namaPembeliProduk='" + getNamaPembeliProduk() + "'" +
            ", tanggal='" + getTanggal() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }
    
}
