import java.util.ArrayList;
import java.util.Scanner;

public class Araba {
    private ArrayList<Bilgi> arabalar;


    public Araba() {
        arabalar = new ArrayList<>();

        arabalar.add(new Bilgi("Toyota Corolla full paket edition", 250000, 2020));
        arabalar.add(new Bilgi("Honda s 2000 harun taştan edit", 220000, 2021));
        arabalar.add(new Bilgi("Ford focus sağ kapı kırık", 180000, 2019));
        arabalar.add(new Bilgi("BMW sanayı yan çar", 450000, 2022));
        arabalar.add(new Bilgi("Mercedes supranos", 500000, 2023));
        arabalar.add(new Bilgi("Audi favorite", 550000, 2022));
        arabalar.add(new Bilgi("Volkswagen passat kürt edition", 300000, 2021));
        arabalar.add(new Bilgi("Hyundai i20", 210000, 2020));
        arabalar.add(new Bilgi("Renault megan at arabası", 150000, 2018));
        arabalar.add(new Bilgi("Peugeot 3008 sağ on far şekil", 170000, 2019));
    }


    public void arabaOner(float budget) {
        System.out.println("Bütçenize uygun arabalar:");

        boolean bulundu = false;
        for (Bilgi araba : arabalar) {
            if (araba.getFiyat() <= budget) {
                System.out.println(araba);
                bulundu = true;
            }
        }

        if (!bulundu) {
            System.out.println("Bütçenize uygun araba yok.");
        }
    }


    public static void main(String[] args) {
        Araba araba = new Araba();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bütçenizi girin: ");
        float budget = scanner.nextFloat();

        araba.arabaOner(budget);
         scanner.close(); 
    }
}
