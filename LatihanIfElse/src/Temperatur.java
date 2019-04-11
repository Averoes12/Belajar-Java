import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        int suhu;

        System.out.println("Masukkan suhu");

        Scanner temperatur  = new Scanner(System.in);
        suhu = temperatur.nextInt();

        if (suhu == 30 && suhu== 40){
            System.out.println("Suhu " + suhu + " Celcius, Normal");
        }else if (suhu < 40){
            System.out.println("Suhu " + suhu + " Celcius, Dingin");
        }else {
            System.out.println("Suhu " + suhu + " Celcius, Terlalu tinggi");
        }
    }
}
/**
 * buat else if
 * suhu 40 Panas
*/
