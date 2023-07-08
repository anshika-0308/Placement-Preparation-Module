class Sortanarrayof0's,1'sand2's {
    public void sortColors(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:nums) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
        }
        int c=0;
        if(map.containsKey(0)) {
            for(int i=0;i<map.get(0);i++) {
                nums[c]=0;
                c++;
            }
        }
        if(map.containsKey(1)) {
            for(int i=0;i<map.get(1);i++) {
                nums[c]=1;
                c++;
            }
        }
        if(map.containsKey(2)) {
            for(int i=0;i<map.get(2);i++) {
                nums[c]=2;
                c++;
            }
        }
    }
}
