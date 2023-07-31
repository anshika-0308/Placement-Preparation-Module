import java.util.HashMap;
public class CountNumberOfSubarraysWithGivenXorK {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int xr =0;
        int count =0;
        HashMap <Integer,Integer> map = new HashMap <>();
        map.put(xr,1);
        for(int i=0;i<a.length;i++) {
            xr = xr ^ a[i];
            int x = xr ^ b;
            if(map.containsKey(x)) {
                count+=map.get(x);
            }
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return count;
    }
}
