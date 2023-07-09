public class UserPembeli extends User implements Menu {

    @Override
    public void showMenu() {
        System.out.println("\nMenu:");
        System.out.println(" 1. Tampilkan kategori");
        System.out.println(" 2. Tampilkan produk");
        System.out.println(" 3. Input transaksi");
        System.out.println(" 4. Tampilkan transaksi");
        System.out.println(" 0. Logout");
    }
}