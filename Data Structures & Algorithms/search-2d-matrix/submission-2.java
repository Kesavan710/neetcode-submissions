class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for(int i=0;i<matrix.length;i++)
        {
            int start,end,mid;
            start=0;
            end=matrix[i].length-1;
            while(start<=end)
            {
                mid=start+(end-start)/2;
                if(matrix[i][mid]==target)
                    return true;
                else if(matrix[i][mid]<target)
                    start=mid+1;
                else
                    end=mid-1;
                    
            }
        }

        return false;
    }
}