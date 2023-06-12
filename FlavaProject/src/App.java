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
        Kategori kaos = new Kategori("Pakaian", "Atasan", "Classic Logo Tee", "PUMA");
        Kategori kemeja = new Kategori("Pakaian", "Atasan", "Kemeja Olympia Comfease", "DUST");
        Kategori sepatuHeels = new Kategori("Sepatu", "Heels", "Millie Heels", "Billini");

        MyOrder order1 = new MyOrder("KD01", "John Doe", "baju");
        MyOrder order2 = new MyOrder("KD02", "Jane Smith", "celana");
        MyOrder order3 = new MyOrder("KD03", "John Doe", "sepatu");

        KeranjangBelanja keranjang1 = new KeranjangBelanja("Baju", 100000, "M", "Merah");
        KeranjangBelanja keranjang2 = new KeranjangBelanja("Sepatu", 250000, "42", "Hitam");
        KeranjangBelanja keranjang3 = new KeranjangBelanja("Celana", 150000, "L", "Biru");

        Pembeli pembeli1 = new Pembeli("ayumi", "baju,celana,topi", "jln uph no 21");
        Pembeli pembeli2 = new Pembeli("destha", "celana 2pcs", "jln uph no 12");
        Pembeli pembeli3 = new Pembeli("vanessa", "baju, topi", "jln uph no 190");

        penjual penjual1 = new penjual("chris", "topi", 7);
        penjual penjual2 = new penjual("lisa", "baju", 5);
        penjual penjual3 = new penjual("Michael", "celana", 6);

        RekomendasiFashiondanBeauty rekomendasi1 = new RekomendasiFashiondanBeauty();
        rekomendasi1.setUserID("123456");
        rekomendasi1.setFashionPreferences("Trendy");
        rekomendasi1.setBeautyPreferences("Natural");
        rekomendasi1.setHargaBarang("Terjangkau");
        rekomendasi1.setPromo("Diskon 20%");

        RekomendasiFashiondanBeauty rekomendasi2 = new RekomendasiFashiondanBeauty();
        rekomendasi2.setUserID("789012");
        rekomendasi2.setFashionPreferences("Classic");
        rekomendasi2.setBeautyPreferences("Glamour");
        rekomendasi2.setHargaBarang("Menengah");
        rekomendasi2.setPromo("Gratis Ongkir");

        RekomendasiFashiondanBeauty rekomendasi3 = new RekomendasiFashiondanBeauty();
        rekomendasi3.setUserID("345678");
        rekomendasi3.setFashionPreferences("Streetwear");
        rekomendasi3.setBeautyPreferences("Minimalist");
        rekomendasi3.setHargaBarang("Premium");
        rekomendasi3.setPromo("Buy 1 Get 1");

        System.out.println(rekomendasi1);
        System.out.println(rekomendasi2);
        System.out.println(rekomendasi3);
        
         // Inisialisasi 1
        transaksi transaksi1 = new transaksi("TRX001", "2023-06-12", 500000);
        transaksi1.tampilkanInfo();

        // Inisialisasi 2
        transaksi transaksi2 = new transaksi("TRX002", "2023-06-15", 750000);
        transaksi2.tampilkanInfo();

        // Inisialisasi 3
        transaksi transaksi3 = new transaksi("TRX003", "2023-06-20", 1000000);
        transaksi3.tampilkanInfo();
    }
}

