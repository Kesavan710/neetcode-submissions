class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            result[i]=total;
            total=nums[i]*total;
            
        }
        total=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=total;
            total=nums[i]*total;
            
        }
       
        
        return result;
    }
}  
