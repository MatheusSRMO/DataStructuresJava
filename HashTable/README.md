# HashTable (Tabela de Hash) em Java

Este repositório contém a implementação de uma Tabela de Hash (HashTable) em Java. A Tabela de Hash é uma estrutura de dados que permite armazenar pares chave-valor de forma eficiente, permitindo acesso rápido aos valores através de suas chaves.

## Tabela de Hash (HashTable)

A Tabela de Hash é uma estrutura que armazena os elementos em um vetor, utilizando uma função de hash para calcular o índice em que cada elemento é armazenado. Ela é composta por duas interfaces: `HashFunction` e `Comparator`, que permitem definir funções de hash e funções de comparação personalizadas para as chaves.

### Métodos

- `set(K key, V value)`: Adiciona um elemento à tabela hash com a chave `key` e o valor `value`.
- `get(K key)`: Obtém o valor associado à chave `key` na tabela hash.
- `pop(K key)`: Remove o elemento associado à chave `key` da tabela hash e retorna o valor removido.

## Uso

Para utilizar a Tabela de Hash, você deve criar instâncias da classe `HashTable`, fornecendo a função de hash e a função de comparação adequadas para os tipos de chave que você pretende utilizar.

```java

// Classe para a função de hash
class StringHashFunction implements HashFunction<String> {
    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash;
    }
}

// Classe para a função de comparação
class StringComparator implements Comparator<String> {
    public int compare(String key1, String key2) {
        return key1.compareTo(key2);
    }
}

class Main {
    public static void main(String[] args) {
        // Cria uma tabela de hash para armazenar pares (String, Integer)
        HashTable<String, Integer> hashTable = new HashTable<>(new StringHashFunction(), new StringComparator());

        // Adiciona elementos à tabela hash
        hashTable.set("chave1", 10);
        hashTable.set("chave2", 20);
        hashTable.set("chave3", 30);

        // Obtém valores da tabela hash
        int value1 = hashTable.get("chave1"); // Retorna 10
        int value2 = hashTable.get("chave2"); // Retorna 20

        // Remove um elemento da tabela hash
        int removedValue = hashTable.pop("chave3"); // Remove e retorna 30

        // Imprime os valores obtidos
        System.out.println("Valor da chave1: " + value1); // Saída: Valor da chave1: 10
        System.out.println("Valor da chave2: " + value2); // Saída: Valor da chave2: 20
        System.out.println("Valor removido: " + removedValue); // Saída: Valor removido: 30
    }
}
```

Neste exemplo, a Tabela de Hash é criada para armazenar pares de chaves do tipo `String` e valores do tipo `Integer`. Você pode adaptar a implementação para utilizar outros tipos de dados e definir suas próprias funções de hash e comparação, caso necessário.

Sinta-se à vontade para contribuir com melhorias ou correções para esta implementação. Suas contribuições são bem-vindas!