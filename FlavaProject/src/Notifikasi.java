import javax.swing.JOptionPane;

public class Notifikasi {

    public static void main(String[] args) {
        // Menampilkan notifikasi dengan pesan sederhana
        JOptionPane.showMessageDialog(null, "Ini adalah notifikasi sederhana.");

        // Menampilkan notifikasi dengan pesan dan judul
        JOptionPane.showMessageDialog(null, "Ini adalah notifikasi dengan judul.", "Judul Notifikasi", JOptionPane.INFORMATION_MESSAGE);

        // Menampilkan notifikasi dengan pilihan OK atau Cancel
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin melanjutkan?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilihan == JOptionPane.OK_OPTION) {
            System.out.println("Anda memilih OK");
        } else if (pilihan == JOptionPane.CANCEL_OPTION) {
            System.out.println("Anda memilih Cancel");
        } else if (pilihan == JOptionPane.CLOSED_OPTION) {
            System.out.println("Anda menutup notifikasi");
        }
    }
}