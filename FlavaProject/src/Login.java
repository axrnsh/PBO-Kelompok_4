import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
    public static boolean login(String username, String password) {
        try {
            File file = new File("users.csv");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String usernm = data[0];
                String pass = data[1];
                String nama = data[3];

                if (username.equals(usernm) && password.equals(pass)) {
                    System.out.println("Login berhasil! Selamat datang, " + nama + "!");
                    scanner.close();
                    return true;
                }
            }

            System.out.println("Username atau password salah. Silakan coba lagi.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File users.csv tidak ditemukan.");
        }

        return false;
    }

    public static String posisi(String username) {
        try {
            File file = new File("users.csv");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                String nama = data[0];
                String posisi = data[2];

                if (username.equals(nama)) {
                    scanner.close();
                    return posisi;
                }
            }

            System.out.println("Username tidak ditemukan.");
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File users.csv tidak ditemukan.");
        }

        return null;
    }
}
