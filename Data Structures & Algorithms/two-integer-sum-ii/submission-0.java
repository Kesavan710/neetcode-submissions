class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end)
        {
            int n=numbers[start]+numbers[end];
            if(n==target)
                return new int[] {start+1,end+1};
            else if(n<target)
                start++;
            else
                end--;
        }
        return new int[] {start+1,end+1};
    }
}
