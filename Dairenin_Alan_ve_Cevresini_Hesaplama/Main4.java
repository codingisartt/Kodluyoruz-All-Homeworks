package Dairenin_Alan_ve_Cevresini_Hesaplama;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        double r, alan, cevre, pi=3.14, 𝛼, alan2;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Yarıçap değeri giriniz: "); 
        r=girdi.nextDouble();
        System.out.println("Merkez açı ölçüsü giriniz: ");
        𝛼=girdi.nextDouble();
        alan= pi* r *r;
        cevre=2*pi*r;
        alan2=(pi*(r*r)*𝛼)/360;
        System.out.println("Alan= "+alan);
        System.out.println("Çevre= "+cevre);
        System.out.println("𝛼 değeri verilen dairenin alanı= "+alan2);
        girdi.close();

    }
}
