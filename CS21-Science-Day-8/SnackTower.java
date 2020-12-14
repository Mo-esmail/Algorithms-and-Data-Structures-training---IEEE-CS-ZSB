import java.util.*;

public class SnackTower {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[]snack=new int[n+1];
        for (int i = 1; i <= n; i++) {
            snack[i]=in.nextInt();
        }
        boolean[]vis=new boolean[n+1];
        //vis[snack[0]]=true;
        // vis[snack[3]]=true;
        int c=n;
        for (int i = 1; i <=n; i++) {
            vis[snack[i]]=true;

            while(vis[c]&&c>0)
                System.out.print(c-- +" ");
            System.out.println("");
        }
    }
}