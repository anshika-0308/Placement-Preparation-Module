class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(c1 == 0 && el2 != nums[i]) {
                c1++;
                el1 = nums[i];
            }
            else if(c2 == 0 && el1 != nums[i]) {
                c2++;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) {
                c1++;
            }
            else if(el2 == nums[i]) {
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0; c2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(el1 == nums[i]) {
                c1++;
            }
            if(el2 == nums[i]) {
                c2++;
            }
        }
        System.out.println(c1);
        ArrayList <Integer> list = new ArrayList <> ();
        if(c1 > (nums.length / 3)) {
            list.add(el1);
        }
        if(c2 > (nums.length / 3)) {
            list.add(el2);
        }
        return list;
    }
}
