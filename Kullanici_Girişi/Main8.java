import java.util.Scanner;

public class Main8{
    public static void main(String[] args) {
        String userName="tubanur";
        var password="123456";
        int click;

        Scanner inp =new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName=inp.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password=inp.nextLine();
        if(!"tubanur".equals(userName) && !"123456".equals(password)){
            System.out.println("Hem kullanıcı adınız hem şifreniz yanlış !");
        }else if(!"tubanur".equals(userName)){
            System.out.println("Kullanıcı adınız yanlış ! ");
        }else if(!"123456".equals(password )){
            System.out.print("Şifreniz Yanlış ! Şifrenizi değiştirmek için 1'e çıkış yapmak için lütfen 2'ye basınız: ");
            click=inp.nextInt();
            if(click==1){
                System.out.print("Eski şifreden farklı bir şifre oluşturun: ");
                password=inp.next();
                if(!"123456".equals(password)){
                    System.out.println("Şifre başarıyla oluşturuldu.");
                }else{
                    System.out.println("Bu şifre kullanılamaz !");
                }

            }else if(click==2){
                System.out.println("Çıkış yapılıyor...");
            }else{
                System.out.println("Yanlış sayı girdiniz...");
            }
        }else{
            System.out.println("Giriş başarılı..");
        }



    }
}