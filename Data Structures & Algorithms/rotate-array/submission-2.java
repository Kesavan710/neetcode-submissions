class Solution {
    public void rotate(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        int k1=(k%(nums.length))-1;
        int slow=0;
        while(slow<k1)
        {
            int temp=nums[slow];
            nums[slow]=nums[k1];
            nums[k1]=temp;
            slow++;
            k1--;
        }
        int end1=nums.length-1;
        int k2=k%nums.length;
        while(k2<end1)
        {
            int temp=nums[k2];
            nums[k2]=nums[end1];
            nums[end1]=temp;
            k2++;
            end1--;
        }
    }
}