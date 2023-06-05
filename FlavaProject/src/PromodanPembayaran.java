import java.util.Scanner;

public class PromodanPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total harga
        System.out.print("Masukkan total harga: ");
        double totalHarga = input.nextDouble();

        // Input kode promo (jika ada)
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = input.next();

        // Menghitung diskon berdasarkan kode promo
        double diskon = 0;
        if (kodePromo.equalsIgnoreCase("PROMO123")) {
            diskon = 0.2 * totalHarga; // Diskon 20% untuk kode promo PROMO123
        } else if (kodePromo.equalsIgnoreCase("PROMO456")) {
            diskon = 0.1 * totalHarga; // Diskon 10% untuk kode promo PROMO456
        }

        // Menghitung total yang harus dibayar
        double totalBayar = totalHarga - diskon;

        // Menampilkan informasi pembayaran
        System.out.println("Total harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        // Menutup scanner
        input.close();
    }
}
