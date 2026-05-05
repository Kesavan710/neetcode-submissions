

class MyHashSet {
    private final int ARRAY_SIZE = 10000;
    

    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[ARRAY_SIZE];
        

        for (int i = 0; i < ARRAY_SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    

    private int getHash(int key) {
        return key % ARRAY_SIZE;
    }

    public void add(int key) {
        int index = getHash(key);
        LinkedList<Integer> chain = buckets[index];
        

        if (!chain.contains(key)) {
            chain.add(key);
        }
    }

    public void remove(int key) {
        int index = getHash(key);
        LinkedList<Integer> chain = buckets[index];
        

        chain.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = getHash(key);
        LinkedList<Integer> chain = buckets[index];
        
     
        return chain.contains(key);
    }
}