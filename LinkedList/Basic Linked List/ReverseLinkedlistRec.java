// Reverse a linked list in java using recursion.
/* 
 * Method 1:
 * The idea is to reverse the linked list starting from head.next to last node.
 * 
 * head -> x1 -> x2 -> x3 -> --------- -> xn
 * head -> x1 -> x2 <- x3 <- --------- <- xn <- reversed_head
 *          |
 *      reversed_tail
 * Method 2:
 * The idea is to reverse the linked list starting from head to last-1 node.
 * 
 * head -> x1 -> x2 -> x3 -> --------- -> xi-1 -> xi -> xi+1 -> ----- -> xn
 * null <- x1 <- x2 <- x3 <- --------- <-xi-1 -> xi -> xi+1 -> ----- -> xn
 *                                         |      |      |
 *                                        prev   curr    |
 *                                               prev    curr
*/
public class ReverseLinkedlistRec {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Node prev = null;
        head = reverselist2(head,prev);
        
        while(head!=null)
        { 
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverselist(Node head)
    {
        if(head==null || head.next==null) return head;
        Node revHead = reverselist(head.next);// recursive call to get the last node
        Node revTail = head.next;//Intialize 
        revTail.next = head;
        head.next = null;
        return revHead;
    }

    public static Node reverselist2(Node curr,Node prev)
    {
        if(curr==null)return prev;
        Node next = curr.next;
        curr.next = prev;
        return reverselist2(next,curr);  
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
/*
 *  1) prev = null 10 -> 20 -> 30
 *                  |     |
 *                 curr next
 *  2) null <-10 -> 20 -> 30
 *             |     |     |
 *            prev  curr next
 *  3) null <-10 <- 20 -> 30    null
 *                   |     |     |
 *                  prev  curr next
 *  4) null <-10 <- 20 <- 30    null  null
 *                         |     |     |
 *                       prev  curr next 
 *  Hence when curr == null return prev as head.
*/