// Insert a node at the end of the linked list in java.
/*
 * Input : head->10->20->30 and x=40
 * Output : head->10>20->30->40->Null
 * 
 * Input : null and x=10
 * Output : head->10
 * 
 * Input : head->10 and x=20
 * Output : head->10>20->Null
 * 
*/
public class InsertAtEnd {

    public static void main(String[] args)
    {
        Node head = null;
        head = insertAtEnd(head,10);
        head.next = insertAtEnd(head.next,20);
        head.next.next = insertAtEnd(head.next.next,30);
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node insertAtEnd(Node lastNode ,int value)
    {
        Node newNode = new Node(value);
        lastNode=newNode;
        return lastNode;
    }
    
}

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
/*
* Class Test {

    public static void main (String [] args)
    {
        Node temp = new Node(x);
        if(head==null) return temp;
        Node curr = head;
        while(curr.next != null)
            curr = curr.next; // when we get at the last node.
        curr.next = temp;// assign a new node to it.
        return head;

    }
}
*
*/