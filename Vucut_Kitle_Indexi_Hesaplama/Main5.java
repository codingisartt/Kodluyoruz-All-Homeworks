import java.util.Scanner;

public class Main5{
    public static void main(String[] args) {
        double boy, kilo, index;
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy=scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo=scan.nextDouble();
        index=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndexiniz: "+index);

    }
}