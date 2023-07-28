public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
		long sum = a[0];
        int ans = 0;
        int left = 0; int right = 0;
        while(right < a.length) {
            while(left<=right && sum>k) {
                sum -= a[left];
                left++;
            }
            if(sum==k) {
                ans = Math.max(ans, right-left+1);
            }
            right++;
            if(right < a.length) {
                sum += a[right];
            }
        }
        return ans;
    }
}
