import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iters = Integer.parseInt(in.nextLine());
        for(int i = 0; i < iters; i++) {
            int size = 2 * Integer.parseInt(in.nextLine());
            int[][] mat = new int[size][size];
            for(int k = 0; k < size; k++) {
                String[] column = in.nextLine().split(" ");
                for(int p = 0; p < size; p++) {
                    mat[k][p] = Integer.parseInt(column[p]);
                }
            }

            int count = 0;
            for(int k = 0; k < size / 2; k++) {
                for(int p = 0; p < size / 2; p++) {
                    count += Math.max(mat[k][p], Math.max(mat[k][size - 1 - p], Math.max(mat[size - 1 - k][p], mat[size - 1 - k][size - 1 - p])));
                }
            }

            System.out.println(count);
        }
    }
}