
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: if the array is empty, return an empty list
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // Our HashMap to hold the sorted "signature" and the bucket of original words
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            
            // 1. Convert the word to a character array and sort it to create the signature
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);
            
            // 2. If this is the first time we've seen this signature, create a new empty bucket
            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }
            
            // 3. Drop the ORIGINAL word into the correct bucket
            map.get(signature).add(word);
        }

        // 4. We don't care about the keys anymore, just return all the buckets!
        return new ArrayList<>(map.values());
    }
}