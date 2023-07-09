/* Angela
 * class ini berfungsi untuk menyimpan informasi pada produk
 */

import java.util.ArrayList;

public class Produk {
    private String idProduk;
    private String namaProduk;
    private int hargaProduk;
    private String deskripsiProduk;
    private SubKategori subKategori;
    private int stokProduk;
    private ArrayList<Penjual> daftarPenjual;

    public Produk(String idProduk, String namaProduk, int hargaProduk, String deskripsiProduk,
            SubKategori subKategori, int stokProduk, ArrayList<Penjual> daftarPenjual) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
        this.subKategori = subKategori;
        this.stokProduk = stokProduk;
        this.daftarPenjual = daftarPenjual != null ? daftarPenjual : new ArrayList<>();
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

    public ArrayList<Penjual> getDaftarPenjual() {
        return this.daftarPenjual;
    }

    public void setDaftarPenjual (ArrayList<Penjual> daftarPenjual) {
        this.daftarPenjual = daftarPenjual;
    }
   
    public Produk() {
        daftarPenjual = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(String.format("%-9s", idProduk)).append(" | ")
                .append(String.format("%-13s", namaProduk)).append(" | ")
                .append(String.format("%,12d", hargaProduk)).append(" | ")
                .append(String.format("%-24s", deskripsiProduk)).append(" | ")
                .append(String.format("%-18s", subKategori.getSubKategori())).append(" | ")
                .append(String.format("%-11s", stokProduk)).append(" | ");
    
        if (daftarPenjual.isEmpty()) {
            sb.append(String.format("%-24s", "<Tidak ada nama penjual>"));
        } else {
            sb.append(String.format("%-24s", daftarPenjual.get(0).getNamaPenjual()));
        }
    
        sb.append("|\n");
        return sb.toString();
    }
}