public class App {
    public static void main(String[] args) throws Exception {
        init();

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
        Kategori kat1 = new Kategori("Pakaian", "Atasan", "Classic Logo Tee");
        Kategori kat2 = new Kategori("Pakaian", "Rok", "Olympia Comfease Skirt");
        Kategori kat3 = new Kategori("Sepatu", "Heels", "Millie Heels");

        Produk produk1 = new Produk("White Blouse", 500000, "Baju masih baru", "Kiki", "Pakaian", (double) 4,
                "baju bagus");
        Produk produk2 = new Produk("Blue Jeans", 400000, "Celana bekas", "Dono", "celana", (double) 2.5,
                "Celana sudah usang");
        Produk produk3 = new Produk("Yellow Sun", 600000, "Sepstu masih baru", "Axel", "sepatu", (double) 5,
                "sepatunya keren sekali");

        Pembeli pembeli1 = new Pembeli("ayumi", "baju,celana,topi", "jl. uph no 21", 4.5, "bagus");
        Pembeli pembeli2 = new Pembeli("destha", "celana 2pcss", "jl. uph no 12", 5, "baik");
        Pembeli pembeli3 = new Pembeli("vanessa", "baju, topi", "jl. uph no 190", 8, "good");

        Penjual penjual1 = new Penjual("chris", "topi celine", 7);
        Penjual penjual2 = new Penjual("lisa", "croptop", 5);
        Penjual penjual3 = new Penjual("Michael", "celana jeans", 6);

        Transaksi transaksi1 = new Transaksi("TRX001", "White Blouse", "Rene", "2023-06-12", 500000);
        Transaksi transaksi2 = new Transaksi("TRX002", "Bllue Jeans", "Moona", "2023-06-15", 400000);
        Transaksi transaksi3 = new Transaksi("TRX003", "Risu", "Yellow Sun", "2023-06-20", 600000);
    }
}