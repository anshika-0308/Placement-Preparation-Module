class MergeOverlappingSubintervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }
        int[][] array = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++) {
            for(int j=0;j<2;j++) {
                array [i][j] = ans.get(i).get(j);
            }
        }
        return array;
    }
}
