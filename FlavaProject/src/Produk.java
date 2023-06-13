/* Angela
 * class ini berfungsi untuk menyimpan informasi produk
 */


public class Produk {
    private String namaProduk;
    private double hargaProduk;
    private String deskripsiProduk;

    public Produk () {

    }
    
    public Produk(String namaProduk, double hargaProduk, String deskripsiProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
    }
    
    public String getNamaProduk() {
        return this.namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHargaProduk() {
        return this.hargaProduk;
    }
    
    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
    
    public String getDeskripsiProduk() {
        return deskripsiProduk;
    }
    
    public void setDeskripsiProduk (String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }
    
    @Override
    public String toString() {
        return "Produk: " + namaProduk + "\nHarga: " + hargaProduk + "\nDeskripsi: " + deskripsiProduk;
    }
}
    

