/* Ayumi 
 * class ini berfungsi untuk membagi produk berdasarkan kategori
 * seperti misalnya pakaian, rok, sepatu
 */

public class Kategori {
    private String idKategori;
    private String kategori;

    public Kategori() {
    }

    public Kategori(String idKategori, String kategori) {
        this.idKategori = idKategori;
        this.kategori = kategori;
    }

    public String getIdKategori() {
        return this.idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return String.format("| %-11s | %-15s |", 
        idKategori, kategori);
    }
}