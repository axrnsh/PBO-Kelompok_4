package FlavaProject;

public class RekomendasiFashiondanBeauty {
    private String jenis;
    private String merek;
    private double harga;

    public RekomendasiFashiondanBeauty(String jenis, String merek, double harga){
        this.jenis = jenis;
        this.merek = merek;
        this.harga = harga;
    }

    public String getJenis(){
        return jenis;
    }

    public String getMerek(){
        return merek;
    }

    public double getHarga(){
        return harga;
    }

    public void tampilkanInfo(){
        System.out.print("Jenis: " + jenis);
        System.out.print("Merek: " + merek);
        System.out.print("Harga: " + harga);

    }
    
}
