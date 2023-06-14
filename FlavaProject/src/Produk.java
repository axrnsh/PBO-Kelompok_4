/* Angela
 * class ini berfungsi untuk menyimpan informasi pada produk
 */

 public class Produk {
    private String namaProduk;
    private double hargaProduk;
    private String deskripsiProduk;
    private String namaPenjual;
    private String kategoriProduk;

    public Produk () {
    }  
    
    public Produk(String namaProduk, double hargaProduk, String deskripsiProduk, String namaPenjual, 
    String kategoriProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.namaPenjual = namaPenjual;
        this.kategoriProduk = kategoriProduk;
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
    
    public String getNamaPenjual() {
        return this.namaPenjual;
    }
    
    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getKategoriProduk() {
        return this.kategoriProduk;
    }
    
    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    @Override
    public String toString() {
        return "Produk: " + namaProduk + "\nHarga: " + hargaProduk + "\nDeskripsi: " + deskripsiProduk + 
        "\nnamaPenjual:" + namaPenjual + "\nkategoriProduk" + kategoriProduk;
    }
}
    

