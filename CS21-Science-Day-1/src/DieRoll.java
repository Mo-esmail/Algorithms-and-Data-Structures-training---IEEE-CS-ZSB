import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        System.out.println("what did Yakko and Wakko get?");
        Scanner s = new Scanner(System.in);
        int Yakko=s.nextInt() ,Wakko=s.nextInt();
        int max=Yakko>Wakko?Yakko:Wakko;
        if(max==1)
            System.out.println("1/1");
        else if(max==2)
            System.out.println("5/6");
        else if(max==3)
            System.out.println("2/3");
        else if(max==4)
            System.out.println("1/2");
        else if(max==5)
            System.out.println("1/3");
        else
            System.out.println("1/6");
    }
}
