public class Notifikasi {
    private String pesan;

    // Metode setter untuk atribut pesan
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    // Metode getter untuk atribut pesan
    public String getPesan() {
        return pesan;
    }

    public static void main(String[] args) {
        Notifikasi notifikasi = new Notifikasi();

        // Menggunakan metode setter untuk mengatur pesan notifikasi
        notifikasi.setPesan("Ini adalah notifikasi penting!");

        // Menggunakan metode getter untuk mendapatkan pesan notifikasi
        String pesanNotifikasi = notifikasi.getPesan();
        System.out.println("Pesan Notifikasi: " + pesanNotifikasi);
    }
}
