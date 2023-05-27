import java.util.ArrayList;

public class KeranjangBelanja {
    private String nama;
    private double harga;
    private String ukuran;
    private String warna;

    public KeranjangBelanja(String nama, double harga, String ukuran, String warna) {
        this.nama = nama;
        this.harga = harga;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    // getter setter atribut
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

    class KeranjangBelanjaFashion {
        private ArrayList<KeranjangBelanja> items;

        public KeranjangBelanjaFashion() {
            items = new ArrayList<>();
        }

        public void tambahItem(KeranjangBelanja item) {
            items.add(item);
        }

        public void hapusItem(KeranjangBelanja item) {
            items.remove(item);
        }

        public double getTotalHarga() {
            double TotalHarga = 0;
            for (KeranjangBelanja item : items) {
                TotalHarga += item.getHarga();
            }
            return TotalHarga;
        }
    }

}
