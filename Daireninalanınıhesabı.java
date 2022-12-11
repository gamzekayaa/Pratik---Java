import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Değişkenlerimizi oluşturalım
        Scanner input = new Scanner(System.in);
        int r;
        int a;
        double pi = 3.14;
        System.out.print("Lütfen dairenin yarıçapını giriniz:");
        r = input.nextInt();
        System.out.print("Lütfen dairenin açısını giriniz:");
        a = input.nextInt();
        double dil_alani = (pi * (r*r) * a)/360;
        System.out.println("Daire diliminin alanı:" +dil_alani);

    }
}
