// Insert At Beginning and End of DLL
/*
 * Input : head->10-><-20-><-30->null and data = 5
 * Output : head->5-><-10-><-20-><-30-><-5->null
 *  
 * Input : null and data = 5
 * Output :head->5->null
 * 
*/

package LinkedList.DoublyLinkedList;

public class InsertAtBeginAndEnd {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = null;
        head = insertAtBegin(head,5);
        head = insertAtEnd(head,5);
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public static Node insertAtBegin(Node head , int data)
    {
        Node newNode = new Node(data);
        if(head!=null)
        head.prev = newNode;
        newNode.next = head;
        head= newNode;
        return head;
    }

    public static Node insertAtEnd(Node head , int data)
    {
        Node newNode = new Node(data);
        if(head==null){
        head= newNode;
        return head;}
        else
        {
            Node curr = head;
            while(curr.next!=null)
            {
                curr = curr.next; 
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
        return head;
    }
    
}

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        prev=next=null;
    }
}
