class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s2="";
        int i=0;
        for(;i<word1.length() && i<word2.length();i++)
        {
            s2+=word1.charAt(i);
            s2+=word2.charAt(i);
        }

        if(word1.length()>word2.length())
            s2+=word1.substring(i);
        else
            s2+=word2.substring(i);
        return s2;

    }
}