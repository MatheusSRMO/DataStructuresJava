package DataStructures.HashTable;

public class HashTableItem<K, V> {
    private K key;
    private V value;

    public HashTableItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return this.key; }
    public V getValue() { return this.value; }
}
