package LinkedList.DoublyLinkedList;
//Reverse a Doubly Linked List
/*
 * Input  : head->10-><-20-><-30-><-40->null
 * Output : head->40-><-30-><-20-><-10->null
 * 
 * Input : head->10->null
 * Output : head->10->null
 * 
 * Input : null
 * Output : null
*/
/*
 * Approach:
 *          curr   prev=null
 *           | 
 *  NULL <- 10 -> 20 -> 30 -> NULL
 *             <-    <-    <-
 * 
 * After Ist Iteration
 * ----------------------
 * ______________
 * |             |
 * |- 10 ->null  20 -> 30 -> NULL
 *  10 : prev = 20;
 *       next = null;
 * After IInd Iteration
 * ----------------------
 * ______________ ______
 * |             ||     |prev
 * |- 10 ->null  20 -> 30 -> NULL
 *     |__________|next
 *  10 : prev = 20;
 *       next = null;
 *  20 : prev = 30;
 *       next = 10;
 * After IIIrd Iteration
 * ----------------------
 * ______________ ______ _______
 * |             ||     ||prev  |
 * |- 10 ->null  20 -> 30 -> NULL
 *     |________||_____| next.
 *  10 : prev = 20;
 *       next = null;
 *  20 : prev = 30;
 *       next = 10;
 *  30 : prev = null;
 *       next = 20;
*/


public class ReverseDoublyLinkedList {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        head = reverse(head);
        Node curr = head;

        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node reverse(Node head)
    {
        if(head==null&& head.next==null)return head;
        Node curr = head;
        Node prev =null, next = null;
        while(curr!=null)
        {
            prev=curr.prev;//null=null 1st iteration| null=10|10=20|null
            curr.prev = curr.next;//null=20|10=30|20=null
            curr.next = prev;//20=null|30=10|null=20
            if(curr.prev!=null) //because 30 is head and its previous will be null so return when we are at head; 
            curr = curr.prev;//10=20|20=30|20=null
            else break;
        }
        return curr;
    }
}
