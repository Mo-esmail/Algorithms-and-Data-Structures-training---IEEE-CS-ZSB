import java.util.Scanner;

public class KseniaandPanScales{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String current = scanner.next();
        String added = scanner.next();
        String[] side=current.split("\\|");
        String[] sides=new String[2];
        if (side.length==0){
            sides[0]="";
            sides[1]="";
        } else if (side.length==1){
            sides[0]=side[0];
            sides[1]="";
        }else{
            sides[0]=side[0];
            sides[1]=side[1];
        }

        int diff = sides[0].length()>sides[1].length() ? sides[0].length()-sides[1].length() : sides[1].length()-sides[0].length();
        if((added.length()-diff)%2>0||added.length()<diff)
            System.out.println("Impossible");
        else{
            for (int i=0;i<added.length();i++){
                if(sides[0].length()>sides[1].length())
                    sides[1]+=added.charAt(i);
                else
                    sides[0]+=added.charAt(i);
            }
            System.out.println(sides[0]+"|"+sides[1]);
        }
    }
}