import java.util.ArrayList;
import java.util.Scanner;

public class Stripe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList();
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            int z=scanner.nextInt();
            arr.add(z);
        }
        ArrayList<Integer> arrsum=new ArrayList();
        int sum1=0;
        for (int i=0;i<arr.size();i++){
            sum1+=arr.get(i);
            arrsum.add(sum1);
        }
        int count=0;
        for (int i=0;i<arr.size()-1;i++){
            if(arrsum.get(i)==(arrsum.get(arr.size()-1)-arrsum.get(i)))
                count++;
        }
        System.out.println(count);

    }
}
