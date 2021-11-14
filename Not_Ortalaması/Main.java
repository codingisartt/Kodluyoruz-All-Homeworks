package Not_Ortalaması;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Double average;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz: ");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik=inp.nextInt();

        average=(double) ((mat + fizik + kimya + turkce + tarih + muzik)/6);
        System.out.println("Ortalamanız: " +average);
        
        String result= (average >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print("Durum: " +result);

        


        
    }
    
}

