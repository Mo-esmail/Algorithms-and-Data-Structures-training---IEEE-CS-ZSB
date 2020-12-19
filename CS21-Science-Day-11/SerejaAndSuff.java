import java.io.BufferedReader;
 
import java.io.IOException;
import java.io.InputStreamReader;
 
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
 
 
public class SerejaAndSuff {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(input.readLine());
 
        int n = Integer.parseInt(s.nextToken());
        int m = Integer.parseInt(s.nextToken());
        boolean [] b = new boolean [100001];
        int [] dp = new int[n+1];
        s = new StringTokenizer(input.readLine());
        int nn[] = new int [n];
 
        for (int i = 0; i < n; i++) {
           nn[i]=Integer.parseInt(s.nextToken());
 
        }
 
 
        for (int i = n; i >0; i--) {
            if(i==n){
                dp[i]=1;
                b[nn[n-1]]=true;
 
            }
            else {
                if(b[nn[i-1]]){
                    dp[i]=dp[i+1];
                }
                else {
                    dp[i]=dp[i+1]+1;
                    b[nn[i-1]]=true;
 
                }
 
            }
 
 
 
        }
 
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num=Integer.parseInt(input.readLine());
            ans.append(dp[num]+"\n");
 
        }
        System.out.print(ans);
 
    }}