public class Main {
    public static void main(String[] args) {

        System.out.println("===== TEST 1 =====");

        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1)); // 10

        cache.put(3, 30); // evicts key 2

        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 30


        System.out.println("\n===== TEST 2 =====");

        LRUCache cache2 = new LRUCache(2);

        cache2.put(1, 100);
        cache2.put(2, 200);

        cache2.put(1, 111); // update existing key

        System.out.println(cache2.get(1)); // 111

        cache2.put(3, 300); // should evict key 2

        System.out.println(cache2.get(2)); // -1
        System.out.println(cache2.get(3)); // 300


        System.out.println("\n===== TEST 3 =====");

        LRUCache cache3 = new LRUCache(3);

        cache3.put(1, 1);
        cache3.put(2, 2);
        cache3.put(3, 3);

        cache3.get(1);
        cache3.get(2);

        cache3.put(4, 4); // should evict key 3

        System.out.println(cache3.get(1)); // 1
        System.out.println(cache3.get(2)); // 2
        System.out.println(cache3.get(3)); // -1
        System.out.println(cache3.get(4)); // 4


        System.out.println("\n===== TEST 4 =====");

        LRUCache cache4 = new LRUCache(1);

        cache4.put(1, 10);

        System.out.println(cache4.get(1)); // 10

        cache4.put(2, 20); // evicts key 1

        System.out.println(cache4.get(1)); // -1
        System.out.println(cache4.get(2)); // 20


        System.out.println("\n===== TEST 5 =====");

        LRUCache cache5 = new LRUCache(2);

        cache5.put(1, 1);
        cache5.put(2, 2);

        cache5.get(1); // 1 becomes MRU

        cache5.put(3, 3); // evicts 2

        cache5.get(3); // 3 becomes MRU

        cache5.put(4, 4); // evicts 1

        System.out.println(cache5.get(1)); // -1
        System.out.println(cache5.get(2)); // -1
        System.out.println(cache5.get(3)); // 3
        System.out.println(cache5.get(4)); // 4
    }
}