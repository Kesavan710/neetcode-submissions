class MyHashMap {
    
    class Node {
        int key;
        int value;
        Node next;
        
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10000;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    
    private int getHash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        Node head = buckets[index];

        if (head == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node prev = null;
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            prev = head;
            head = head.next;
        }

        prev.next = new Node(key, value);
    }

    public int get(int key) {
        int index = getHash(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = getHash(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                
                if (prev == null) {
                    buckets[index] = head.next;
                } 
                else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}