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
                                            inputKat();
                                            break;
                                        case "2":
                                            outputKategori();
                                            break;
                                        case "3":
                                            editKategori();
                                            break;
                                        case "4":
                                            deleteKategori();
                                            break;
                                        case "5":
                                            inputProduk();
                                            break;
                                        case "6":
                                            outputProduk();
                                            break;
                                        case "7":
                                            editProduk();
                                            break;
                                        case "8":
                                            deleteProduk();
                                            break;
                                        case "9":
                                            inputPenjual();
                                            break;
                                        case "10":
                                            outputPenjual();
                                            break;
                                        case "11":
                                            editDataPenjual();
                                            break;
                                        case "12":
                                            hapusDataPenjual();
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

    public static void inputKat() {
        IKategori newKategori = new IKategori();
        newKategori.showMenu();
        System.out.print("\nPilihan: ");

        String pilihlah;
        pilihlah = scanner.nextLine();

        switch (pilihlah) {
            case "1":
                inputKategori();
                break;
            case "2":
                produkKeKat();
                break;
            case "0":
                break;
            default:
                System.out.println("Masukkan angka yang valid");
                break;
        }
    }

    public static void inputKategori() {
        System.out.println("\nInput data berikut!");
        System.out.print("ID kategori produk \t: ");
        String idkat = scanner.nextLine();
        System.out.print("Kategori produk \t: ");
        String kat = scanner.nextLine();

        arrayKategori.add(new Kategori(idkat, kat));

        System.out.print("ID sub kategori produk \t: ");
        String idskt = scanner.nextLine();
        System.out.print("Sub kategori produk \t: ");
        String skt = scanner.nextLine();

        arraySubKategori.add(new SubKategori(idkat, kat, idskt, skt));

        System.out.println("Input berhasil!");
    }

    public static void produkKeKat() {
        outputKategori();
        System.out.print("\nMasukkan ID Kategori \t: ");
        String idKategori = scanner.nextLine();
        System.out.print("Masukkan ID Sub Kategori: ");
        String idSubKategori = scanner.nextLine();
        System.out.print("Masukkan ID Produk \t: ");
        String idProduk = scanner.nextLine();

        Kategori targetKategori = null;
        SubKategori targetSubKategori = null;
        Produk targetProduk = null;

        for (Kategori kategori : arrayKategori) {
            if (kategori.getIdKategori().equals(idKategori)) {
                targetKategori = kategori;
                break;
            }
        }
        if (targetKategori != null) {
            for (SubKategori subKategori : arraySubKategori) {
                if (subKategori.getIdSubKategori().equals(idSubKategori)
                        && subKategori.getIdKategori().equals(idKategori)) {
                    targetSubKategori = subKategori;
                    break;
                }
            }
        }
        if (targetSubKategori != null) {
            for (Produk produk : arrayProduk) {
                if (produk.getIdProduk().equals(idProduk)) {
                    targetProduk = produk;
                    break;
                }
            }
        }
        if (targetKategori != null && targetSubKategori != null && targetProduk != null) {
            targetSubKategori.tambahProduk(targetProduk);
            System.out.println("Produk berhasil ditambahkan ke sub kategori!");
        } else {
            System.out.println("Kategori, sub kategori, atau produk tidak ditemukan!");
        }
    }

    public static void outputKategori() {
        System.out.println(
                "| ID KATEGORI | KATEGORI PRODUK | ID SUB KATE | SUB KATEGORI PRODUK |        PRODUK        |");
        System.out.println(
                "--------------------------------------------------------------------------------------------");
        for (SubKategori subkategori : arraySubKategori) {
            System.out.println(subkategori.toString());
        }
    }

    public static void editKategori() {
        outputKategori();
        System.out.print("Masukkan ID Kategori yang akan diedit: ");
        String idKategori = scanner.nextLine();

        Kategori targetKategori = null;
        ArrayList<SubKategori> subKategoriToUpdate = new ArrayList<>();

        for (Kategori kategori : arrayKategori) {
            if (kategori.getIdKategori().equals(idKategori)) {
                targetKategori = kategori;
                break;
            }
        }
        if (targetKategori != null) {
            System.out.print("Masukkan nama Kategori baru: ");
            String newNamaKategori = scanner.nextLine();
            targetKategori.setKategori(newNamaKategori);
            for (SubKategori subKategori : arraySubKategori) {
                if (subKategori.getIdKategori().equals(idKategori)) {
                    subKategoriToUpdate.add(subKategori);
                }
            }
            for (SubKategori subKategori : subKategoriToUpdate) {
                System.out.print("Masukkan nama Sub Kategori baru untuk " + subKategori.getSubKategori() + ": ");
                String newNamaSubKategori = scanner.nextLine();
                subKategori.setSubKategori(newNamaSubKategori);
            }
            System.out.println("Kategori dan subkategori berhasil diubah!");
        } else {
            System.out.println("Kategori tidak ditemukan!");
        }
    }

    public static void deleteKategori() {
        outputKategori();
        System.out.println("Warning: Menghapus kategori akan menghapus sub kategori di dalamnya juga");
        System.out.print("Masukkan ID Kategori yang akan dihapus: ");
        String idKategori = scanner.nextLine();

        Kategori targetKategori = null;
        ArrayList<SubKategori> subKategoriToDelete = new ArrayList<>();

        for (Kategori kategori : arrayKategori) {
            if (kategori.getIdKategori().equals(idKategori)) {
                targetKategori = kategori;
                break;
            }
        }
        if (targetKategori != null) {
            for (SubKategori subKategori : arraySubKategori) {
                if (subKategori.getIdKategori().equals(idKategori)) {
                    subKategoriToDelete.add(subKategori);
                }
            }
            for (SubKategori subKategori : subKategoriToDelete) {
                arraySubKategori.remove(subKategori);
            }
            arrayKategori.remove(targetKategori);
            System.out.println("Kategori dan subkategori berhasil dihapus!");
        } else {
            System.out.println("Kategori tidak ditemukan!");
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
    
        ArrayList<Penjual> daftarPenjual = new ArrayList<Penjual>();
        while (true) {
            System.out.print("ID Penjual (tekan Enter untuk mengakhiri) \t: ");
            String idPenjual = scanner.nextLine();
            if (idPenjual.isEmpty()) {
                break;
            }
            Penjual penjual = cariPenjual(idPenjual);
            if (penjual != null) {
                daftarPenjual.add(penjual);
            } else {
                System.out.println("Penjual dengan ID tersebut tidak ditemukan!");
            }
        }
    
        arrayProduk.add(new Produk(idProduk, namaProduk, hargaProduk, descProduk, null, stokProduk, daftarPenjual));
    }
    
    public static Penjual cariPenjual(String idPenjual) {
        for (Penjual penjual : arrayPenjual) {
            if (penjual.getIdPenjual().equals(idPenjual)) {
                return penjual;
            }
        }
        return null;
    }
    

    public static void inputPenjual() {
        System.out.println("\nSilakan input data berikut!");
        System.out.print("ID Penjual \t:");
        String idPenjual = scanner.nextLine();
        System.out.print("Nama Penjual \t:");
        String namaPenjual = scanner.nextLine();

        ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
        while (true) {
            System.out.print("Produk (tekan Enter untuk mengakhiri) : ");
            String produk = scanner.nextLine();
            if (produk.isEmpty()) {
                break;
            }
            daftarProduk.add(cariProduk(produk));
        }
        arrayPenjual.add(new Penjual(idPenjual, namaPenjual, daftarProduk));
    }

    public static void outputPenjual() {
        System.out.println("| ID PENJUAL | NAMA PENJUAL |      PRODUK      |");
        System.out.println("-------------------------------------------------");
        for (Penjual penjual : arrayPenjual) {
            System.out.println(penjual.toString());
        }
    }

    public static void editDataPenjual() {
        outputPenjual();
        System.out.print("\nMasukkan ID Penjual yang akan diedit: ");
        String idPenjual = scanner.nextLine();

        Penjual targetPenjual = null;
        for (Penjual penjual : arrayPenjual) {
            if (penjual.getIdPenjual().equals(idPenjual)) {
                targetPenjual = penjual;
                break;
            }
        }
        if (targetPenjual != null) {
            System.out.print("Masukkan nama penjual baru: ");
            String newNamaPenjual = scanner.nextLine();
            targetPenjual.setNamaPenjual(newNamaPenjual);
            System.out.println("Data penjual berhasil diubah!");
        } else {
            System.out.println("Penjual tidak ditemukan!");
        }
    }

    public static void hapusDataPenjual() {
        outputPenjual();
        System.out.print("\nMasukkan ID Penjual yang akan dihapus: ");
        String idPenjual = scanner.nextLine();

        Penjual targetPenjual = null;
        for (Penjual penjual : arrayPenjual) {
            if (penjual.getIdPenjual().equals(idPenjual)) {
                targetPenjual = penjual;
                break;
            }
        }

        if (targetPenjual != null) {
            arrayPenjual.remove(targetPenjual);
            System.out.println("Data Penjual berhasil dihapus!");
        } else {
            System.out.println("Penjual tidak ditemukan!");
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

        // arrayPembeli.add(new Pembeli(namaPembeli, daftarTransaksi, alamatPembeli));
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
        System.out.println("|   ID PRODUK   |   NAMA PRODUK   |   HARGA PRODUK   |    DESKRIPSI PRODUK   |   SUBKATEGORI PRODUK   |   STOK PRODUK   |   DAFTARPENJUAL   |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for (Produk produkOutput : arrayProduk) {
            System.out.println(produkOutput);
        }
    }
    
    public static void editProduk() {
        outputProduk();
        System.out.print("\nMasukkan ID Produk yang akan diedit: ");
        String idProduk = scanner.nextLine();
    
        Produk targetProduk = null;
        for (Produk produk : arrayProduk) {
            if (produk.getIdProduk().equals(idProduk)) {
                targetProduk = produk;
                break;
            }
        }
    
        if (targetProduk != null) {
            System.out.println("\nEdit data produk:");
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
    
            targetProduk.setNamaProduk(namaProduk);
            targetProduk.setHargaProduk(hargaProduk);
            targetProduk.setDeskripsiProduk(descProduk);
            targetProduk.setStokProduk(stokProduk);
    
            System.out.println("Produk berhasil diubah!");
        } else {
            System.out.println("Produk tidak ditemukan!");
        }
    }
    
    public static void deleteProduk() {
        outputProduk();
        System.out.print("\nMasukkan ID Produk yang akan dihapus: ");
        String idProduk = scanner.nextLine();
    
        Produk targetProduk = null;
        for (Produk produk : arrayProduk) {
            if (produk.getIdProduk().equals(idProduk)) {
                targetProduk = produk;
                break;
            }
        }
    
        if (targetProduk != null) {
            // Remove the target product from the arrayProduk ArrayList
            arrayProduk.remove(targetProduk);
            System.out.println("Produk berhasil dihapus!");
        } else {
            System.out.println("Produk tidak ditemukan!");
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
        Kategori katPakaian = new Kategori("KATJK00001", "Pakaian");
        arrayKategori.add(katPakaian);
        Kategori katSepatu = new Kategori("KATQW00005", "Sepatu");
        arrayKategori.add(katSepatu);
        Kategori katBeauty = new Kategori("KATAB00009", "Beauty");
        arrayKategori.add(katBeauty);

        SubKategori sktSatu = new SubKategori(katPakaian.getIdKategori(), katPakaian.getKategori(), "SKTJK00002",
                "Atasan");
        arraySubKategori.add(sktSatu);
        SubKategori sktDua = new SubKategori(katPakaian.getIdKategori(), katPakaian.getKategori(), "SKTJK00004",
                "Celana");
        arraySubKategori.add(sktDua);
        SubKategori sktTiga = new SubKategori(katSepatu.getIdKategori(), katSepatu.getKategori(), "SKTQW00001",
                "Sneakers");
        arraySubKategori.add(sktTiga);
        SubKategori sktEmpat = new SubKategori(katBeauty.getIdKategori(), katBeauty.getKategori(), "SKTAB00005",
                "Nail Care");
        arraySubKategori.add(sktEmpat);

        Produk WhiteB = new Produk("PK0099", "White Blouse", 5000000, "Baju baru yang bagus", sktSatu, 0, new ArrayList<Penjual>());
        arrayProduk.add(WhiteB);
        sktSatu.tambahProduk(WhiteB);
        Produk BlueJ = new Produk("PK0010", "Blue Jeans", 2000000, "Celana bekas namun masih bagus", sktDua, 50, new ArrayList<Penjual>());
        arrayProduk.add(BlueJ);
        sktDua.tambahProduk(BlueJ);
        Produk YellowS = new Produk("PK0018", "Yellow Sun", 6000000, "Sepatu baru yang cocok dipakai untuk hangout", sktTiga, 20, new ArrayList<Penjual>());
        arrayProduk.add(YellowS);
        sktTiga.tambahProduk(YellowS);
        Produk NailP = new Produk("PK0182", "Nail Polish", 300000, "Glossy tahan lama", sktEmpat, 40, new ArrayList<Penjual>());
        arrayProduk.add(NailP);
        sktEmpat.tambahProduk(NailP);

        // pembeli[0] = new Pembeli("Reine", "White Blouse", "Jl. Bumi, No: 21");
        // pembeli[1] = new Pembeli("Moona", "Yellow Sun", "Jl. Bulan, No: 12");
        // pembeli[2] = new Pembeli("Jisoo", "Nail Polish", "Jl. Mars, No: 190");

        Penjual penSatu = new Penjual("P001", "Chris", new ArrayList<Produk>());
        penSatu.getDaftarProduk().add(WhiteB);
        arrayPenjual.add(penSatu);
        Penjual penDua = new Penjual("P002", "Lisa", new ArrayList<Produk>());
        penDua.getDaftarProduk().add(BlueJ);
        arrayPenjual.add(penDua);
        Penjual penTiga = new Penjual("P003", "Axel", new ArrayList<Produk>());
        penTiga.getDaftarProduk().add(YellowS);
        arrayPenjual.add(penTiga);

        transaksi[0] = new Transaksi("TRX001", "Reine", "White Blouse", "2023-06-12", 500000);
        transaksi[1] = new Transaksi("TRX002", "Moana", "Yellow Sun", "2023-06-15", 600000);
        transaksi[2] = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);

    } }
