class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int total=0;
        while(start<end)
        {
            
            if(heights[start]<heights[end])
            {
                int t1=heights[start]*(end-start);
                if(t1>total)
                    total=t1;
                start++;
            }
            else
            {
                int t1=heights[end]*(end-start);
                if(t1>total)
                    total=t1;
                end--;
            }
        }
        return total;
    }
}
