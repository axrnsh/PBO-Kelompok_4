/* Angela
 * class ini berfungsi untuk menyimpan informasi pada produk
 */

public class Produk {
    private String idProduk;
    private String namaProduk;
    private int hargaProduk;
    private String deskripsiProduk;
    private SubKategori subKategori;
    private int stokProduk;
    private Penjual penjual;

    public Produk(String idProduk, String namaProduk, int hargaProduk, String deskripsiProduk,
                  SubKategori subKategori, int stokProduk, Penjual penjual) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.subKategori = subKategori;
        this.stokProduk = stokProduk;
        this.penjual = penjual;
    }

    public Produk(String string) {
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

    public Penjual getPenjual() {
        return penjual;
    }

    public void setPenjual(Penjual penjual) {
        this.penjual = penjual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(String.format("%-9s", idProduk)).append(" | ")
                .append(String.format("%-13s", namaProduk)).append(" | ")
                .append(String.format("%,12d", hargaProduk)).append(" | ")
                .append(String.format("%-24s", deskripsiProduk)).append(" | ");
    
        if (subKategori != null) {
            sb.append(String.format("%-18s", subKategori.getSubKategori())).append(" | ");
        } else {
            sb.append(String.format("%-18s", "<Tidak ada sub kategori>")).append(" | ");
        }
    
        sb.append(String.format("%-11s", stokProduk)).append(" | ");
    
        if (penjual != null) {
            sb.append(String.format("%-24s", penjual.getNamaPenjual()));
        } else {
            sb.append(String.format("%-24s", "<Tidak ada nama penjual>"));
        }
    
        sb.append("|\n");
        return sb.toString();
    }
            }    