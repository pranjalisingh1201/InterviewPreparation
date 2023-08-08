//Find Nth node from the end of the linked list.
/*
 * Input : 10->20->30->40->50 and n=2
 * Output : 40
 * 
 * Input : 10->20->30 and n=3
 * Output : 10
 * 
 * Input : 10->20 and n=3
 * Output : 
 *
 * Input : 10->20->30 and n=1
 * Output : 30
*/

// Both Solution has time complexity : Theta (n).
public class FindNthNodeEnd {

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int n = 5;
        int node1 = findNthNodeFromEnd(head,n);
        int node2 = findNthNodeFromEnd2(head,n);
        System.out.println(node1);
        System.out.println(node2);
    }

    //Naive Solution 
    public static int findNthNodeFromEnd(Node head, int n)
    {
        Node curr = head;
        if(head==null)return -1;
        int len = 0 ;
        while(head!=null)
        { 
            len++;
            head = head.next;
        }
        if(len<n) return -1;
        else{
            len = len-n+1;
            for(int i=1;i<len;i++)
                curr = curr.next;
        }
        return curr.data;
    }

    //Efficient Solution
    /*
     *  10->20->30->40->50->60->70
        second ->10 and first->40

        n=3

        1) Move 'first' n positions ahead.
        2) Start 'second' pointer from head.
        3) Move both 'first' and 'second' at same speed. when 'first'  reaches null,
        second reaches the required node.

        10->20->30->40->50->60->70
        second ->20 and first->50

        10->20->30->40->50->60->70
        second ->30 and first->60

        10->20->30->40->50->60->70
        second ->40 and first->70

        10->20->30->40->50->60->70
        second ->50 and first->null

        Answer : 50 as it is the 3rd node from the last
    */

    public static int findNthNodeFromEnd2(Node head, int n)
    {
        Node first=head;
        Node second = head;
        if(head==null) return -1;
        while(n!=0)
        {
            if(first==null) return -1;
            first=first.next;
            n--;
        }

        while(first!=null)
        {
            second=second.next;
            first=first.next;
        }

        return second.data;
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
