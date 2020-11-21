import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        while (d>=arr.size())
            d-=arr.size();
        if(d==0)
            return arr;
        int x=d;
        ArrayList<Integer> result= new ArrayList<Integer>();
        for (int i=0;i<arr.size();i++){
            result.add(arr.get(x));
            x++;
            if(x== arr.size())
                x=0;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(rotateLeft(4,arr));
    }

}
