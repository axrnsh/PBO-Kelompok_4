/* Devina
 * class ini berfunsi untuk menyimpan informasi transaksi yang terjadi
 */

public class Transaksi {
    private String idTransaksi;
    private String tanggal;
    private double total;

    public Transaksi() {
    }


    public Transaksi(String idTransaksi, String tanggal, double total) {
        this.idTransaksi = idTransaksi;
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
        return "ID Transaksi: " + idTransaksi + "\n" +
               "Tanggal: " + tanggal + "\n" +
               "Total: " + total;
    }

}
