public class Notifikasi {
    private String pesan;

    // Konstruktor empty
    public Notifikasi() {
    }

    // Konstruktor all field
    public Notifikasi(String pesan) {
        this.pesan = pesan;
    }

    // Metode setter untuk atribut pesan
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    // Metode getter untuk atribut pesan
    public String getPesan() {
        return pesan;
    }

    // Metode toString untuk representasi String dari objek Notifikasi
    @Override
    public String toString() {
        return "Notifikasi{" +
                "pesan='" + pesan + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor empty
        Notifikasi notifikasi1 = new Notifikasi();

        // Menggunakan metode setter untuk mengatur pesan notifikasi
        notifikasi1.setPesan("Ini adalah notifikasi penting!");

        // Menggunakan metode getter untuk mendapatkan pesan notifikasi
        String pesanNotifikasi1 = notifikasi1.getPesan();
        System.out.println("Pesan Notifikasi 1: " + pesanNotifikasi1);

        // Membuat objek menggunakan konstruktor all field
        Notifikasi notifikasi2 = new Notifikasi("Ini adalah notifikasi lain");

        // Menggunakan metode getter untuk mendapatkan pesan notifikasi
        String pesanNotifikasi2 = notifikasi2.getPesan();
        System.out.println("Pesan Notifikasi 2: " + pesanNotifikasi2);

        // Menggunakan metode toString untuk mencetak representasi String dari objek Notifikasi
        System.out.println("Objek Notifikasi 1: " + notifikasi1.toString());
        System.out.println("Objek Notifikasi 2: " + notifikasi2.toString());
    }
}
