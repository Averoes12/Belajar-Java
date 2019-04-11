public class WhileLoop {

    public static void main(String[] args) {
        //angka mulai
        int angka = 1;

        //batasan looping
        while (angka <= 10){

            //yang akan di looping
            if (angka == 8){
                System.out.println(angka + " Genap");
            }else {
                System.out.println(angka + " Ganjil");
            }
            //operator penambahan
            angka++;
        }
    }
}
