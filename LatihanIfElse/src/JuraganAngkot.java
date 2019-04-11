public class JuraganAngkot {

    public static void main(String[] args) {
        int beroperasi = 10;
        for (int angkot = 1; angkot<=beroperasi; angkot++){

            if (angkot >= 8){
                System.out.println("Angkot " + angkot + " Rusak");
            }else {
                System.out.println("Angkot " + angkot + "Sedang beroperasi");
            }

        }
    }
}
