import java.util.Scanner;

public class BowWowandtTimetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrival = scanner.next();
        int num=arrival.length()/2;
        if(arrival.equals("0"))
            System.out.println(0);
        else {
            if (arrival.length() % 2 == 0) {
                System.out.println(num);
            } else {
                int count = 0;
                for (int i = 0; i < arrival.length(); i++) {
                    if (arrival.charAt(i) == '1')
                        count++;
                    if (count > 1)
                        break;
                }
                System.out.println(num + count - 1);
            }
        }
    }
}
