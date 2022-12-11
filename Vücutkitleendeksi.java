import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg;
        double boy;
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz:");
        kg = input.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        double vki = kg / (boy * boy);
        System.out.println("Vücut Kitle Endeksi:" +vki);
    }
}
