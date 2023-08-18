## Queue

- Has FIFO Functionality
- Has two ends Rear (add) Front (remove).
- Addition Operation at the rear end is called Enqueue() operation and is used to Add Elements.
- Removal Operation at the front end is called Dequeue() is used to Remove Element.

### Pictorial Representation of Queue

```text
dequeue()<-|10|15|20|30|40|<-enqueue()
            |           |
            Front       Rear
```

### Operation of Queue

- enqueue(x) - Add Element
- dequeue() - Remove Element
- getFront() - Get element on Front
- getRear() - Get element on Rear
- size() - Get size of Queue
- isEmpty() - returns boolean after checking if queue is empty or not.

```text
Note : When we have only one element  - Front and rear are same element.
```

### Applications of Queue

- Single Resource and Multiple Resource.
- Synchronization between slow and fast devices(Routers stores data stream in queue packets and deliver them when slow device is available.)
- In Operating System, Semaphores(Queue is used to manage processes which are sleeping and waiting for a resource to become free)
- FCFS Scheduling(First Come First Serve CPU Scheduling,So all the processes are kept in queue and which ever process comes first is served first)
- Spooling(Used by printers , printers process one print at a time, hence there is a queue of processes for one print at a time).
- Buffers for devices like keyboard(Keyboard is a slow device and processor is a fast device so keyboard slowly puts items into buffer and process reads it in a cycle quickly).
- In Computer Networks (Routers/Switchces and Mail Queues)
- Variations - Deque, Priority Queue and doubly ended Priority Queue.
