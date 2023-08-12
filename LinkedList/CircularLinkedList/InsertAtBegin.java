package LinkedList.CircularLinkedList;

//Insert At Begin of Circular Linked List
/**
 * 
 * Input : head->10->30->20->head and x=15
 * Output : head->15->10->30->20->head
 * 
 * Input : null and x= 10
 * Output : head->10->head
 * 
 * Input : head->10->head and x= 3
 * Output : head->3->10->head

*/

class InsertAtBegin{
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = head;
        Node newhead = insert(head,15);
        System.out.println(newhead.data);
        Node curr = newhead.next;
        while(curr!=newhead)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

    public static Node insert (Node head, int x)
    {
        Node newNode = new Node(x);
        Node curr = head.next;
         while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next = newNode;
        newNode.next=head;
        head = newNode;
        return head;
    }

}