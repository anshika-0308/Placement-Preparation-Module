class ReversePairs {
    int count = 0;
    public int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if(left >= right) return count;
        int mid = (left + right)/2;
        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);
        count += countPairs(nums, left, mid, right);
        merge(nums, left, mid, right);
        return count;
    }
    public void merge(int[] nums, int left, int mid, int right) {
        int i, j, k, n1, n2;
        n1 = mid - left + 1;
        n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(i = 0; i < n1; i++) {
            L[i] = nums[left + i];
        }
        for(i = 0; i < n2; i++) {
            R[i] = nums[mid + 1 + i];
        }
        i = 0; j = 0; k = left;
        while((i < n1) && (j < n2)) {
            if(L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            }
            else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            nums[k] = L[i];
            i++;
            k++;            
        }
        while(j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
    public int countPairs(int[] nums, int left, int mid, int right) {
        int count = 0;
        int high = mid + 1;
        for(int i = left; i <= mid; i++) {
            while((high <= right) && ((long)nums[i] > (2 * (long)nums[high]))) {
                high++;
            }
            count += high - (mid +1);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}
