import java.io.*;
import java.util.*;

public class DoggoRecoloring {

    static String pangrams(String s) {
        if(s.length()==1)
            return "Yes";
        ArrayList<Character> alphas=new ArrayList<>();
        ArrayList<Character> alphac=new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++){
            alphas.add((char)i);
        }
        for (int i = 'a'; i <= 'z'; i++){
            alphac.add((char)i);
        }
        int[] c= new int[alphac.size()];
        Arrays.fill(c,0);
        for (int i=0;i<s.length();i++){
            int indexs=alphas.indexOf(s.charAt(i));
            int indexc=alphac.indexOf(s.charAt(i));
            if(indexc>=0)
                c[indexc]++;
            if(indexs>=0)
                c[indexs]++;
        }
        for (int i:c){
            if(i>1)
                return "Yes";
        }
        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        scanner.nextLine();
        String s = scanner.nextLine();

        String result = pangrams(s);

        System.out.println(result);

        scanner.close();
    }
}
