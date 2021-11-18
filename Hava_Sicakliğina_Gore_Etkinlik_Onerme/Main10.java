import java.util.Scanner;

public class Main10{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz? : ");
        int heat=input.nextInt();
      

        boolean state=(heat<5);
        System.out.print(state? "Kayak yapabilirsiniz !" : "");
        boolean state1=(heat>5 && heat<15);
        System.out.print(state1? "Sinemaya gidebilirsiniz !" : "");
        boolean state2=(heat>15 && heat<25);
        System.out.print(state2? "Piknik yapabilirsiniz !" : "");
        boolean state3=(heat>25);
        System.out.print(state3 ? "Yüzebilirsiniz !" : "");
        


    }
}