public class UserAdmin extends User implements Menu {

    @Override
    public void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("Kategori");
        System.out.println(" 1. Input kategori baru");
        System.out.println(" 2. Tampilkan kategori");
        System.out.println(" 3. Edit kategori");
        System.out.println(" 4. Hapus kategori");
        System.out.println("Produk");
        System.out.println(" 5. Input produk baru");
        System.out.println(" 6. Tampilkan produk");
        System.out.println(" 7. Edit produk");
        System.out.println(" 8. Hapus produk");
        System.out.println("Penjual");
        System.out.println(" 9. Input data penjual");
        System.out.println("10. Tampilkan data penjual");
        System.out.println("11. Edit data penjual");
        System.out.println("12. Hapus data penjual");
        System.out.println("Pembeli");
        System.out.println("13. Input data pembeli");
        System.out.println("14. Tampilkan data pembeli");
        System.out.println("15. Edit data pembeli");
        System.out.println("16. Hapus data pembeli");
        System.out.println("Transaksi");
        System.out.println("17. Input transaksi");
        System.out.println("18. Tampilkan transaksi");
        System.out.println("19. Edit transaksi");
        System.out.println("20. Hapus data transaksi");
        System.out.println(" 0. Logout");
    }
}