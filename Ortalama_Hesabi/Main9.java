import java.util.Scanner;

public class Main9{
    public static void main(String[] args) {
        int turkce, mat, fizik, kimya, muzik, i=0;
        double average=0;

        Scanner deger=new Scanner(System.in);
        System.out.print("Türkçe Notunuz: ");
        turkce=deger.nextInt();
        if(turkce>=0 && turkce<=100){
            average+=turkce;
            i++;
        }

        System.out.print("Matematik Notunuz: ");
        mat=deger.nextInt();
        if(mat>=0 && mat<=100){
            average+=mat;
            i++;
        }
        
        System.out.print("Fizik Notunuz: ");
        fizik=deger.nextInt();
        if(fizik>=0 && fizik<=100){
            average+=fizik;
            i++;
        }
        
        System.out.print("Kimya Notunuz: ");
        kimya=deger.nextInt();
        if(kimya>=0 && kimya<=100){
            average +=kimya;
            i++;
        }
        
        System.out.print("Müzik Notunuz: ");
        muzik=deger.nextInt();
        if(muzik>=0 && muzik<=100){
            average +=muzik;
            i++;
        }
    

        double result=(double) average/i;
        
        if(average>55){
            System.out.println("Sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: " +result);
        
    }
}