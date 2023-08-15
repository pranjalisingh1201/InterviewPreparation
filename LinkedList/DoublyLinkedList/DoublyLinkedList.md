## Doubly Linked List

- In Doubly Linked List, together with reference to next node we have a reference to previous node.

#### Pictorial Representation of a Doubly Linked List 

```text
null <- previous|10|next| -> |previous|20|next| -> |previous|30|next| -> |null
                        | <- |                | <- |                | <- |
```

#### Node Representation of a Doubly Linked List

```java
class Node{
    int data;
    Node previous;
    Node next;
    Node(int data){
        this.data=data;
    }
}

```

#### Create Doubly Linked List with three nodes

```java
class Test{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.previous = temp1;
    }
}
```

#### Singly VS Doubly Linked List

##### Advantages  

- Can be traversed in both directions
- A given delete a node in O(1) time with given reference/ pointer to it.
- Insert/ Delete from both ends in O(1) by maintainning tails.

##### Disadvantages  

- Extra Space for previous.
- Code becomes more complex.

#### Application

- Browser Back and next page functionality.
