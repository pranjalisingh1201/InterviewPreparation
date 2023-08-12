//Delete Head of a Circular Linked List
/*
 * Input : head->10->20->30->head
 * Output : head->20->30->head
 * 
 * Input : head->10->head
 * Output : Null
 * 
 * Input : head = null
 * Output : null
 * 
 * 
*/
package LinkedList.CircularLinkedList;

public class DeleteHead {
    public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = head;
            head = delete(head);
            System.out.println(head.data);
            Node curr = head.next;
            while(curr!=head)
            {
                System.out.println(curr.data);
                curr =curr.next;
            }
        }

        public static Node delete(Node head)
        {
            if(head==null || head.next==null) return head=null;
            Node curr = head.next;
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=head.next;
            head = head.next;
            return head;

        }
        
}

/*
 * Efficient Solution :
 * Idea is to copy the value from head.next to head and delete head.next .
 * Time Complexity is Big O (1)
 * 
 * NOde delHead(Node head)
 * {
 *      if(head==null) return head=null;
 *      if(head.next==null) return head=null;
 *      head.data = head.next.data;
 *      head.next = head.next.next;
 *      return head;
 * }
*/
    

