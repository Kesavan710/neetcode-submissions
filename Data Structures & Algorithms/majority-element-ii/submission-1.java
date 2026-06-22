class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int count1,count2,num1,num2;
        count1=0;count2=0;num1=0;num2=0;
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==num1)
                count1++;
            else if(nums[i]==num2)
                count2++;
            else if(count1==0)
            {
                num1=nums[i];
                count1++;
            }
            else if(count2==0)
            {
                num2=nums[i];
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }   
        }
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(num==num1)
                count1++;
            else if(num==num2)
                count2++;
        }
        int thresh=nums.length/3;
        if(count1>thresh)
            result.add(num1);
        if(count2>thresh)
            result.add(num2);
        return result;
        
    }       
}