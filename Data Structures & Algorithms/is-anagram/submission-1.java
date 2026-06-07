class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> invent=new HashMap<>();
        if (s.length() != t.length()) 
            return false;
        for (char c : s.toCharArray()) {
            invent.put(c, invent.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!invent.containsKey(c) || invent.get(c) == 0) {
                return false; 
            }
            
            invent.put(c, invent.get(c) - 1);
        }
        return true;
    }
}
