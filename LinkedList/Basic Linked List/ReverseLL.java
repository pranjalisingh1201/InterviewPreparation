// Reverse a Linked List in java.
/*
 * Input : head->10->20->30->40
 * Output : head->40->30->20->10
 * 
 * Input : head->10->20->30
 * Output : head->30->20->10
 * 
 * Input : head ->10
 * Ouput : head->10
 * 
 * Input : NULL
 * Output : NULL
*/

/*
 * The Idea is to use a auxilliary array and copy the elements to array and 
 * assign the elements back in the linked list from the last of the arrays , so it is in reversed order.
 * 
 * Requires 2 Traversal and auxilliary space.
*/

/*
 * Efficient Solution
 * 
 * I/P : x1->x2->x3......->xi-1->xi->xi+1.....->xn
 * 
 * After reversing nodes from x1 to xi-1
 * 
 * We are just changing the links between the nodes.
 * 
 * x1<-x2<-x3.......<-xi-1 <- xi <- xi+1 -> ......->xn
 *                     |      |     |
 *                   Prev    curr  next 
 * 
 * next = curr.next; // storing next.
 * curr.next = prev; // curr point in reverse direction
 * prev = curr; // curr is now prev.
 * curr = next;// curr node is the next node which we have to reverse. 
 * 
 * 
 * Time Complexity : Big O(N)
 * Space Complexity : Big O(1)
*/

import java.util.ArrayList;

public class ReverseLL {

    public static void main (String [] args)
    {
        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        //head = reverseLL(head);
        head = reverseLL2(head);

        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverseLL(Node head)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Node curr = head;
        for(curr=head;curr!=null;curr=curr.next)
        {
            arr.add(curr.data);
        }
        for(curr=head;curr!=null;curr=curr.next)
        {
            curr.data = arr.remove(arr.size()-1);//we are not getting the elements we just remove them so we not have to keep track for index in arr.
        }

        return head;
    }

    public static Node reverseLL2(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
 
}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
/*
 * Iterative Efficient Solution: 
    Start :
            curr->10->20->30
            prev=null
    
    Ist Iteration  :
            null<--10   20  -> 30
                    |    |\
                  prev curr next

    IInd Iteration :
            null<--10 <- 20  -> 30
                         |      |\
                        prev curr next
            
    IIIrd Iteration :
            null<--10 <- 20  <- 30 -> null
                                |      |\
                                prev curr next

    Prev is new head.                            
*/
