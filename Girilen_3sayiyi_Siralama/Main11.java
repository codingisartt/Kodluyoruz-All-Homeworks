import java.util.Scanner;

public class Main11{
    public static void main(String[] args) {
        double a,b,c;
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci Sayi (a): ");
        a=input.nextDouble();
        System.out.print("İkinci Sayi  (b): ");
        b=input.nextDouble();
        System.out.print("Üçüncü Sayi  (c): ");
        c=input.nextDouble();

        boolean compare= (a>b && a>c && b>c);
        System.out.println(compare ? "Sıralama a>b>c şeklindedir." : "");

        boolean compare2= (a>b && a>c && c>b);
        System.out.println(compare2 ? "Sıralama a>c>b şeklindedir." : "");

        boolean compare3= (b>a && b>c && a>c);
        System.out.println(compare3 ? "Sıralama  şeklindedir." : "");

        boolean compare4= (b>a && b>c && c>a);
        System.out.println(compare4? "Sıralama b>c>a şeklindedir." : "");

        boolean compare5= (c>a && c>b && a>b);
        System.out.println(compare5 ? "Sıralama c>a>b şeklindedir.": "");

        boolean compare6= (c>a && c>b && b>a);
        System.out.println(compare6 ? "Sıralama c>b>a şeklindedir." : "");        

    }
}