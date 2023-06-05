/* class ini berisikan getter dari fitur pencarian barang dan filter
 * sesuai keinginan user berdasarkan nama, kategori, dan harga produk
*/
class SearchFilter {
    private String namaProduk;
    private String kategoriProduk;
    private double hargaProduk;

    public SearchFilter() {
    }

    public SearchFilter(String namaProduk, String kategoriProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.kategoriProduk = kategoriProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getKategoriProduk() {
        return kategoriProduk;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }


    @Override
    public String toString() {
        return String.format("Nama produk\t: %s \nKategori produk\t: %s \nHarga produk\t: Rp. %d", 
        namaProduk, kategoriProduk, hargaProduk);
    }
}