import java.util.Scanner;
public class Siakad01Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiHuruf, nilaiSetara, kualifikasi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama: " + nama + " NIM " + nim + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
            nilaiSetara = "4";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <=80){
            nilaiHuruf = "B+";
            nilaiSetara = "3,5";
            kualifikasi = "Lebih dai Baik";
        }else if ( nilaiAkhir > 65 && nilaiAkhir <=73){
            nilaiHuruf = "B";
            nilaiSetara = "3";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <=65){
            nilaiHuruf = "C+";
            nilaiSetara = "2,5";
            kualifikasi = "Lebih dari Cukup";
        }else if (nilaiAkhir > 50 && nilaiAkhir <=60){
            nilaiHuruf = "C";
            nilaiSetara = "2";
            kualifikasi = "Cukup";
        }else if (nilaiAkhir > 39 && nilaiAkhir <=50){
            nilaiHuruf = "D";
            nilaiSetara = "1";
            kualifikasi = "Kurang";
        }else if (nilaiAkhir <=39){
            nilaiHuruf = "E";
            nilaiSetara = "0";
            kualifikasi = "Gagal";
        }else {
            nilaiHuruf = "Data tidak valid";
            nilaiSetara = "Data tidak valid";
            kualifikasi = "Data tidak valid";
        }
        System.out.println("Nilai huruf huruf: " + nilaiHuruf);
        System.out.println("Nilai setara: " + nilaiSetara);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}
    

