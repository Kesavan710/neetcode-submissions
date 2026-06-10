class Solution {
    public int splitArray(int[] nums, int k) {
        int start,mid,end=nums[0];
        start=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            end+=nums[i];
            if(nums[i]>start)
                start=nums[i];
        }
        mid=start+(end-start)/2;
        while (start<end)
        {
            mid=start+(end-start)/2;
            int k1=1;
            int val=0;
            for(int i=0;i<nums.length;i++)
            {
                if(val+nums[i]<=mid)
                    val+=nums[i];
                else
                {
                    val=nums[i];
                    k1++;
                }
                    
            }
            if(k1>k)
                start=mid+1;
            else
                end=mid;
        }
        return end;
    }
    

}