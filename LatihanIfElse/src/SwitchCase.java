import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int suhu;
        Scanner scan =  new Scanner(System.in);
        suhu = scan.nextInt();

        System.out.println("Masukkan suhu");
        switch (suhu){

            case 20:
                System.out.println("Dingin");
                break;

            case 30 :
                System.out.println("Hangat");
                break;

                default:
                    System.out.println("Suhu tidak terdeksi");
        }

    }
}