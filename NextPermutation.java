class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }System.out.println(index);
        if(index==-1) {
            reverse(nums,0);
        }
        else {
            for(int i=n-1; i>index; i--) {
                if(nums[i]>nums[index]) {
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums,index+1);
        }
    }
    void reverse (int [] nums, int start) {
        int i=start;
        int j=nums.length-1;
        while(i<j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
