import java.util.Scanner;

public class App {

    static Kategori kategori[] = new Kategori[4];
    static Produk produk[] = new Produk[4];
    static Pembeli pembeli[] = new Pembeli[3];
    static Penjual penjual[] = new Penjual[3];
    static Transaksi transaksi[] = new Transaksi[3];

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        init();
        boolean selesai = false;
        System.out.print("\033[H\033[2J");

        do {
            System.out.println("Selamat datang di Flava! \n");
            System.out.println("Menu: ");
            System.out.println("1. Rekomendasi");
            System.out.println("2. Search & Filter");
            System.out.println("3. Keranjang Belanja");
            System.out.println("4. My Order");
            System.out.println("5. Promo dan Pembayaran");
            System.out.println("6. Notifikasi");
            System.out.print("\nPilihan: ");
            
            int pilihan;
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Terima kasih sudah menggunakan Flava!");
                    selesai = true;
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Masukkan angka yang valid");
                    scanner.nextLine();
                    break;
            }
        } while (!selesai);
        scanner.close();
    }

    public static void init() {
        kategori[0] = new Kategori("Pakaian", "Atasan", "White Blouse");
        kategori[1] = new Kategori("Pakaian", "Jeans", "Blue Jeans");
        kategori[2] = new Kategori("Sepatu", "Flats", "Yellow Sun");
        kategori[3] = new Kategori("Beauty", "Nail Care", "Nail Polish");

        produk[0] = new Produk("White Blouse", 500000, "Baju masih baru", "Chris", "Pakaian");
        produk[1] = new Produk("Blue Jeans", 400000, "Celana bekas", "Lisa", "Pakaian");
        produk[2] = new Produk("Yellow Sun", 600000, "Sepatu masih baru", "Axel", "Sepatu");
        produk[3] = new Produk("Nail Polish", 150000, "Glossy", "Axel", "Nail Care");

        pembeli[0] = new Pembeli("Reine", "White Blouse, Blue Jeans", "Jl. Bumi, No: 21");
        pembeli[1] = new Pembeli("Moona", "Yellow Sun", "Jl. Bulan, No: 12");
        pembeli[2] = new Pembeli("Jisoo", "Nail Polish", "Jl. Mars, No: 190");

        penjual[0] = new Penjual("Chris", "White Blouse", 4);
        penjual[1] = new Penjual("Lisa", "Blue Jeans", 5);
        penjual[2] = new Penjual("Axel", "Yellow Sun, Nail Polish", 5);

        transaksi[0] = new Transaksi("TRX001", "Reine", "White Blouse, Blue Jeans", "2023-06-12", 900000);
        transaksi[1] = new Transaksi("TRX002", "Moona", "Yellow Sun", "2023-06-15", 600000);
        transaksi[2] = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);
    }
}