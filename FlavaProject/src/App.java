import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // tolong banget kalau mau edit kerapiannya dijaga
    static Pembeli pembeli[] = new Pembeli[3];

    public static ArrayList<Kategori> arrayKategori = new ArrayList<Kategori>();
    public static ArrayList<SubKategori> arraySubKategori = new ArrayList<SubKategori>();
    public static ArrayList<Penjual> arrayPenjual = new ArrayList<Penjual>();
    public static ArrayList<Pembeli> arrayPembeli = new ArrayList<Pembeli>();
    public static ArrayList<Produk> arrayProduk = new ArrayList<Produk>();
    public static ArrayList<Transaksi> arrayTransaksi = new ArrayList<Transaksi>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        clearScreen();
        init();
        boolean loggedIn = false;
        boolean selesai = false;

        do {
            System.out.println("Selamat datang di Flava!");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("\nPilihan: ");

            String pilih;
            pilih = scanner.nextLine();

            switch (pilih) {
                case "1":
                    if (!loggedIn) {
                        clearScreen();
                        System.out.print("Username: ");
                        String username = scanner.nextLine();
                        System.out.print("Password: ");
                        String password = scanner.nextLine();
                        clearScreen();

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
                                            editKat();
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
                                            editDataPembeli();
                                            break;
                                        case "16":
                                            hapusDataPembeli();
                                            break;
                                        case "17":
                                            inputTransaksi();
                                            break;
                                        case "18":
                                            outputTransaksi();
                                            break;
                                        case "19":
                                            editTransaksi();
                                            break;
                                        case "20":
                                            hapusDataTransaksi();
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

                                else if (role.equals("penjual")) {
                                    UserPenjual penjualLogin = new UserPenjual();
                                    penjualLogin.showMenu();
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
                                            editKat();
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
                                            outputTransaksi();
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

                                else if (role.equals("pembeli")) {
                                    UserPembeli pembeliLogin = new UserPembeli();
                                    pembeliLogin.showMenu();
                                    System.out.print("\nPilihan: ");

                                    String pilihanLagi;
                                    pilihanLagi = scanner.nextLine();

                                    switch (pilihanLagi) {
                                        case "1":
                                            outputKategori();
                                            break;
                                        case "2":
                                            outputProduk();
                                            break;
                                        case "3":
                                            inputTransaksi();
                                            break;
                                        case "4":
                                            outputTransaksi();
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

                                else {
                                    System.out.println("Posisi tidak valid");
                                    loggedIn = false;
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
        clearScreen();
        System.out.println("Input data berikut!");
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

        clearScreen();
        System.out.println("Input berhasil!");
    }

    public static void outputKategori() {
        clearScreen();
        System.out.println(
                "| ID KATEGORI | KATEGORI PRODUK | ID SUB KATE | SUB KATEGORI PRODUK |        PRODUK        |");
        System.out.println(
                "--------------------------------------------------------------------------------------------");
        for (SubKategori subkategori : arraySubKategori) {
            System.out.println(subkategori.toString());
        }
    }

    public static void editKat() {
        clearScreen();
        IKategori newKategori = new IKategori();
        newKategori.showMenu();
        System.out.print("\nPilihan: ");

        String pilihlah;
        pilihlah = scanner.nextLine();

        switch (pilihlah) {
            case "1":
                editKategori();
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

    public static void editKategori() {
        outputKategori();
        System.out.print("\nMasukkan ID Kategori yang akan diedit: ");
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

    public static void deleteKategori() {
        outputKategori();
        System.out.println("Warning: Menghapus kategori akan menghapus sub kategori di dalamnya juga\n");
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
        System.out.print("ID Produk  \t: ");
        String idProduk = scanner.nextLine();
        System.out.print("Nama produk  \t: ");
        String namaProduk = scanner.nextLine();
        System.out.print("Harga produk  \t: ");
        int hargaProduk = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Deskripsi produk : ");
        String descProduk = scanner.nextLine();
        System.out.print("Stok produk  \t: ");
        int stokProduk = scanner.nextInt();
        scanner.nextLine();
    
        // Prompt for sub kategori
        System.out.print("ID Sub Kategori \t: ");
        String idSubKategori = scanner.nextLine();
        SubKategori subKategori = cariSubKategori(idSubKategori);
        if (subKategori == null) {
            System.out.println("Sub kategori dengan ID tersebut tidak ditemukan!");
            return;
        }
    
        System.out.print("ID Penjual \t: ");
        String idPenjual = scanner.nextLine();
        Penjual penjual = cariPenjual(idPenjual);
        if (penjual == null) {
            System.out.println("Penjual dengan ID tersebut tidak ditemukan!");
            return;
        }
    
        arrayProduk.add(new Produk(idProduk, namaProduk, hargaProduk, descProduk, subKategori, stokProduk, penjual));
    }
    
    public static SubKategori cariSubKategori(String idSubKategori) {
        for (SubKategori subKategori : arraySubKategori) {
            if (subKategori.getIdSubKategori().equals(idSubKategori)) {
                return subKategori;
            }
        }
        return null;
    }
    
    public static Penjual cariPenjual(String idPenjual) {
        for (Penjual penjual : arrayPenjual) {
            if (penjual.getIdPenjual().equals(idPenjual)) {
                return penjual;
            }
        }
        return null;
    }

    public static void outputProduk() {
        System.out.println(
                "| ID PRODUK |  NAMA PRODUK  | HARGA PRODUK |     DESKRIPSI PRODUK     | SUBKATEGORI PRODUK | STOK PRODUK |      PENJUAL      |");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");

        for (Produk produkOutput : arrayProduk) {
            System.out.print(produkOutput);
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
            System.out.print("Stok produk : ");
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
            arrayProduk.remove(targetProduk);
            System.out.println("Produk berhasil dihapus!");
        } else {
            System.out.println("Produk tidak ditemukan!");
        }
    }

    public static void inputPenjual() {
        System.out.println("\nSilakan input data berikut!");
        System.out.print("ID Penjual \t: ");
        String idPenjual = scanner.nextLine();
        System.out.print("Nama Penjual \t: ");
        String namaPenjual = scanner.nextLine();

        ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
        while (true) {
            System.out.print("Produk \t\t: ");
            String produk = scanner.nextLine();
            if (produk.isEmpty()) {
                break;
            }
            daftarProduk.add(cariProduk(produk));
            System.out.println("(Tekan ENTER untuk mengakhiri)\n");
        }
        arrayPenjual.add(new Penjual(idPenjual, namaPenjual, daftarProduk));
    }

    public static void outputPenjual() {
        System.out.println("\n| ID PENJUAL | NAMA PENJUAL |      PRODUK      |");
        System.out.println("------------------------------------------------");
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
            System.out.println("\nData penjual berhasil diubah!");
        } else {
            System.out.println("\nPenjual tidak ditemukan!");
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

    public static void inputPembeli() {
        System.out.println("\nInput data berikut!");
        System.out.println("Masukkan ID Pembeli \t: ");
        String idPembeli = scanner.nextLine();
        System.out.print("Nama pembeli \t: ");
        String namaPembeli = scanner.nextLine();
        System.out.print("Transaksi \t: ");
        String daftarTransaksi = scanner.nextLine();
        System.out.print("Alamat pembeli \t: ");
        String alamatPembeli = scanner.nextLine();

        // arrayPembeli.add(new Pembeli(idPembeli, namaPembeli, daftarTransaksi,
        // alamatPembeli));
    }

        public static void outputPembeli() {
        System.out.println("|   ID Pembeli   |   NAMA PEMBELI   |   PRODUK DIBELI   |      ALAMAT PEMBELI     |");
        System.out.println("-----------------------------------------------------------------------------------");
        for (Pembeli pembeli : arrayPembeli) {
            System.out.println(pembeli.toString());
            }
        }

    public static void editDataPembeli() {
        outputPembeli();
        System.out.print("\nMasukkan ID Pembeli yang akan diedit: ");
        String idPembeli = scanner.nextLine();

        Pembeli targetPembeli = null;
        for (Pembeli pembeli : arrayPembeli) {
            if (pembeli.getIdPembeli().equals(idPembeli)) {
                targetPembeli = pembeli;
                break;
            }
        }

        if (targetPembeli != null) {
            System.out.println("\nEdit data pembeli:");
            System.out.print("Nama pembeli baru \t: ");
            String newNamaPembeli = scanner.nextLine();
            System.out.print("Produk dibeli baru \t: ");
            String newDaftarTransaksi = scanner.nextLine();
            System.out.print("Alamat pembeli baru \t: ");
            String newAlamatPembeli = scanner.nextLine();

            targetPembeli.setNamaPembeli(newNamaPembeli);
            // targetPembeli.setDaftarTransaksi(newDaftarTransaksi);
            targetPembeli.setAlamatPembeli(newAlamatPembeli);

            System.out.println("Data pembeli berhasil diubah!");
        } else {
            System.out.println("Pembeli tidak ditemukan!");
        }
            }

    public static void hapusDataPembeli() {
        outputPembeli();
        System.out.print("\nMasukkan ID Pembeli yang akan dihapus: ");
        String idPembeli = scanner.nextLine();

        Pembeli targetPembeli = null;
        for (Pembeli pembeli : arrayPembeli) {
            if (pembeli.getIdPembeli().equals(idPembeli)) {
                targetPembeli = pembeli;
                break;
            }
        }

        if (targetPembeli != null) {
            arrayPembeli.remove(targetPembeli);
            System.out.println("Data pembeli berhasil dihapus!");
        } else {
            System.out.println("Pembeli tidak ditemukan!");
        }
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
        int totalTransaksi = scanner.nextInt();
        scanner.nextLine();

        arrayTransaksi.add(new Transaksi(idTransaksi, pembeliTransaksi, produkTransaksi, tanggal, totalTransaksi));
    }

    public static void outputTransaksi() {
        System.out
                .println("|  ID TRANSAKSI  |   NAMA PEMBELI   |      PRODUK      |   TANGGAL   |       TOTAL       |");
        System.out
                .println("------------------------------------------------------------------------------------------");
        for (Transaksi transaksi : arrayTransaksi) {
            System.out.println(transaksi.toString());
        }
    }

    public static void editTransaksi() {
        outputTransaksi();
        System.out.print("\nMasukkan ID Transaksi yang akan diedit: ");
        String idTransaksi = scanner.nextLine();

        Transaksi targetTransaksi = null;
        for (Transaksi transaksi : arrayTransaksi) {
            if (transaksi.getIdTransaksi().equals(idTransaksi)) {
                targetTransaksi = transaksi;
                break;
            }
        }

        if (targetTransaksi != null) {
            System.out.println("\nEdit data transaksi:");
            System.out.print("Nama pembeli produk \t: ");
            String namaPembeliProduk = scanner.nextLine();
            System.out.print("Nama produk \t\t: ");
            String namaProduk = scanner.nextLine();
            System.out.print("Tanggal \t\t: ");
            String tanggal = scanner.nextLine();
            System.out.print("Harga \t\t\t: ");
            int harga = scanner.nextInt();
            scanner.nextLine();

            targetTransaksi.setNamaPembeliProduk(namaPembeliProduk);
            targetTransaksi.setNamaProduk(namaProduk);
            targetTransaksi.setTanggal(tanggal);
            targetTransaksi.setHarga(harga);

            System.out.println("Transaksi berhasil diubah!");
        } else {
            System.out.println("Transaksi tidak ditemukan!");
        }
    }

    public static void hapusDataTransaksi() {
        outputTransaksi();
        System.out.print("\nMasukkan ID Transaksi yang akan dihapus: ");
        String idTransaksi = scanner.nextLine();

        Transaksi targetTransaksi = null;
        for (Transaksi transaksi : arrayTransaksi) {
            if (transaksi.getIdTransaksi().equals(idTransaksi)) {
                targetTransaksi = transaksi;
                break;
            }
        }

        if (targetTransaksi != null) {
            arrayTransaksi.remove(targetTransaksi);
            System.out.println("Data Transaksi berhasil dihapus!");
        } else {
            System.out.println("Transaksi tidak ditemukan!");
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\u001b[2J\u001b[H");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Gagal melakukan clear screen: " + e.getMessage());
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
    
        Penjual penSatu = new Penjual("P001", "Chris", new ArrayList<Produk>());
        arrayPenjual.add(penSatu);
        Penjual penDua = new Penjual("P002", "Lisa", new ArrayList<Produk>());
        arrayPenjual.add(penDua);
        Penjual penTiga = new Penjual("P003", "Axel", new ArrayList<Produk>());
        arrayPenjual.add(penTiga);
        Penjual penEmpat = new Penjual("P004", "Jeno", new ArrayList<Produk>());
        arrayPenjual.add(penEmpat);
    
        Produk WhiteB = new Produk("PK0099", "White Blouse", 5000000, "Baju baru yang bagus", sktSatu, 10, penSatu);
        arrayProduk.add(WhiteB);
        sktSatu.tambahProduk(WhiteB);
        penSatu.getDaftarProduk().add(WhiteB);
        Produk BlueJ = new Produk("PK0010", "Blue Jeans", 2000000, "Celana bekas namun bagus", sktDua, 50, penDua);
        arrayProduk.add(BlueJ);
        sktDua.tambahProduk(BlueJ);
        penDua.getDaftarProduk().add(BlueJ);   
        Produk YellowS = new Produk("PK0018", "Yellow Sun", 6000000, "Sepatu baru untuk kampus", sktTiga, 20, penTiga);
        arrayProduk.add(YellowS);
        sktTiga.tambahProduk(YellowS);
        penTiga.getDaftarProduk().add(YellowS);   
        Produk NailP = new Produk("PK0182", "Nail Polish", 300000, "Glossy tahan lama", sktEmpat, 40, penEmpat);
        arrayProduk.add(NailP);
        sktEmpat.tambahProduk(NailP);
        penEmpat.getDaftarProduk().add(NailP);
    
        // pembeli[0] = new Pembeli("Reine", "White Blouse", "Jl. Bumi, No: 21");
        // pembeli[1] = new Pembeli("Moona", "Yellow Sun", "Jl. Bulan, No: 12");
        // pembeli[2] = new Pembeli("Jisoo", "Nail Polish", "Jl. Mars, No: 190");

        Transaksi tranSatu = new Transaksi("TRX001", "Reine", "White Blouse", "2023-06-12", 500000);
        arrayTransaksi.add(tranSatu);
        Transaksi tranDua = new Transaksi("TRX002", "Moana", "Yellow Sun", "2023-06-15", 600000);
        arrayTransaksi.add(tranDua);
        Transaksi tranTiga = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);
        arrayTransaksi.add(tranTiga);

       
            }
        }
    

