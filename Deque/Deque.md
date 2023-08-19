## Deque 

- Deque stands for doubly ended queue.
- In deque,  we have two ends front and rear that allows insert and delete at both ends.

### Operations on Deque

- insertFront(): Adds an item at the front of Deque.
- insertLast(): Adds an item at rear of deque.
- deleteFront(): Deletes an item from the front of deque.
- deleteLast(): Deletes an item from the rear of deque.
- getFront(): Gets the front item from the queue.
- getRear(): Gets the last item from the queue.
- isEmpty(): checks whether deque is empty  or not.
- isFull(): checks whether deque is full or not.
- size(): Gets number of elements of a deque.

### Implementation

- Linked List : Doubly Linked List(to perform insertion and deletion in O(1) time) is used with rear and front references.
- Array : Circular Array with front and rear indexes. We can also use front and size and can get rear using size.

### Applications

- A deque can be used as both stack and queue.
- Maintaining history of actions.
- A Steal Process Scheduling Algorithm (This is used when you have multiple processes and all these processor use there own different queues, Here if any Processor's Queue is free then it can take processes from another processors rear end and complete them, So to delete process at rear end we need to use deque).
- Implementing a Priority Queue with two types of priorities.
- Eg - 1|1|1|2|2|2 all less priority items will be inserted through front and more priority items from rear so that all priority 1 items come before priority 2 items.
- Maximum/Minimum of all subarrays of size K in an array.
