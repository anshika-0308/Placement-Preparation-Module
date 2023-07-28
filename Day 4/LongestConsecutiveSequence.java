class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longest =1;
        int count =longest;
        TreeSet <Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int x = set.first();
        for (Integer element : set.tailSet(x, false)) {
            if(element == x+1){
                x++;
                count++;
                longest = Math.max(count,longest);
            }
            else {
                x=element;
                count=1;
            }
        }
        return longest;
    }
}
