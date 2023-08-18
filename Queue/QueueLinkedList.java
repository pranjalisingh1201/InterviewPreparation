package Queue;

public class QueueLinkedList {
    Node front, rear;
    int size;
    QueueLinkedList()
    {
        front = rear = null;
        size=0;
    }
    void enqueue(int x)
    {
        Node temp = new Node(x);
        size++;
        if(front==null)
        {
            front =rear=temp;return;
        }
        rear.next = temp;
        rear = temp;
    }
    void dequeue()
    {
        if(front ==null) return;
        size--;
        front= front.next;
        if(front==null) rear=null;
    }

}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
//Time Complexity - Big O(1)