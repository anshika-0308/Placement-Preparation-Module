class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cell=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1]>=target) {
                cell=i;
                break;
            }
        }
        for(int i=0;i<matrix[cell].length;i++) {
            if(matrix[cell][i]==target) {
                return true;
            }
        }
        return false;
    }
}
