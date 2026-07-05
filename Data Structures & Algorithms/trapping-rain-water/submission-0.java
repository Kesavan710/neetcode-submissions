class Solution {
    public int trap(int[] height) {
        int start=0;
        int end=height.length-1;
        int leftmax=height[start];
        int rightmax=height[end];
        int total=0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                if(height[start]>leftmax)
                    leftmax=height[start];
                else
                    total+=leftmax-height[start];
                start++;
            }
            else
            {
                if(height[end]>rightmax)
                    rightmax=height[end];
                else
                    total+=rightmax-height[end];
                end--;
            }
        }    
        return total;
    }
}
