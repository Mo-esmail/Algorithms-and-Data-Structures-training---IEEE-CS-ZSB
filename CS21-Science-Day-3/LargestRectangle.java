
import java.util.Stack;

public class LargestRectangle {

    static int getMaxArea(int hist[], int n) {

        Stack<Integer> s = new Stack<>();

        int max = 0;
        int tp;
        int area;

        int i = 0;
        while (i < n) {
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
            else {
                tp = s.peek();
                s.pop();

                area = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

                if (max < area)
                    max = area;
            }
        }
        while (s.empty() == false) {
            tp = s.peek();
            s.pop();
            area = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

            if (max < area)
                max = area;
        }

        return max;

    }
    public static void main(String[] args)
    {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
    }
}