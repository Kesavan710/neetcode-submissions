class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> inventory=new HashMap<>();
        if (s.length() != t.length()) 
            return false;
        for (char c : s.toCharArray()) {
            inventory.put(c, inventory.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!inventory.containsKey(c) || inventory.get(c) == 0) {
                return false; 
            }
            
            inventory.put(c, inventory.get(c) - 1);
        }
        return true;
    }
}
