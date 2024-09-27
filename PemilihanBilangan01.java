import java.util.Scanner;
public class PemilihanBilangan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hasil;

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        hasil = (angka > 0.0) ? "Bilangan positif" : "Bilangan negatif";
        System.out.println(angka + " adalah " + hasil);

        sc.close();
    }
}
