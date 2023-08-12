
## Linked List

### Problem with Array Data Structure:

- Either size is fixed and pre-allocated (in both fixed and variable size arrays), or the worst case insertion at the end is o(n).
- Insertion in the middle (or beginning) is costly.
- Deletion from the middle (or the beginning) is costly.
- Implementation of data structures like queue and deque is complex with arrays.

##### How to implement Round Robin Scheduling?

```text
P0  P1  P2  P3  P4  P5
10  5   3   15  10  8
Token Time = 5
Ready Queue: P0 (10-5) = 5 : Process Incomplete,insert at the end.
5  3  15  10  8  5
P1 P2 P3  P4  P5 P0 
Ready Queue: P1 (5-5) = 0 : Process Complete,remove from the queue.
3  15  10  8  5
P2 P3  P4  P5 P0
Ready Queue: P2 (3-5) = 0 : Process Complete,remove from the queue. 
Hence, Performing Insert at the end and deletion in array will not be efficient to perform in this queue.
```

##### Given a sequence of items.Whenever we see an item x int the sequence, we need to replace it with 5 instances of another item y.

```text
I/P: d e a x q r x p y
O/P: d e a y y y y y q r y y y y y p y

If you implement it with array then the size we would need is n*4 as we do not priorly know the count of x are present in the array.
Also we might need to create a new array of new size everytime.
We can resolve this with the help of list or vector.
```

##### We have multiple sorted sequences, we need merge them frequently.

```text
Sequences[]= {5, 10, 15, 20},
             {1, 12, 18},
             {3, 30, 40},
             {100, 200}
             
merge(0,1) : Sequences[]= {1, 5, 10, 12, 15, 18, 20} 
                          {3, 30, 40}
                          {100, 200}
merge(1,2): Sequences[]= {1, 5, 10, 12, 15, 18, 20}
                         {3, 30, 40, 100, 200}

Merging will be a costly operation in arrays as we have to copy elements and provide a new auxiliary arrays.                                                  
```

-Linked List handles fragmented spaces efficiently when we do not have contiguous space to store a large array.

### Introduction to Linked List:

- A linked list node stores data and a reference/pointer to the next node.
- The nodes can be at any random address in the memory.
- We do not have to pre-allocate the space(no extra nodes).
- The idea is to drop the contiguous memory requirements so that insertions, deletions can efficiently happen at the middle also.
- In Linked List, we have a reference to the first node we call this node as head.
- This first node as reference to the next node, and next node has reference to the next of next node and the next of the last node is always null to indicate there is nothing more at the last of the linked list.

###### Memory Representation:
```text
Head Reference -> data|reference -> data|reference -> data|reference=null
                    node1               node2           node3
                    
Head Reference -> 10|ref(20)-> 20|ref(30) -> 30|ref=null
                    node1       node2           node3                   
                    
Memory Heap Area: 
             
-----
node1(10|ref(20)<---head
-----
-----
node2(20|ref(30)
-----
-----
node3(30|ref(null)
-----
```

###### Note : 

- In linked List we cannot perform searching with binary search algorithm as it is hard to find out the middle node.But we can search elements faster in case of sorted linked lists with skip list. 