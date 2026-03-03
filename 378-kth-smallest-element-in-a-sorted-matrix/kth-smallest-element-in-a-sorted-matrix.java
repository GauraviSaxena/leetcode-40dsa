class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int count=0;
        int row=matrix.length;
        int col = matrix[0].length;

        int[] arr = new int[row*col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[count++]= matrix[i][j];     
                
                
                    }
        }
        Arrays.sort(arr);
        return arr[k-1];

       // return matrix[(k-1)/col][(k-1)%col];
    }
}