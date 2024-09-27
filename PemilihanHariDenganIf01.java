import java.util.Scanner;
public class PemilihanHariDenganIf01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = 0;
        String dayType;

        System.out.print("Masukkan nomor: ");
        number = sc.nextByte();

        if (number > 0 && number <= 5) {
            dayType = "Weekday";
        }else if (number >= 6 && number <=7){
            dayType = "Weekend";
        }else {
            dayType = "Invalid Number";
        }
        System.out.println(number + " is a "  + dayType);
        
        sc.close();
    }
}