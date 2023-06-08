import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> a, int m) {
        // Write your code here

        // 1st approach 
        // time - o(2n) space-(n)
        // int [] rev = new int[arr.size()+1];
        // int repeat =-1;
        // int missing = -1;

        // for(int v : arr){
        //     rev[v]++;
        // }
         
        // for(int i=1; i< rev.length ;i++){
        //     if(rev[i] > 1){
        //         // ans[1] = i;
        //         repeat = i;
        //     }
            
        //     if(rev[i] == 0){
        //         // ans[0] = i;
        //         missing = i;
        //     }
        // }

        // return new int[]{missing , repeat};

        //2nd approach 
        //time - 0(n2) space - o(1)

        // int repeat = -1;
        // int missing = -1;
        // int count = 0;
        // // int maxCount = 0;

        // for(int i=1 ;i <=arr.size(); i++){
        //     int num = i;
        //     count =0;
        //     for(int val : arr){
        //         if(val == num){
        //             count++;
        //         }
        //     }
        //     if(count == 0){
        //         missing = num;
        //     }
            
        //     if(count > 1){
        //         repeat = num;
        //     }
            
        // }
        // return new int[]{missing , repeat};

        // 3rd approach 
        // time - o(N) space - o(1)

        long n = a.size(); // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            long val = a.get(i);
            S += val;
            S2 += (long)val * (long)val;
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)y, (int)x};
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add((int)x);
        // ans.add((int)y);
        return ans;

        // 4th approach 
        // bit manipulation


    }
}