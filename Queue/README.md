# Queue (Fila) em Java

Este repositório contém a implementação de uma fila (queue) em Java, utilizando a estrutura de lista duplamente encadeada da classe `DoublyLinkedList`.

## Fila (Queue)

A fila é uma estrutura de dados linear que segue a política FIFO (First In, First Out), ou seja, o primeiro elemento adicionado é o primeiro a ser removido. A fila permite a adição de elementos apenas no final e a remoção é feita a partir do início.

### Métodos

- `push(E data)`: Adiciona o elemento `data` no final da fila.
- `pop()`: Remove e retorna o elemento do início da fila.
- `peek()`: Retorna o elemento do início da fila sem removê-lo.
- `isEmpty()`: Verifica se a fila está vazia.

## Uso

Para utilizar a fila, você pode seguir o exemplo de código abaixo:

```java
public static void main(String[] args) {
    Queue<String> queue = new Queue<>();

    queue.push("A");
    queue.push("B");
    queue.push("C");

    System.out.println("Início da fila: " + queue.peek()); // Saída: Início da fila: A

    String dequeuedElement = queue.pop();
    System.out.println("Elemento removido: " + dequeuedElement); // Saída: Elemento removido: A

    System.out.println("Início da fila após remover: " + queue.peek()); // Saída: Início da fila após remover: B

    System.out.println("A fila está vazia? " + queue.isEmpty()); // Saída: A fila está vazia? false
}
```

Este é apenas um exemplo simples de uso da fila. Você pode adicionar ou remover mais elementos e utilizar outros tipos de dados conforme necessário.

Sinta-se à vontade para contribuir com melhorias ou correções para esta implementação. Suas contribuições são bem-vindas!
