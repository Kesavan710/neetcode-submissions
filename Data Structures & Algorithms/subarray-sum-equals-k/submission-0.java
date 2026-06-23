
class Solution {
    public int subarraySum(int[] nums, int k) {
        int totalCount = 0;       
        int currentSum = 0;       
        HashMap<Integer, Integer> prefixMap = new HashMap<>();        
        prefixMap.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) 
        {
            currentSum += nums[i];
            int pastSumWeNeed = currentSum - k;
            if (prefixMap.containsKey(pastSumWeNeed)) 
            {
                totalCount += prefixMap.get(pastSumWeNeed);
            }
            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return totalCount;
    }
}