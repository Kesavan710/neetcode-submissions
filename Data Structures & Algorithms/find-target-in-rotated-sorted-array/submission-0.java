class Solution {
    public int search(int[] nums, int target) {
        int start,end,mid;
        start=0;
        end=nums.length-1;
        mid=start+(end-start)/2;
        int s1=0;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if(start==end){
                s1=start;
                break;
            }
            if(nums[mid]>nums[end])
                start=mid+1;
            else 
                end=mid;   
        }
        start=0;
        end=nums.length-1;
        if(target>=nums[s1] && target <=nums[end])
            start=s1;
        else
            end=s1-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;  
            else
                start=mid+1;
        }
        return -1;

        
        
    }
}
