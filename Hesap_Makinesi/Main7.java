import java.util.Scanner;

public class Main7{
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner num=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1=num.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2=num.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapacağınız İşlemi Seçiniz: ");
        select=num.nextInt();

        switch(select){
            case 1: System.out.println(n1+n2);
            break;
            case 2: System.out.println(n1-n2);
            break;
            case 3: System.out.println(n1*n2);
            break;
            case 4: 
                switch(n2) {
                    case 0: System.out.println("Bu sayı 0'a bölünemez.");
                    default: System.out.println((double) n1/n2);
                    break;
                } 
                        
            break;
            
            default:
                System.out.println("Hatalı giriş yaptınız!");

        }
            


    }
}