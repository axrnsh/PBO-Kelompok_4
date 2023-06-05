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
        SearchFilter celana = new SearchFilter();
        SearchFilter dress = new SearchFilter("White dress", "Pakaian", 150000);
        SearchFilter sepatu = new SearchFilter("Sneakers", "Sepatu", 99000);
        SearchFilter atasan = new SearchFilter("Kemeja", "Pakaian", 120000);

<<<<<<< Updated upstream
        KeranjangBelanja keranjang1 = new KeranjangBelanja("Baju", 100000, "M", "Merah");
        KeranjangBelanja keranjang2 = new KeranjangBelanja("Sepatu", 250000, "42", "Hitam");
        KeranjangBelanja keranjang3 = new KeranjangBelanja("Celana", 150000, "L", "Biru");
=======
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
>>>>>>> Stashed changes
    }
}

