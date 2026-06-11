class TimeMap {

    private class TimeNode {
        int timestamp;
        String value;
        
        public TimeNode(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private Map<String, List<TimeNode>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new TimeNode(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
 
        if (!map.containsKey(key)) {
            return "";
        }

        List<TimeNode> list = map.get(key);
        
        int start = 0;
        int end = list.size() - 1;

        String closestValue = "";

        while (start <= end) {
            int mid = start + (end - start) / 2;
            TimeNode midNode = list.get(mid);
            
            if (midNode.timestamp <= timestamp) {
   
                closestValue = midNode.value;
  
                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }

        return closestValue;
    }
}