public abstract class User {
    private String posisi;
    private String nama;

    public User() {
    }

    public User(String posisi, String nama) {
        this.posisi = posisi;
        this.nama = nama;
    }

    public String getPosisi() {
        return this.posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "{" +
            " posisi='" + getPosisi() + "'" +
            ", nama='" + getNama() + "'" +
            "}";
    }

}
