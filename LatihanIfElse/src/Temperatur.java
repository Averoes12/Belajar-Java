import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        int suhu;

        System.out.println("Masukkan suhu");

        Scanner temperatur  = new Scanner(System.in);
        suhu = temperatur.nextInt();

        if (suhu == 25){
            System.out.println("Suhu " + suhu + " Celcius, Normal");
        }else if (suhu < 25){
            System.out.println("Suhu " + suhu + " Celcius, Cold");
        }else if (suhu > 25 && suhu < 30) {
          System.out.println("Suhu " + suhu + " Celcius, Hot")
        }else {
            System.out.println("Suhu " + suhu + " Celcius, So Hot");
        }
    }
}
/**
 * buat else if
 * suhu 40 Panas
*/
