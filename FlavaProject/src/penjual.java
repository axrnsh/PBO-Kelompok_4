public class penjual {

    private String namaPenjual;
    private String DaftarProduk;

    public penjual() {
    }

    public penjual(String namaPenjual, String daftarProduk) {
        this.namaPenjual = namaPenjual;
        this.DaftarProduk = daftarProduk;
    }

    public String getNamaPenjual() {
        return this.namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getDaftarProduk() {
        return this.DaftarProduk;
    }

    public void setDaftarProduk(String DaftarProduk) {
        this.DaftarProduk = DaftarProduk;
    }

    @Override
    public String toString() {
        return "{" +
                " namaPenjual='" + getNamaPenjual() + "'" +
                ", DaftarProduk='" + getDaftarProduk() + "'" +
                "}";
    }

}
