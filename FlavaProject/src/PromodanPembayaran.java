/* class ini berisikan halaman promo
 * dan halaman pembayaran 
 */

public class PromodanPembayaran {
    private String keteranganPromo;
    private int promo;
    private double bayar;

    public PromodanPembayaran(String keteranganPromo, int promo, double bayar) {
        this.keteranganPromo = keteranganPromo;
        this.promo = promo;
        this.bayar = bayar;
    }

    public String getKeteranganPromo() {
        return this.keteranganPromo;
    }

    public int getPromo() {
        return this.promo;
    }

    public double getBayar() {
        return this.bayar;
    }

    public void setKeteranganPromo(String keteranganPromo) {
        this.keteranganPromo = keteranganPromo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }
}
