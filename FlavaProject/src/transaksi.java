public class transaksi {
    private String idTransaksi;
    private String tanggal;
    private double total;

    public transaksi(String idTransaksi, String tanggal, double total) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.total = total;
    }

    public void tampilkanInfo() {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Total: " + total);
    }

    public void ubahTotal(double totalBaru) {
        this.total = totalBaru;
        System.out.println("Total telah diubah menjadi " + total);
    }

    public static void main(String[] args) {
        // Membuat objek transaksi1
        transaksi transaksi1 = new transaksi("TRX001", "2023-06-12", 500000);

        // Menampilkan informasi transaksi1
        transaksi1.tampilkanInfo();

        // Mengubah total transaksi1
        transaksi1.ubahTotal(750000);

        // Menampilkan informasi transaksi1 setelah diubah
        transaksi1.tampilkanInfo();
    }
}

