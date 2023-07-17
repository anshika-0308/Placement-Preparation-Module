class FindTheDuplicateInAnArrayOfN+1Integers {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int num:nums) {
            if(map.containsKey(num)) {
                return num;
            }
            else {
                map.put(num,1);
            }
        }
        return nums[nums.length-1];
    }
}
