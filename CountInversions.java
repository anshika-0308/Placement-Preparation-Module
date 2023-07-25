public class CountInversions {
    private static long merge(long arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        long Count = 0;
        long temp[] = new long[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++k;
                ++i;
            } 
            else {
                temp[k] = arr[j];
                Count += (mid - i);
                ++k;
                ++j;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }

        while (j <= right) {
            temp[k] = arr[j];
            ++k;
            ++j;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return Count;
    }
    
    private static long mergeSort(long arr[], int left, int right) {
        long Count = 0;

        if (right > left) {
            int mid = (right + left) / 2;

            Count = mergeSort(arr, left, mid);
            Count += mergeSort(arr, mid + 1, right);
            
            Count += merge(arr, left, mid + 1, right);
        }
        return Count;
    }

    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }
}
