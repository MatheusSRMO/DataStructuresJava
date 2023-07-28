package DataStructures.HashTable;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;



public class HashTable<K, V> {

    private HashFunction<K> hashFunction;
    private Comparator<K> comparator;
    private LinkedList<HashTableItem<K, V>>[] table;
    private int size = 100;

    // recebe a função de hash e a função de comparação como parâmetro
    @SuppressWarnings("unchecked") // para suprimir o warning do cast
    public HashTable(HashFunction<K> hashFunction, Comparator<K> comparator) {
        this.hashFunction = hashFunction;
        this.comparator = comparator;
        this.table = new LinkedList[this.size];

        for (int i = 0; i < this.size; i++) {
            table[i] = null;
        }
    }

    // Método para adicionar um elemento à tabela hash
    public V set(K key, V value) {
        int index = hashFunction.hash(key) % this.size;
        HashTableItem<K, V> item = new HashTableItem<K, V>(key, value);

        if (table[index] == null) {
            table[index] = new LinkedList<HashTableItem<K, V>>();
        }
        LinkedList<HashTableItem<K, V>> list = table[index];

        Node<HashTableItem<K, V>> current = list.head;

        while (current != null) {
            if (comparator.compare(current.getData().getKey(), key) == 0) {
                V oldValue = current.getData().getValue();
                current.setData(item);
                return oldValue;
            }
            current = current.getNext();
        }

        list.addBack(item);
        return null;
    }

    // Método para obter um elemento da tabela hash a partir da chave
    public V get(K key) {
        int index = hashFunction.hash(key) % this.size;

        if (table[index] == null) {
            return null;
        }

        LinkedList<HashTableItem<K, V>> list = table[index];

        Node<HashTableItem<K, V>> current = list.head;

        while (current != null) {
            if (comparator.compare(current.getData().getKey(), key) == 0) {
                return current.getData().getValue();
            }
            current = current.getNext();
        }

        return null;
    }

    // Método para remover um elemento da tabela hash a partir da chave
    public V pop(K key) {
        int index = hashFunction.hash(key) % this.size;

        if (table[index] == null) {
            return null;
        }

        LinkedList<HashTableItem<K, V>> list = table[index];

        Node<HashTableItem<K, V>> current = list.head;
        Node<HashTableItem<K, V>> parent = null;

        while (current != null) {
            if (comparator.compare(current.getData().getKey(), key) == 0) {
                if (parent == null) {
                    list.head = current.getNext();
                }
                else {
                    parent.setNext(current.getNext());
                }
                return current.getData().getValue();
            }
            parent = current;
            current = current.getNext();
        }

        return null;
    }
}
