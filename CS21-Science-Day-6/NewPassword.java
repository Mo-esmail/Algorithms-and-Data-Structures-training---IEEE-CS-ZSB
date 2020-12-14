import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s="abcdefghijklmnopqrstuvwxyz";
        int n=in.nextInt();
        int k=in.nextInt();
        for(int i=0;i<(n/k);i++)
            System.out.print(s.substring(0, k));
        if(n%k!=0){
            int mod=n%k;
            System.out.println(s.substring(0, mod));
        }

    }
}
