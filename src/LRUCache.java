import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    DLL cache = new DLL();
    Map<Integer, Node> mp = new HashMap<>(); // map that stores Key - Node mappings.

    LRUCache(int capacity) {
        this.capacity = capacity;
    }

    int get(int key) {
        if (mp.containsKey(key)) {
            Node n = mp.get(key);
            cache.updateNode(n);
            return n.value;
        } else {
            return -1;
        }
    }

    void put(int key, int value) {
        if (mp.containsKey(key)) {
            Node n = mp.get(key);
            n.value = value;
            cache.updateNode(n);
        } else {
            if (mp.size() == capacity) { // evict LRU
                Node remove = cache.tail.prev;
                cache.removeNode(remove);
                mp.remove(remove.key);
            }
            // put the new node
            Node newNode = new Node(key, value);
            cache.addNode(newNode);
            mp.put(newNode.key, newNode);
        }
    }
}