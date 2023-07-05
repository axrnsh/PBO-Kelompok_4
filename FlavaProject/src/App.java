import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // tolong banget kalau mau edit kerapiannya dijaga
    static Kategori kategori[] = new Kategori[4];
    static SubKategori subKategori[] = new SubKategori[4];
    static Produk produk[] = new Produk[4];
    static Pembeli pembeli[] = new Pembeli[3];
    static Penjual penjual[] = new Penjual[3];
    static Transaksi transaksi[] = new Transaksi[3];

    public static ArrayList<Kategori> arrayKategori = new ArrayList<Kategori>();
    public static ArrayList<Penjual> arrayPenjual = new ArrayList<Penjual>();
    public static ArrayList<Pembeli> arrayPembeli = new ArrayList<Pembeli>();
    public static ArrayList<Produk> arrayProduk = new ArrayList<Produk>();
    public static ArrayList<Transaksi> arrayTransaksi = new ArrayList<Transaksi>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        init();
        boolean loggedIn = false;
        boolean selesai = false;

        do {
            System.out.println("\nSelamat datang di Flava!\n");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");

            String pilih;
            pilih = scanner.nextLine();

            switch (pilih) {
                case "1": 
                    if (!loggedIn) {
                        //cuma bisa login sebagai admin untuk saat ini
                        System.out.print("\nUsername: ");
                        String username = scanner.nextLine();
                        System.out.print("Password: ");
                        String password = scanner.nextLine();

                        if (Login.login(username, password)) {
                            loggedIn = true;
                            String role = Login.posisi(username);
                            
                            do {
                                if (role.equals("admin")) {
                                    UserAdmin adminLogin = new UserAdmin();
                                    adminLogin.showMenu();
                                    System.out.print("\nPilihan: ");

                                    String pilihanLagi;
                                    pilihanLagi = scanner.nextLine();

                                    switch (pilihanLagi) {
                                        case "1":
                                            inputKategori();
                                            break;
                                        case "2":
                                            outputKategori();
                                            break;
                                        case "3":
                                            break;
                                        case "4":
                                            break;
                                        case "5":
                                            inputProduk();
                                            break;
                                        case "6":
                                            outputProduk();
                                            break;
                                        case "7":
                                            break;
                                        case "8":
                                            break;
                                        case "9":
                                            inputPenjual();
                                            break;
                                        case "10":
                                            outputPenjual();
                                            break;
                                        case "11":
                                            break;
                                        case "12":
                                            break;
                                        case "13":
                                            inputPembeli();
                                            break;
                                        case "14":
                                            outputPembeli();
                                            break;
                                        case "15":
                                            break;
                                        case "16":
                                            break;
                                        case "17":
                                            inputTransaksi();
                                            break;
                                        case "18":
                                            outputTransaksi();
                                            break;
                                        case "19":
                                            break;
                                        case "20":
                                            break;
                                        case "0":
                                            System.out.println("Logout berhasil!");
                                            loggedIn = false;
                                            break;
                                        default:
                                            System.out.println("Masukkan angka yang valid");
                                            break;
                                    }
                                }
                            } while (loggedIn);
                        }
                    }
                    break;
                case "2":
                    System.out.println("Terima kasih sudah menggunakan Flava!");
                    selesai = true;
                    break;
                default:
                    System.out.println("Masukkan angka yang valid");
                    break;
            }
        } while (!selesai);
        scanner.close();
    }

    public static void inputKategori() {
        System.out.println("\nInput data berikut!");
        System.out.print("ID Kategori produk \t: ");
        String idkat = scanner.nextLine();
        System.out.print("Kategori produk \t: ");
        String kat = scanner.nextLine();

        arrayKategori.add(new Kategori(idkat, kat));
    }

    public static void outputKategori() { //tampilan akan diperbaiki nanti
        System.out.println("| ID KATEGORI | KATEGORI PRODUK | SUB KATEGORI PRODUK |");
        System.out.println("-----------------------------------------");
        for (Kategori kategoriInit : kategori) {
            if (kategoriInit != null) {
                System.out.println(kategoriInit);
            }
        }

        for (Kategori kategoriOutput : arrayKategori) {
            if (kategoriOutput != null) {
                System.out.println(kategoriOutput);
            }
        }
    }

    public static void inputProduk() {
        System.out.println("\nInput data berikut!");
        System.out.print("ID Produk \t: ");
        String idProduk = scanner.nextLine();
        System.out.print("Nama produk \t\t: ");
        String namaProduk = scanner.nextLine();
        System.out.print("Harga produk \t\t: ");
        int hargaProduk = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Deskripsi produk \t: ");
        String descProduk = scanner.nextLine();
        System.out.print("Stok produk \t: ");
        int stokProduk = scanner.nextInt();
        scanner.nextLine();

        Produk produk = new Produk(idProduk, namaProduk, hargaProduk, descProduk, penjual, stokProduk);
        arrayProduk.add(produk);
    }

    public static void inputPenjual() {
        System.out.println("\nInput data berikut!");
        System.out.print("ID Penjual \t: ");
        String idPenjual = scanner.nextLine();
        System.out.print("Nama Penjual \t\t: ");
        String namaPenjual = scanner.nextLine();

        ArrayList<String> daftarProduk = new ArrayList<String>();
        while (true) {
            System.out.print("Produk (tekan Enter untuk mengakhiri) \t: ");
            String produk = scanner.nextLine();
            if (produk.isEmpty()) {
                break;
            }
            daftarProduk.add(produk);
        }
        // arrayPenjual.add(new Penjual(idPenjual, namaPenjual, daftarProduk));
    }

    public static void inputPembeli() {
        System.out.println("\nInput data berikut!");
        System.out.print("Nama pembeli \t: ");
        String namaPembeli = scanner.nextLine();
        System.out.print("Transaksi \t: ");
        String daftarTransaksi = scanner.nextLine();
        System.out.print("Alamat pembeli \t: ");
        String alamatPembeli = scanner.nextLine();

        arrayPembeli.add(new Pembeli(namaPembeli, daftarTransaksi, alamatPembeli));
    }

    public static void inputTransaksi() {
        System.out.println("\nInput data berikut!");
        System.out.print("Id transaksi \t: ");
        String idTransaksi = scanner.nextLine();
        System.out.print("Nama pembeli \t: ");
        String pembeliTransaksi = scanner.nextLine();
        System.out.print("Nama produk \t: ");
        String produkTransaksi = scanner.nextLine();
        System.out.print("Tanggal \t: ");
        String tanggal = scanner.nextLine();
        System.out.print("Total \t\t: ");
        Double totalTransaksi = scanner.nextDouble();
        scanner.nextLine();

        arrayTransaksi.add(new Transaksi(idTransaksi, pembeliTransaksi, produkTransaksi, tanggal, totalTransaksi));
    }

    public static void outputProduk() {
        System.out.println(
                "|   NAMA PRODUK   |  HARGA PRODUK  |   DESKRIPSI PRODUK   |   NAMA PENJUAL   | KATEGORI PRODUK |");
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        for (Produk produkInit : produk) {
            if (produkInit != null) {
                System.out.println(produkInit);
            }
        }

        for (Produk produkOutput : arrayProduk) {
            if (produkOutput != null) {
                System.out.println(produkOutput);
            }
        }
    }

    public static void outputPenjual() {
        System.out.println("|   ID PENJUAL   |      NAMA PENJUAL      |     PRODUK     |");
        System.out.println("--------------------------------------------------------");
        for (Penjual penjualInit : penjual) {
            if (penjualInit != null) {
                System.out.println(penjualInit);
            }
        }

        for (Penjual penjualOutput : arrayPenjual) {
            if (penjualOutput != null) {
                System.out.println(penjualOutput);
            }
        }
    }

    public static void outputPembeli() {
        System.out.println("|   NAMA PEMBELI   |   PRODUK DIBELI   |      ALAMAT PEMBELI     |");
        System.out.println("------------------------------------------------------------------");
        for (Pembeli pembeliInit : pembeli) {
            if (pembeliInit != null) {
                System.out.println(pembeliInit);
            }
        }

        for (Pembeli pembeliOutput : arrayPembeli) {
            if (pembeliOutput != null) {
                System.out.println(pembeliOutput);
            }
        }
    }

    public static void outputTransaksi() {
        System.out
                .println("|  ID TRANSAKSI  |   NAMA PEMBELI   |      PRODUK      |   TANGGAL   |       TOTAL       |");
        System.out
                .println("------------------------------------------------------------------------------------------");
        for (Transaksi transaksiInit : transaksi) {
            if (transaksiInit != null) {
                System.out.println(transaksiInit);
            }
        }

        for (Transaksi transaksiOutput : arrayTransaksi) {
            if (transaksiOutput != null) {
                System.out.println(transaksiOutput);
            }
        }
    }

    public static void init() {
        kategori[0] = new Kategori("KATJK00001", "Pakaian");
        kategori[1] = new Kategori("KATJK000001", "Pakaian");
        kategori[2] = new Kategori("KATQW000005", "Sepatu");
        kategori[3] = new Kategori("KATAB000009", "Beauty");

        subKategori[0] = new SubKategori("KATJK00001", "Pakaian", "SKTJK00002", "Atasan");

        produk[0] = new Produk("PK0099", "White Blouse", 5000000, "Baju baru yang bagus", null, null, 0);
        produk[1] = new Produk("PK0010", "Blue Jeans", 2000000,
                "Celana bekas namun masih bagus", null, null, 50);
        produk[2] = new Produk("PK0018", "Yellow Sun", 6000000,
                "Sepatu baru yg cocok dipakai utk hangout", null, null, 20);
        produk[3] = new Produk("PK0182", "Nail Polish", 300000,
                "Glossy tahan lama", null, null, 40);

        pembeli[0] = new Pembeli("Reine", "White Blouse", "Jl. Bumi, No: 21");
        pembeli[1] = new Pembeli("Moona", "Yellow Sun", "Jl. Bulan, No: 12");
        pembeli[2] = new Pembeli("Jisoo", "Nail Polish", "Jl. Mars, No: 190");

        penjual[0] = new Penjual("P001", "Chris", "White Blouse");
        penjual[1] = new Penjual("P002", "Lisa", "Blue Jeans");
        penjual[2] = new Penjual("P003", "Axel", "Yellow Sun");

        transaksi[0] = new Transaksi("TRX001", "Reine", "White Blouse", "2023-06-12", 500000);
        transaksi[1] = new Transaksi("TRX002", "Moana", "Yellow Sun", "2023-06-15", 600000);
        transaksi[2] = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);
    }
}