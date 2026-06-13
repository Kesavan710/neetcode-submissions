class Solution {
    public boolean search(int[] nums, int target){
        int start,end,mid;
        start=0;
        end=nums.length-1;
        mid=start+(end-start)/2;
        int pivot=-1;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                pivot=mid;
                break;
            } 
            if(mid>start && nums[mid]<nums[mid-1])
            {
                pivot=mid-1;
                break;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end])
            {
                if(mid>start && nums[start]>nums[start+1])
                {
                    pivot=start;
                    break;
                }
                start+=1;
                if(mid<end && nums[end]<nums[end-1])
                {
                    pivot=end-1;
                    break;
                }
                end-=1;
                continue;
            }
            if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
                
        }
        if(pivot==-1)
            return binary(nums,target,0,nums.length-1);
        if(nums[pivot]==target)
            return true;
        else if(nums[0]<=target)
            return binary(nums,target,0,pivot);
        else
            return binary(nums,target,pivot+1,nums.length-1);
    }
    public boolean binary(int nums[],int target,int start,int end)
    {
        int mid;
        while (start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}
