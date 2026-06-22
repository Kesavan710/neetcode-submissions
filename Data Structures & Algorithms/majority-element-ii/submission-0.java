class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int threshold=nums.length/3;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentNumber = entry.getKey();
            int count = entry.getValue();
    
            if (count > threshold) {
                result.add(currentNumber);
            }
        }
        return result;
        
    }       
}