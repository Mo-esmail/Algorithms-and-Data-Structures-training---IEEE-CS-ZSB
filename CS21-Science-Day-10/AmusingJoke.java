import java.io.*;
import java.util.*;

public class AmusingJoke {

    // Complete the pangrams function below.
    static int[] pangrams(String s) {
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
        return c;
    }

    static String compare(int[] arr1,int[] arr2) {

        for(int i=0;i<arr1.length;i++){
            if (arr2[i]!=arr1[i]) {
                return "NO";
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String g = scanner.nextLine();
        String r = scanner.nextLine();
        String p = scanner.nextLine();
        int[] result1 = pangrams(g+r);
        int[] result2 = pangrams(p);
        System.out.println(compare(result1,result2));
        scanner.close();
    }
}