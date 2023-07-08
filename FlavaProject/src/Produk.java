/* Angela
 * class ini berfungsi untuk menyimpan informasi pada produk
 */

 public class Produk {
    private String idProduk;
    private String namaProduk;
    private int hargaProduk;
    private String deskripsiProduk;
    private Penjual penjual;
    private SubKategori subKategori;
    private int stokProduk;

    public Produk() {
    }

    public Produk(String idProduk, String namaProduk, int hargaProduk, String deskripsiProduk, Penjual penjual,
                  SubKategori subKategori, int stokProduk) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.penjual = penjual;
        this.subKategori = subKategori;
        this.stokProduk = stokProduk;
    }

    public Produk(String idProduk2, String namaProduk2, int hargaProduk2, String descProduk, Penjual[] penjual2,
            int stokProduk2) {
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public String getDeskripsiProduk() {
        return deskripsiProduk;
    }

    public void setDeskripsiProduk(String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }

    public Penjual getPenjual() {
        return penjual;
    }

    public void setPenjual(Penjual penjual) {
        this.penjual = penjual;
    }

    public SubKategori getSubKategori() {
        return subKategori;
    }

    public void setSubKategori(SubKategori subKategori) {
        this.subKategori = subKategori;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-14f | %-20s | %-16s | %-15s | %-15s |", 
            idProduk, namaProduk, hargaProduk, deskripsiProduk, penjual.getNamaPenjual(), subKategori.getSubKategori(), stokProduk);
    }
}

