# Deque (Double Ended Queue) em Java

Este repositório contém a implementação de um Deque (Double Ended Queue) em Java, utilizando a estrutura de lista duplamente encadeada da classe `DoublyLinkedList`.

## Deque (Double Ended Queue)

O Deque é uma estrutura de dados linear que permite a inserção e remoção eficiente de elementos tanto na frente quanto no final da fila. Ele combina as características de uma pilha (LIFO) e de uma fila (FIFO) em uma única estrutura.

### Métodos

- `pushFront(E data)`: Adiciona o elemento `data` na frente do deque.
- `pushBack(E data)`: Adiciona o elemento `data` no final do deque.
- `popFront()`: Remove e retorna o elemento da frente do deque.
- `popBack()`: Remove e retorna o elemento do final do deque.
- `peekFront()`: Retorna o elemento da frente do deque sem removê-lo.
- `peekBack()`: Retorna o elemento do final do deque sem removê-lo.
- `isEmpty()`: Verifica se o deque está vazio.

## Uso

Para utilizar o deque, você pode seguir o exemplo de código abaixo:

```java
public static void main(String[] args) {
    Deque<Integer> deque = new Deque<>();

    deque.pushFront(1);
    deque.pushBack(2);
    deque.pushFront(3);

    deque.print(); // Saída: [3, 1, 2]

    int frontElement = deque.popFront();
    System.out.println("Elemento removido da frente: " + frontElement); // Saída: Elemento removido da frente: 3

    int backElement = deque.popBack();
    System.out.println("Elemento removido do final: " + backElement); // Saída: Elemento removido do final: 2

    System.out.println("Frente do deque após remoção: " + deque.peekFront()); // Saída: Frente do deque após remoção: 1
}
```

Este é apenas um exemplo simples de uso do deque. Você pode adicionar ou remover mais elementos e utilizar outros tipos de dados conforme necessário.

Sinta-se à vontade para contribuir com melhorias ou correções para esta implementação. Suas contribuições são bem-vindas!