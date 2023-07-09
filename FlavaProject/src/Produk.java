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
    sb.append("| ").append(String.format("%-10s", idProduk)).append(" | ")
            .append(String.format("%-12s", namaProduk)).append(" | ")
            .append(String.format("%-12s", hargaProduk)).append(" | ")
            .append(String.format("%-12s", deskripsiProduk)).append(" | ")
            .append(String.format("%-12s", subKategori)).append(" | ")
            .append(String.format("%-12s", stokProduk)).append(" | ");


    if (daftarPenjual.isEmpty()) {
        sb.append(String.format("%-17s", "<Tidak ada nama penjual>"));
    } else {
        for (Penjual penjual : daftarPenjual) {
            if (penjual != null) {
                sb.append(String.format("%-17s", penjual.getNamaPenjual()));
            }
        }
    }
    sb.append("|");
    return sb.toString();
}

}