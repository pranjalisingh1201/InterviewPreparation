// Find Middle of a linked list in java.
/*
    Input : head->10->5->20->15->25;
    Output : 20

    Input : head->10->5->20->15->25->30;
    Output : 15

    Input : 10
    Output : 10

    Input : Null
    Output : 

    Input : head->10->20
    Output : 20
*/ 
/*
 * 1) Naive Approach 
    Time Complexity: O(n) // twice traversal

    2) Efficient Approach
    Time Complexity: O(n) // single traversal
*/
public class FindMiddleNode {

    public static void main(String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
       // head.next.next.next.next = new Node(25);
        int middleNode1 = findMiddleNode(head);
        int middleNode2 = findMiddleNode2(head);
        System.out.println(middleNode1);
        System.out.println(middleNode2);
    }
    //Naive Solution:
    public static int findMiddleNode(Node head)
    {
        if(head==null) return -1;
        int count = 0;
        Node curr;
        for(curr = head; curr != null; curr = curr.next)
            count++;
        curr = head;
        for(int i = 0; i < count / 2; i++)
            curr=curr.next;//need to mode ref 2 times from head to the next node (5) and next to next node which is 20.

        return curr.data;
    }

    //Efficient Solution:
    /*
     * Based on two pointers : slow moves one node at a time and fast moves two nodes at a time.
     *  Even Nodes :
            10->20->30->40->null
            slow ->10 and fast->10

            10->20->30->40->null
            slow ->20 and fast->30

            10->20->30->40->null
            slow ->30 and fast->null

            Answer : 30 as we landed on null in even noded.30 as we take next of the n/2.
        
        Odd Nodes : 
            10->20->30->40->50->null
            slow->10 and fast->10

            10->20->30->40->50->null
            slow->20 and fast->30

            10->20->30->40->50->null
            slow->30 and fast->50 who's next is null.

            Answer : 30 as 50th next is null.
    */
    public static int findMiddleNode2(Node head)
    {
        if(head==null) return -1;
        Node slow = head , fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    
}

class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
