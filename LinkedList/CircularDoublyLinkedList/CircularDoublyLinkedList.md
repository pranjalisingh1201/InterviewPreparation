## Circular Doubly Linked List

- Previous of head is last node.
- Next of last node is head.

#### Pictorial Representation of Circular Doubly Linked List

 ```text

        head - > 10 - > 20 - > 15 - > 30 - > head  ------ NEXT
 30 < - head < - 10 < - 20 < - 15 < - 30           ------ PREVIOUS

 ```

##### Representation of Empty Circular Doubly Linked List

 ```text
head = null 
```

##### Advantages  

- We get all advantages of circular and doubly linked list.
- We can access last node in constant time without maintaining extra pointer/reference.

##### Applications

- Round Robin Algorithm
- Josephus Problem
