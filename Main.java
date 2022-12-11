import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Değişkenlerimizi oluşturalım
        Scanner input =  new Scanner(System.in);
        int km ;
        System.out.print(" Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextInt();
        double perKm=2.20, total, startPrice= 10;
        total = (km*perKm);
        total += startPrice;
        System.out.println(total);
        total=(total<20)? 20 : total;
        System.out.println("Toplam Tutar : "+ total);


    }
}
