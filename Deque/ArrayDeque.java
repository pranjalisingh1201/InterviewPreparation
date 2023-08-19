package Deque;
// Array Implementation of Deque
/*
 * 1)dq.insertFront(10)
 *  10
 * |  \
 * front Rear
 * 
 * 2)dq.insertRear(20)
 *  10|20
 * |     \
 * front Rear
 * 
 * 3)dq.insertFront(30)
 *  30|10|20
 *   |     \
 * front Rear
 * 
 * 4)dq.insertRear(50)
 *  30|10|20|50
 *   |        \
 * front      Rear
 * 
 * 5)dq.deleteFront()
 *  10|20|50
 *   |      \
 * front    Rear
 * 
 * 6)dq.deleteRear()
 *  10|20
 *   |   \
 * front Rear
 * 
 * 
 * Operations :
 * ----------------------
 * insertFornt(x)
 * insertRear(x)
 * deleteFront()
 * deleteRear()
 * getFront()
 * getRear()
 * size()
 * isFull()
 * isEmpty()
 * 
 * 
 * deleteFront  =  front = (front+1)%cap;
 * insertRear() = rear = (rear+1)%cap;
 * insertFront() = front = (front-1+cap)%cap;
 * deleteRear() = rear = (rear-1+cap)%cap;
 * Rear = (front+size-1)%cap;
*/
public class ArrayDeque {
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(30);
        dq.insertRear(50);
        dq.deleteFront();
        dq.deleteRear();
        
    }
}

class Deque
{
    int arr[];
    int front ,cap , size;
    Deque()
    {
        arr = new int [cap];
        front = 0;
        size = 0;
    }

    void deleteFront()
    {
        if(isEmpty())return;
        front = (front+1)%cap;
        size--;
    }
    void deleteRear()
    {
        if(isEmpty())return;
        size--;
    }
    int getFront()
    {
        if(isEmpty())return -1;
        else return front;
    }
    int getRear()
    {
        if(isEmpty())return -1;
        else return (front+size-1)%cap;
    }
    void insertFront(int x)
    {
        if(isFull())return;
        front = (front+cap-1)%cap;
        arr[front] = x;
        size++;
    }
    void insertRear(int x)
    {
        if(isFull())return;
        int rear = (front+size-1)%cap;
        rear = (rear+1)%cap;
        arr[rear] = x;
        size++;
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