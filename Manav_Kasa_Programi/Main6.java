import java.util.Scanner;

public class Main6{
    public static void main(String[] args) {
       int armut, elma, domates, muz, patlican;
       double perarmut= 2.14, perelma=3.67, perdomates=1.11, permuz=0.95, perpatlican=5, armutTutar,elmaTutar, domatesTutar, muzTutar, patlicanTutar;
       Scanner meyve= new Scanner(System.in);

       System.out.print("Armut Kaç Kilo ? :" );
       armut=meyve.nextInt();

       System.out.print("Elma Kaç Kilo ? :" );
       elma=meyve.nextInt();

       System.out.print("Domates Kaç Kilo ? :" );
       domates=meyve.nextInt();

       System.out.print("Muz Kaç Kilo ? :" );
       muz=meyve.nextInt();

       System.out.print("Patlıcan Kaç Kilo ? :" );
       patlican=meyve.nextInt();

       armutTutar=armut*perarmut;
       elmaTutar=elma*perelma;
       domatesTutar=domates*perdomates;
       muzTutar=muz*permuz;
       patlicanTutar=patlican*perpatlican;

       System.out.println("Toplam Tutar : "+ (double) (armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar));
    }
}