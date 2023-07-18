import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class 	RepeatAndMissingNumber {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        long Sn = (n*(n+1))/2;
        long S2n = (n*(n+1)*((2*n)+1))/6;
        
        long S=0, S2 =0;
        for(int i=0;i<n;i++) {
            S += arr.get(i);
            S2 += (((long)arr.get(i))*((long)arr.get(i)));
            
        }
        long val1 = S-Sn;
        long val2 = S2-S2n;
        
        val2=(val2/val1);
        long x = (val1 + val2)/2;
        long y = x-val1;
        int[] arr1 = new int[2];
        arr1[0] = (int) y;
        arr1[1] = (int) x;
        return arr1;
    }
}
