class Solution {
    public int findMin(int[] nums) {
        int start,end,mid;
        start=0;
        end=nums.length-1;
        mid=start+(end-start)/2;
        while(start<=end)
        {
            
            mid=start+(end-start)/2;
            if(start==end)
                return nums[start];
            if(nums[mid]>nums[end])
                start=mid+1;
            else if(nums[mid]<nums[end])
                end=mid;
            
        }
        return nums[start];
    }
}
