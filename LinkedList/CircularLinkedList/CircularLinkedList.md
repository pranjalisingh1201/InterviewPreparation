## Circular Linked List

- As the name suggests the next of last node is not null rather it is head of the linked list.
- A circular Linked List can be both singly and doubly Linked List.
```text
head
|
10->5->20->15
 ^         |
 |_________|
 where 15.next points to head.
 ```

#### Representation of Circular Linked List :

```java
//It is same as Singly linked list.
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public static void main(String [] args)
{
    Node head = new Node(10);
    head.next = new Node(5);
    head.next.next = new Node(20);
    head.next.next.next =new Node(15);
    head.next.next.next.next= head;
} 
/*
 * If CLL is empty then head = null
 * If CLL has only one node then head.next = head;
 * For eg : 10<-to itself.
*/
```

#### Advantages and Disadvantages of Circular Linked List :

##### Advantages

- We can traverse the whole list from any node.
- Implementation of algorithms like round robin.

- We can insert at the beginning and end by just maintaining one tail reference/pointer.

##### Disadvantages

- Implementations of operations become complex.


