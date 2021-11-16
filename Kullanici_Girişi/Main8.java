import java.util.Scanner;

public class Main8{
    public static void main(String[] args) {
        String userName, password;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        userName=input.nextLine();
        System.out.print("Şifre giriniz: ");
        password=input.nextLine();

        switch(userName){
            case "codingisartt":
                System.out.println("Kullanıcı adı doğru...");
                break;
            default: System.out.println("Yanlış kullanıcı adı!!");     
        }
        switch(password){
            case "tuba123":
                System.out.println("Parola doğru...");
                break;
            default: System.out.println("Yanlış şifre!!");
                

        }
        


    }

}