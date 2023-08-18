// Linked List Implementation of Stack in java
/*
 * Stack s = new Stack();
 * head = null , sz = 0
 * s.push(10);
 * 10->null , sz = 1
 * s.push(20);
 * 20->10->null , sz = 2
 * s.push(30);
 * 30->20->10->null , sz = 3
 *  s.pop();
 * 20->10->null , sz = 2
*/
// Time Complexity : O(1)
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}

class Stack
{
    Node head;
    int sz;
    Stack()
    {
        head = null;
        sz = 0;
    }
    int size()
    {
        return sz;
    }
    boolean isEmpty()
    { return (head==null);
    }
    void push (int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        sz++;
    }
    int pop()
    {
        if(head==null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        sz--;
        return res;
    }
    int peek()
    {
        if(head==null) return Integer.MAX_VALUE;
        int res=head.data;
        return res;
    }
}

class Test{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}