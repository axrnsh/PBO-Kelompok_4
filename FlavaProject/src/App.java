import java.util.Scanner;

public class App {
    static Kategori kategori[] = new Kategori[4];
    static Produk produk[] = new Produk[4];
    static Pembeli pembeli[] = new Pembeli[3];
    static Penjual penjual[] = new Penjual[3];
    static Transaksi transaksi[] = new Transaksi[3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        init();
        boolean selesai = false;

        do {
            System.out.println("\nSelamat datang di Flava!");
            System.out.println("Menu: ");
            System.out.println(" 1. Input kategori baru");
            System.out.println(" 2. Input produk baru");
            System.out.println(" 3. Input penjual ");
            System.out.println(" 4. Input pembeli");
            System.out.println(" 5. Input transaksi");
            System.out.println(" 6. Tampilkan kategori");
            System.out.println(" 7. Tampilkan produk");
            System.out.println(" 8. Tampilkan penjual");
            System.out.println(" 9. Tampilkan pembeli");
            System.out.println("10. Tampilkan transaksi");
            System.out.println("11. Keluar");
            System.out.print("\nPilihan: ");

            String pilihan;
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    inputKategori();
                    break;
                case "2":
                    inputProduk();
                    break;
                case "3":
                    inputPenjual();
                    break;
                case "4":
                    inputPembeli();
                    break;
                case "5":
                    inputTransaksi();
                    break;
                case "6":
                    outputKategori();
                    break;
                case "7":
                    outputProduk();
                    break;
                case "8":
                    outputPenjual();
                    break;
                case "9":
                    outputPembeli();
                    break;
                case "10":
                    outputTransaksi();
                    break;
                case "11":
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
        System.out.println("Input data berikut");
        System.out.print("Kategori produk \t: ");
        String kat = scanner.nextLine();
        System.out.print("Sub kategori produk \t: ");
        String subKat = scanner.nextLine();
        System.out.print("Produk \t\t\t: ");
        String produkBarang = scanner.nextLine();

        Kategori kategoriBaru = new Kategori(kat, subKat, produkBarang);
        for (int i = 0; i < kategori.length; i++) {
            if (kategori[i] == null) {
                kategori[i] = kategoriBaru;
                break;
            } else if (i == kategori.length - 1) {
                int lengthPlus = kategori.length + 1;
                Kategori[] temp = new Kategori[lengthPlus];
                for (int j = 0; j < kategori.length; j++) {
                    temp[j] = kategori[j];
                }
                temp[i + 1] = kategoriBaru;
                kategori = temp;
                break;
            }
        }
    }

    public static void inputProduk() {
        System.out.println("Input data berikut");
        System.out.print("Nama produk \t\t: ");
        String namaProduk = scanner.nextLine();
        System.out.print("Harga produk \t\t: ");
        Double hargaProduk = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Deskripsi produk \t: ");
        String descProduk = scanner.nextLine();
        System.out.print("Nama penjual \t\t: ");
        String namaPenjual = scanner.nextLine();
        System.out.print("Kategori produk \t: ");
        String katProduk = scanner.nextLine();

        Produk produkBaru = new Produk(namaProduk, hargaProduk, descProduk, namaPenjual, katProduk);
        for (int i = 0; i < produk.length; i++) {
            if (produk[i] == null) {
                produk[i] = produkBaru;
                break;
            } else if (i == produk.length - 1) {
                int lengthPlus = produk.length + 1;
                Produk[] temp = new Produk[lengthPlus];
                for (int j = 0; j < produk.length; j++) {
                    temp[j] = produk[j];
                }
                temp[i + 1] = produkBaru;
                produk = temp;
                break;
            }
        }
    }

    public static void inputPenjual() {
        System.out.println("Input data berikut");
        System.out.print("Nama penjual \t: ");
        String namaPenjual = scanner.nextLine();
        System.out.print("Produk \t\t: ");
        String produkPenjual = scanner.nextLine();
        System.out.print("Rating penjual \t: ");
        double ratePenjual = scanner.nextDouble();
        scanner.nextLine();

        Penjual penjualBaru = new Penjual(namaPenjual, produkPenjual, ratePenjual);
        for (int i = 0; i < penjual.length; i++) {
            if (penjual[i] == null) {
                penjual[i] = penjualBaru;
                break;
            } else if (i == penjual.length - 1) {
                int lengthPlus = penjual.length + 1;
                Penjual[] temp = new Penjual[lengthPlus];
                for (int j = 0; j < penjual.length; j++) {
                    temp[j] = penjual[j];
                }
                temp[i + 1] = penjualBaru;
                penjual = temp;
                break;
            }
        }
    }

    public static void inputPembeli() {
        System.out.println("Input data berikut");
        System.out.print("Nama pembeli \t: ");
        String namaPembeli = scanner.nextLine();
        System.out.print("Transaksi \t: ");
        String daftarTransaksi = scanner.nextLine();
        System.out.print("Alamat pembeli \t: ");
        String alamatPembeli = scanner.nextLine();

        Pembeli pembeliBaru = new Pembeli(namaPembeli, daftarTransaksi, alamatPembeli);
        for (int i = 0; i < pembeli.length; i++) {
            if (pembeli[i] == null) {
                pembeli[i] = pembeliBaru;
                break;
            } else if (i == pembeli.length - 1) {
                int lengthPlus = pembeli.length + 1;
                Pembeli[] temp = new Pembeli[lengthPlus];
                for (int j = 0; j < pembeli.length; j++) {
                    temp[j] = pembeli[j];
                }
                temp[i + 1] = pembeliBaru;
                pembeli = temp;
                break;
            }
        }
    }

    public static void inputTransaksi() {
        System.out.println("Input data berikut");
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

        Transaksi transaksiBaru = new Transaksi(idTransaksi, pembeliTransaksi, produkTransaksi, tanggal,
                totalTransaksi);
        for (int i = 0; i < transaksi.length; i++) {
            if (transaksi[i] == null) {
                transaksi[i] = transaksiBaru;
                break;
            } else if (i == transaksi.length - 1) {
                int lengthPlus = transaksi.length + 1;
                Transaksi[] temp = new Transaksi[lengthPlus];
                for (int j = 0; j < transaksi.length; j++) {
                    temp[j] = transaksi[j];
                }
                temp[i + 1] = transaksiBaru;
                transaksi = temp;
                break;
            }
        }
    }

    public static void outputKategori() {
        System.out.println("| KATEGORI PRODUK | SUB KATEGORI PRODUK |      PRODUK      |");
        System.out.println("------------------------------------------------------------");
        for (Kategori kategori : kategori) {
            if (kategori != null) {
                System.out.println(kategori);
            }
        }
    }

    public static void outputProduk() {
        System.out.println("|   NAMA PRODUK   |  HARGA PRODUK  |   DESKRIPSI PRODUK   |   NAMA PENJUAL   | KATEGORI PRODUK |");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (Produk produk : produk) {
            if (produk != null) {
                System.out.println(produk);
            }
        }
    }

    public static void outputPenjual() {
        System.out.println("|   NAMA PENJUAL   |      PRODUK      | RATING PENJUAL |");
        System.out.println("--------------------------------------------------------");
        for (Penjual penjual : penjual) {
            if (penjual != null) {
                System.out.println(penjual);
            }
        }
    }

    public static void outputPembeli() {
        System.out.println("|   NAMA PEMBELI   | DAFTAR TRANSAKSI |      ALAMAT PEMBELI     |");
        System.out.println("-----------------------------------------------------------------");
        for (Pembeli pembeli : pembeli) {
            if (pembeli != null) {
                System.out.println(pembeli);
            }
        }
    }

    public static void outputTransaksi() {
        System.out.println("|  ID TRANSAKSI  |   NAMA PEMBELI   |      PRODUK      |   TANGGAL   |       TOTAL       |");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Transaksi transaksi : transaksi) {
            if (transaksi != null) {
                System.out.println(transaksi);
            }
        }
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

        pembeli[0] = new Pembeli("Reine", "White Blouse", "Jl. Bumi, No: 21");
        pembeli[1] = new Pembeli("Moona", "Yellow Sun", "Jl. Bulan, No: 12");
        pembeli[2] = new Pembeli("Jisoo", "Nail Polish", "Jl. Mars, No: 190");

        penjual[0] = new Penjual("Chris", "White Blouse", 4);
        penjual[1] = new Penjual("Lisa", "Blue Jeans", 5);
        penjual[2] = new Penjual("Axel", "Yellow Sun", 5);

        transaksi[0] = new Transaksi("TRX001", "Reine", "White Blouse", "2023-06-12", 500000);
        transaksi[1] = new Transaksi("TRX002", "Moana", "Yellow Sun", "2023-06-15", 600000);
        transaksi[2] = new Transaksi("TRX003", "Jisoo", "Nail Polish", "2023-06-20", 150000);
    }
}