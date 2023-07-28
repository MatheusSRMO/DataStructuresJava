# Stack (Pilha) em Java

Este repositório contém a implementação de uma pilha (stack) em Java, utilizando a estrutura de lista encadeada da classe `LinkedList`.

## Pilha (Stack)

A pilha é uma estrutura de dados linear que segue a política LIFO (Last In, First Out), ou seja, o último elemento adicionado é o primeiro a ser removido. A pilha permite a adição de elementos apenas na extremidade superior (topo) e a remoção também é feita a partir do topo.

### Métodos

- `push(E data)`: Adiciona o elemento `data` no topo da pilha.
- `pop()`: Remove e retorna o elemento do topo da pilha.
- `peek()`: Retorna o elemento do topo da pilha sem removê-lo.
- `isEmpty()`: Verifica se a pilha está vazia.

## Uso

Para utilizar a pilha, você pode seguir o exemplo de código abaixo:

```java
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Topo da pilha: " + stack.peek()); // Saída: Topo da pilha: 3

    int poppedElement = stack.pop();
    System.out.println("Elemento removido: " + poppedElement); // Saída: Elemento removido: 3

    System.out.println("Topo da pilha após remover: " + stack.peek()); // Saída: Topo da pilha após remover: 2

    System.out.println("A pilha está vazia? " + stack.isEmpty()); // Saída: A pilha está vazia? false
}
```

Este é apenas um exemplo simples de uso da pilha. Você pode adicionar ou remover mais elementos e utilizar outros tipos de dados conforme necessário.

Sinta-se à vontade para contribuir com melhorias ou correções para esta implementação. Suas contribuições são bem-vindas!