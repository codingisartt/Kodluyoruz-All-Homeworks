import java.util.Scanner;

public class Main16{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz: ");
        year=input.nextInt();

        if(year%4==0 || year%400==0){
            System.out.println(year +" bir artık yıldır !");
        }else{
            System.out.println(year +" bir artık yıl değildir !");
        }
    }
}