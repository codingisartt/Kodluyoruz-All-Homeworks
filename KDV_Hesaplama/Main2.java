package KDV_Hesaplama;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        double kdvTutari, kdvliFiyat, kdvsizFiyat;
        Scanner input=new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        kdvsizFiyat= input.nextInt();
        boolean result1=(kdvsizFiyat<1000);
        boolean result2=(0<kdvsizFiyat);
        boolean sonuc= result1 && result2;
        double kdvOrani = sonuc ? 0.18 : 0.08;
        kdvTutari=kdvsizFiyat*kdvOrani;
        kdvliFiyat=kdvTutari+kdvsizFiyat;

        System.out.println("Ürün fiyatı: " +kdvsizFiyat);
        System.out.println("Kdv Tutarı: " +kdvTutari);
        System.out.println("Kdv Oranı: " +kdvOrani);
        System.out.print("Kdvli Fiyat: " +kdvliFiyat);
        

    }

}