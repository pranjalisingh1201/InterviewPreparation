// Delete first node in linked list in java.
/*
 * Input : head->10->20->30->40
 * Output : head->20->30->40
 * 
 * Input : head->10
 * Output : head->null
 * 
 * Input : head->null
 * Output : head->null
 * 
*/

/*
 * Time Complexity : Big O (N)
*/
public class DeleteFirstNode {
    public static void main (String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = deleteFirstNode(head);

        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node deleteFirstNode(Node head)
    {
        if(head==null) return null;
        head = head.next;
        return head;
    }
}

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}

/**
 * public static Node deleteFirstNode(Node head)
    {
        if(head==null) return null;
        return head.next;
    }
*/
