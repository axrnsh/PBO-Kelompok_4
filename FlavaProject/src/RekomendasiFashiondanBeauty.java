import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RekomendasiFashiondanBeauty{
    private String userID;
    private String fashionPreferences;
    private String BeautyPreferences;
    private String HargaBarang;
    private String Promo;


    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFashionPreferences() {
        return this.fashionPreferences;
    }

    public void setFashionPreferences(String fashionPreferences) {
        this.fashionPreferences = fashionPreferences;
    }

    public String getBeautyPreferences() {
        return this.BeautyPreferences;
    }

    public void setBeautyPreferences(String BeautyPreferences) {
        this.BeautyPreferences = BeautyPreferences;
    }

    public String getHargaBarang() {
        return this.HargaBarang;
    }

    public void setHargaBarang(String HargaBarang) {
        this.HargaBarang = HargaBarang;
    }

    public String getPromo() {
        return this.Promo;
    }

    public void setPromo(String Promo) {
        this.Promo = Promo;
    }


    public RekomendasiFashiondanBeauty(){
        this.userID = "";
        this.fashionPreferences = "";
        this.BeautyPreferences = "";
        this.HargaBarang = "";
        this.Promo = "";

    }
         public RekomendasiFashiondanBeauty(String userID, String fashionPreferences, String BeautyPreferences, String HargaBarang, String Promo) {
        this.userID = userID;
        this.fashionPreferences = fashionPreferences;
        this.BeautyPreferences = BeautyPreferences;
        this.HargaBarang = HargaBarang;
        this.Promo = Promo;
    }

    public RekomendasiFashiondanBeauty userID(String userID) {
        setUserID(userID);
        return this;
    }

    public RekomendasiFashiondanBeauty fashionPreferences(String fashionPreferences) {
        setFashionPreferences(fashionPreferences);
        return this;
    }

    public RekomendasiFashiondanBeauty BeautyPreferences(String BeautyPreferences) {
        setBeautyPreferences(BeautyPreferences);
        return this;
    }

    public RekomendasiFashiondanBeauty HargaBarang(String HargaBarang) {
        setHargaBarang(HargaBarang);
        return this;
    }

    public RekomendasiFashiondanBeauty Promo(String Promo) {
        setPromo(Promo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RekomendasiFashiondanBeauty)) {
            return false;
        }
        RekomendasiFashiondanBeauty rekomendasiFashiondanBeauty = (RekomendasiFashiondanBeauty) o;
        return Objects.equals(userID, rekomendasiFashiondanBeauty.userID) && Objects.equals(fashionPreferences, rekomendasiFashiondanBeauty.fashionPreferences) && Objects.equals(BeautyPreferences, rekomendasiFashiondanBeauty.BeautyPreferences) && Objects.equals(HargaBarang, rekomendasiFashiondanBeauty.HargaBarang) && Objects.equals(Promo, rekomendasiFashiondanBeauty.Promo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, fashionPreferences, BeautyPreferences, HargaBarang, Promo);
    }

    @Override
    public String toString() {
        return "{" +
            " userID='" + getUserID() + "'" +
            ", fashionPreferences='" + getFashionPreferences() + "'" +
            ", BeautyPreferences='" + getBeautyPreferences() + "'" +
            ", HargaBarang='" + getHargaBarang() + "'" +
            ", Promo='" + getPromo() + "'" +
            "}";
    }
    
        public static void main(String[] args) {
            RekomendasiFashiondanBeauty rekomendasi1 = new RekomendasiFashiondanBeauty();
            rekomendasi1.setUserID("123456");
            rekomendasi1.setFashionPreferences("Trendy");
            rekomendasi1.setBeautyPreferences("Natural");
            rekomendasi1.setHargaBarang("Terjangkau");
            rekomendasi1.setPromo("Diskon 20%");
    
            RekomendasiFashiondanBeauty rekomendasi2 = new RekomendasiFashiondanBeauty();
            rekomendasi2.setUserID("789012");
            rekomendasi2.setFashionPreferences("Classic");
            rekomendasi2.setBeautyPreferences("Glamour");
            rekomendasi2.setHargaBarang("Menengah");
            rekomendasi2.setPromo("Gratis Ongkir");
    
            RekomendasiFashiondanBeauty rekomendasi3 = new RekomendasiFashiondanBeauty();
            rekomendasi3.setUserID("345678");
            rekomendasi3.setFashionPreferences("Streetwear");
            rekomendasi3.setBeautyPreferences("Minimalist");
            rekomendasi3.setHargaBarang("Premium");
            rekomendasi3.setPromo("Buy 1 Get 1");
    
            System.out.println(rekomendasi1);
            System.out.println(rekomendasi2);
            System.out.println(rekomendasi3);
        }
    }

    

    


    


