public class UserPenjual extends User implements Menu {

    @Override
    public void showMenu() {
        System.out.println("\nMenu:");
        System.out.println(" 1. Input kategori baru");
        System.out.println(" 2. Tampilkan kategori");
        System.out.println(" 3. Edit kategori");
        System.out.println(" 4. Hapus kategori");
        System.out.println(" 5. Input produk baru");
        System.out.println(" 6. Tampilkan produk");
        System.out.println(" 7. Edit produk");
        System.out.println(" 8. Hapus produk");
        System.out.println(" 9. Tampilkan transaksi");
        System.out.println(" 0. Logout");
        System.out.print("\nPilihan: ");
    }
}
