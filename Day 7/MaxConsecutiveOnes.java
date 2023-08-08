class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1){
                count+=1;
                ans = Math.max(count,ans);
            }
            else {
                count =0;
            }
        }
        return ans;
    }
}
