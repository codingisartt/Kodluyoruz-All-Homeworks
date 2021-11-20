import java.util.Scanner;

public class Main14{
       public static void main(String[] args) {
        double km, yas, yolculuktype,ucret,indirim,indirim2;
        Scanner input=new Scanner(System.in);

        System.out.print("Gideceğiniz mesafe(km) bilgisi? :");
        km=input.nextDouble();
        System.out.print("Yaşınız ?: ");
        yas=input.nextDouble();
        System.out.print("Tek yön için 1'e, Gidiş-Dönüş için 2'ye basınız: ");
        yolculuktype=input.nextDouble();

        boolean isError=(km>0)? false : true;
        ucret=km*0.1;

        if(yolculuktype==1){
            if(yas>0 && yas<12){
                indirim=ucret*0.5;
                System.out.println("Bilet fiyatınız: "+ (ucret-indirim));
                
            }else if(yas>12 && yas<24){
                indirim=ucret*0.1;
                System.out.println("Bilet fiyatınız: "+(ucret-indirim));
            }else if(yas>65){
                indirim=ucret*0.3;
                System.out.println("Bilet fiyatınız: "+(ucret-indirim));
            }else{
                isError=true;
            }
        }else if(yolculuktype==2){
            if(yas>0 && yas<12){
                indirim=ucret*0.5;
                indirim2=(ucret)*0.2;
                System.out.println("Bilet fiyatınız: "+ (ucret-indirim-indirim2)*2);  
            }else if(yas>12 && yas<24){
                indirim=ucret*0.1;
                indirim2=(ucret-indirim)*0.2;
                System.out.println("Bilet fiyatınız: "+(ucret-indirim-indirim2)*2);
            }else if(yas>65){
                indirim=ucret*0.3;
                indirim2=(ucret)*0.2;
                System.out.println("Bilet fiyatınız: "+(ucret-indirim-indirim2)*2);
            }else{
                isError=true;
            }            
        }else{
            isError=true;
        }
        
        if(isError){
            System.out.println("Hatalı giriş yaptınız !!!");
        }else{
            System.out.println("İyi Uçuşlar :)");
        }
        

    }
}