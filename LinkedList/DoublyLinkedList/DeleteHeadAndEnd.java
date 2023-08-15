package LinkedList.DoublyLinkedList;

//Delete Head and End of a Doubly Linked List
/*
 * Input : head->10-><-20-><-30->null
 * Output : head->20->null
 * 
 * Input : head->10->null
 * Output : head = null
 * 
 * Input : head = null
 * Output : head = null
 * 
*/

public class DeleteHeadAndEnd {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = null;
        head = deleteHead(head);
        head = deleteEnd(head);
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node deleteHead(Node head)
    {
        if(head==null && head.next==null)return null; 
        head.next.prev = null;
        head=head.next;
        return head;
    }

    public static Node deleteEnd(Node head)
    {
         if(head==null && head.next==null)return null; 
        Node curr = head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    
}
