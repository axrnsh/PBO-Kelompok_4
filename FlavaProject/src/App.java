public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Selamat datang di Flava! \n");
        System.out.println("Menu: ");
        System.out.println("1. Rekomendasi");
        System.out.println("2. Search & Filter");
        System.out.println("3. Keranjang Belanja");
        System.out.println("4. My Order");
        System.out.println("5. Promo dan Pembayaran");
        System.out.println("6. Notifikasi");
    }

    public static void init() {
        SearchFilter celana = new SearchFilter();
        SearchFilter dress = new SearchFilter("White dress", "Pakaian", 150000);
        SearchFilter sepatu = new SearchFilter("Sneakers", "Sepatu", 99000);
        SearchFilter atasan = new SearchFilter("Kemeja", "Pakaian", 120000);
    }
}