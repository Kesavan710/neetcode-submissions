class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;

            if (seenNumbers.containsKey(complement)) {

                return new int[] { seenNumbers.get(complement), i };
            }

            seenNumbers.put(currentNumber, i);
        }

        
        return new int[] {}; 
    }
}