

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0; 
        
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            
            while (window.contains(currentChar)) {
                window.remove(s.charAt(left));
                left++;
            }
            
     
            window.add(currentChar);
            

            int currentWindowSize = right - left + 1;
            if (currentWindowSize > maxLength) {
                maxLength = currentWindowSize;
            }
        
            right++;
        }
        
        return maxLength;
    }
}