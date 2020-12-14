import java.util.ArrayList;
import java.util.Scanner;

public class TomRiddleDiary{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> names=new ArrayList<>();
        for (int i =0;i<n;i++){
            String current=in.next();
            boolean exists=false;
            for (String name:names){
                if(name.equals(current)){
                    exists=true;
                    break;
                }
            }
            if(exists){
                System.out.println("YES");
            }else {
                System.out.println("NO");
                names.add(current);
            }

        }
    }
}