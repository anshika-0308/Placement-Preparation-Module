class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j<k) {
                if(nums[i]+nums[j]+nums[k] > 0) {
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] < 0) {
                    j++;
                }
                else {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                    j++;
                    sol.add(temp);
                    while(j<k && nums[k]==nums[k+1]) k--;
                    while(k>j && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return sol;
    }
}
