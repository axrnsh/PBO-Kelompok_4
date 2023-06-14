import java.util.Scanner;

public class App {

    static Kategori kategori[] = new Kategori[3];
    static Produk produk[] = new Produk[3];
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
        kategori[0] = new Kategori("Pakaian", "Atasan", "Classic Logo Tee");
        kategori[1] = new Kategori("Pakaian", "Rok", "Olympia Comfease Skirt");
        kategori[2] = new Kategori("Sepatu", "Heels", "Millie Heels");

        produk[0] = new Produk("White Blouse", 500000, "Baju masih baru", "Kiki", "Pakaian");
        produk[1] = new Produk("Blue Jeans", 400000, "Celana bekas", "Dono", "celana");
        produk[2] = new Produk("Yellow Sun", 600000, "Sepatu masih baru", "Axel", "sepatu");

        pembeli[0] = new Pembeli("Ayumi", "baju,celana,topi", "jl. uph no 21");
        pembeli[1] = new Pembeli("Destha", "celana 2pcss", "jl. uph no 12");
        pembeli[2] = new Pembeli("Vanessa", "baju, topi", "jl. uph no 190");

        penjual[0] = new Penjual("chris", "topi celine", 7);
        penjual[1] = new Penjual("lisa", "croptop", 5);
        penjual[2] = new Penjual("Michael", "celana jeans", 6);

        transaksi[0] = new Transaksi("TRX001", "White Blouse", "Rene", "2023-06-12", 500000);
        transaksi[1] = new Transaksi("TRX002", "Bllue Jeans", "Moona", "2023-06-15", 400000);
        transaksi[2] = new Transaksi("TRX003", "Yellow Sun", "Jisoo", "2023-06-20", 600000);
    }
}

