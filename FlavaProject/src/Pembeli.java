/* Desthacia
 * class ini berfungsi untuk menyimpan identitas pembeli
 */

import java.util.ArrayList;

public class Pembeli {

    private String idPembeli;
    private String namaPembeli;
    private ArrayList<Transaksi> daftarTransaksi;
    private String alamatPembeli;

    public Pembeli() {
    }

    public Pembeli(String idPembeli, String namaPembeli, ArrayList<Transaksi> daftarTransaksi, String alamatPembeli) {
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.daftarTransaksi = daftarTransaksi;
        this.alamatPembeli = alamatPembeli;
    }

    public String getIdPembeli() {
        return this.idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getNamaPembeli() {
        return this.namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return this.daftarTransaksi;
    }

    public void setDaftarTransaksi(ArrayList<Transaksi> newDaftarTransaksi) {
        this.daftarTransaksi = newDaftarTransaksi;
    }

    public String getAlamatPembeli() {
        return this.alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    @Override
    public String toString() {
        return String.format("| %-16s | %-17s | %-23s |",
                namaPembeli, daftarTransaksi, alamatPembeli);
    }
}