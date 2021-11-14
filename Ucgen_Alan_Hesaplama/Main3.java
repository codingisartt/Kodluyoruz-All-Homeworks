package Ucgen_Alan_Hesaplama;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int a, b, c;
        double alan, u;
        Scanner input =new Scanner(System.in);
        System.out.print("Üçgenin 1.kenar uzunluğu: ");
        a=input.nextInt();
        System.out.print("Üçgenin 2.kenar uzunluğu: ");
        b=input.nextInt();
        System.out.print("Üçgenin 3.kenar uzunluğu: ");
        c=input.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " +alan);

    }
}
