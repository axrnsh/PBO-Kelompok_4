public class IKategori extends Kategori implements Menu {

    @Override
    public void showMenu() {
        System.out.println(" 1. Edit Kategori");
        System.out.println(" 2. Masukkan produk ke kategori");
        System.out.println(" 0. Kembali");
    }
}