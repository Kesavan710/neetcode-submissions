class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=0;
        int [] ans=new int[2*nums.length];
        for(;i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
        for(int j=0;j<nums.length;j++,i++)
        {
            ans[i]=nums[j];
        }
        return ans;
    }
}