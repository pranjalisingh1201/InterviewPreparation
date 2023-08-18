package Queue;

// Implementation of Queue using Array
/*
 * 1) q.enqueue(10) Cap = 5, Size=0
 *   front -> 10 <- Rear Front = 0, rear = 0, size = 1
 * 2) q.enqueue(20) 
 *   front -> 10,20 <- Rear Front = 1, rear = 0, size = 2
 * 3) q.enqueue(30)
 *   front -> 10,20,30 <- Rear Front = 2, rear = 0, size = 3
 * 4) q.dequeue()
 *   front -> 20,30 <- Rear Front = 1, rear = 0, size = 2
*/
/*
 * Basic Implementation :
 * Enqueue - 0(1)
 * Dequeue - 0(n)
 * Rear - Size-1
 * Front - 0
*/
//Time Complexity - O(n)-dequeue and O(1) for all other operations.
class Queue
{
    int size , cap;
    int [] arr;
    Queue(int c)
    {
        cap = c;
        size = 0;
        arr = new int [cap];
    }
    void enqueue(int x)
    {
        if(isFull()) return;
        arr[size] = x;
        size++;
    }
    void dequeue()
    {
        if(isEmpty()) return;
        for(int i=0;i<size-1;i++)
        {
            arr[i] = arr[i+1];
        }
        size--;
    }
    int getFront()
    {
        if(isEmpty()) return -1;
        else return 0;
    }
    int getRear()
    {
        if(isEmpty())return -1;
        else return size-1;
    }
    boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }
}
//Circular Array Implementation with efficient solution.
//Time Complexity for all operation - O(1)
class EfficientQueue
{
    int size , cap , front;
    int [] arr;
    EfficientQueue(int c)
    {
        cap = c;
        size = 0;
        front = 0 ;
        arr = new int [cap];
    }
    void enqueue(int x)
    {
        if(isFull()) return;
        int rear = getRear();
        rear = (rear+1)%cap;
        arr[rear] = x;
        size++;
    }
    void dequeue()
    {
        if(isEmpty()) return;
        front = (front+1)%cap;
        size--;
    }
    int getFront()
    {
        if(isEmpty()) return -1;
        else return front;
    }
    int getRear()
    {
        if(isEmpty())return -1;
        else return (front+size-1)%cap;
    }
    boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }
}