import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // tolong banget kalau mau edit kerapiannya dijaga
    static Produk produk[] = new Produk[4];
    static Pembeli pembeli[] = new Pembeli[3];
    static Penjual penjual[] = new Penjual[3];
    static Transaksi transaksi[] = new Transaksi[3];

    public static ArrayList<Kategori> arrayKategori = new ArrayList<Kategori>();
    public static ArrayList<SubKategori> arraySubKategori = new ArrayList<SubKategori>();
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
                        // cuma bisa login sebagai admin untuk saat ini
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
        System.out.print("ID kategori produk \t: ");
        String idkat = scanner.nextLine();
        System.out.print("Kategori produk \t: ");
        String kat = scanner.nextLine();

        arrayKategori.add(new Kategori(idkat, kat));

        System.out.println("\nSilakan input sub kategori");
        System.out.println("ID sub kategori produk \t:");
        String idskt = scanner.nextLine();
        System.out.println("Sub kategori produk \t:");
        String skt = scanner.nextLine();

        arraySubKategori.add(new SubKategori(idkat, kat, idskt, skt));
    }

    public static void outputKategori() {
        System.out.println("| ID KATEGORI | KATEGORI PRODUK | SUB KATEGORI PRODUK |      PRODUK       |");
        System.out.println("---------------------------------------------------------------------------");
        for (SubKategori subkategori : arraySubKategori) {
            System.out.println(subkategori.toString());
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

        ArrayList<String> daftarPenjual = new ArrayList<String>();
        while (true) {
            System.out.print("Produk (tekan Enter untuk mengakhiri) \t: ");
            String penjual = scanner.nextLine();
            if (penjual.isEmpty()) {
                break;
            }
            daftarPenjual.add(penjual);
        }

        arrayProduk.add(new Produk(idProduk, namaProduk, hargaProduk, descProduk, null, null, stokProduk));
    }

    public static void inputPenjual() {
        System.out.println("\nSilakan input data berikut!");
        System.out.println("ID Penjual \t:");
        String idPenjual = scanner.nextLine();
        System.out.println("Nama Penjual \t:");
        String namaPenjual = scanner.nextLine();

        ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
        while (true) {
            System.out.print("Produk (tekan Enter untuk mengakhiri) \t: ");
            String produk = scanner.nextLine();
            if (produk.isEmpty()) {
                break;
            }
            daftarProduk.add(cariProduk(produk));
        }
        arrayPenjual.add(new Penjual(idPenjual, namaPenjual, daftarProduk));
    }

    public static void outputPenjual() {
        System.out.println("| ID PENJUAL | NAMA PENJUAL |      PRODUK       |");
        System.out.println("---------------------------------------------------------------------------");
        for (Penjual penjual : arrayPenjual) {
            System.out.println(penjual.toString());
        }
    }

    public static Produk cariProduk(String namaProduk) {
        for (Produk produk : arrayProduk) {
            if (produk.getNamaProduk().equals(namaProduk)) {
                return produk;
            }
        }
        return null;
    }
    // dari pak ade tadi jam 8

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
        Kategori katSatu = new Kategori("KATJK00001", "Pakaian");
        arrayKategori.add(katSatu);
        Kategori katDua = new Kategori("KATJK00001", "Pakaian");
        arrayKategori.add(katDua);
        Kategori katTiga = new Kategori("KATQW00005", "Sepatu");
        arrayKategori.add(katTiga);
        Kategori katEmpat = new Kategori("KATAB00009", "Beauty");
        arrayKategori.add(katEmpat);

        SubKategori sktSatu = new SubKategori("KATJK00001", "Pakaian", "SKTJK00002", "Atasan");
        arraySubKategori.add(sktSatu);
        SubKategori sktDua = new SubKategori("KATJK00001", "Pakaian", "SKTJK00004", "Celana");
        arraySubKategori.add(sktDua);
        SubKategori sktTiga = new SubKategori("KATQW00005", "Sepatu", "SKTQW00001", "Sneakers");
        arraySubKategori.add(sktTiga);
        SubKategori sktEmpat = new SubKategori("KATAB00001", "Beauty", "SKTAB00005", "Nail Care");
        arraySubKategori.add(sktEmpat);

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

        // Penjual penSatu = new Penjual("P001", "Chris", "White Blouse");
        // arrayPenjual.add(penSatu);
        // Penjual penDua = new Penjual("P002", "Lisa", "Blue Jeans");
        // arrayPenjual.add(penDua);
        // Penjual penTiga = new Penjual("P003", "Axel", "Yellow Sun");
        // arrayPenjual.add(penTiga);

        transaksi[0] = new Transaksi("TRX001", "Reine", "White Blouse", "2023-06-12", 500000);
        transaksi[1] = new Transaksi("TRX002", "Moana", "Yellow Sun", "2023-06-15", 600000);
        transaksi[2] = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);
    }
}