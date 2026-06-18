class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) 
        {
            return false;
        }

        int[] s1Blueprint = new int[26];
        int[] window = new int[26];
 
        for (int i = 0; i < s1.length(); i++) 
        {
            s1Blueprint[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++)
        {
            if (matches(s1Blueprint, window)) 
            {
                return true;
            }
            window[s2.charAt(i) - 'a']++;

            window[s2.charAt(i - s1.length()) - 'a']--;
        }

        return matches(s1Blueprint, window);
    }


    private boolean matches(int[] blueprint, int[] window) 
    {
        for (int i = 0; i < 26; i++) 
        {
            if (blueprint[i] != window[i]) 
            {
                return false;
            }
        }
        return true;
    }
}