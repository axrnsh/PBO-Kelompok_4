import java.util.ArrayList;
import java.util.Objects;

public class KeranjangBelanja {
    private String nama;
    private double harga;
    private String ukuran;
    private String warna;
    private ArrayList<KeranjangBelanja> items;

    public KeranjangBelanja(String nama, double harga, String ukuran, String warna) {
        this.nama = nama;
        this.harga = harga;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    // getter setter atribut item fashion
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        return "KeranjangBelanja{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                ", ukuran='" + ukuran + '\'' +
                ", warna='" + warna + '\'' +
                ", items=" + items +
                '}';
    }

    public static void main(String[] args) {
        KeranjangBelanja keranjang1 = new KeranjangBelanja("Baju", 100000, "M", "Merah");
        KeranjangBelanja keranjang2 = new KeranjangBelanja("Sepatu", 250000, "42", "Hitam");
        KeranjangBelanja keranjang3 = new KeranjangBelanja("Celana", 150000, "L", "Biru");

        System.out.println(keranjang1);
        System.out.println(keranjang2);
        System.out.println(keranjang3);
    }

    // class KeranjangBelanjaFashion untuk mempresentasikan keranjang belanja
    // fashion pengguna
    class KeranjangBelanjaFashion {
        private ArrayList<KeranjangBelanja> items;

        public KeranjangBelanjaFashion() {
            items = new ArrayList<>();
        }

        // menambahkan item ke dalam keranjang
        public void tambahItem(KeranjangBelanja item) {
            items.add(item);
        }

        // menghapus item dari keranjang
        public void hapusItem(KeranjangBelanja item) {
            items.remove(item);
        }

        // menghitung total harga semua item
        public double getTotalHarga() {
            double TotalHarga = 0;
            for (KeranjangBelanja item : items) {
                TotalHarga += item.getHarga();
            }
            return TotalHarga;
        }
    }

    public ArrayList<KeranjangBelanja> getItems() {
        return items;
    }
}
