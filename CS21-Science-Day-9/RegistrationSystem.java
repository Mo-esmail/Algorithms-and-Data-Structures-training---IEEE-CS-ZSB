import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;


public class RegistrationSystem {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        Map<String, Integer> names = new HashMap ();

        StringBuilder ans = new StringBuilder();
        String s ;
        for (int i = 0; i < n; i++) {
            s=input.readLine();
            if(!names.containsKey(s)){
                ans.append("OK\n");
                names.put(s, 0);
            }
            else {
                int num= names.get(s)+1;
                ans.append(s+num+"\n");
                names.put(s, num);

            }

        }
        System.out.print(ans);

    }}