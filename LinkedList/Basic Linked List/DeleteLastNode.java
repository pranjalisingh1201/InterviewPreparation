// Delete the Last Node in the Singly Linked List.
/*
 * Input : head->10->20->30->40
 * Output : head->10->20->30
 * 
 * Input : head->10
 * Output : head->null
 * 
 * Input : head->null
 * Output : head->null
*/

/*
 * Time Complexity : Theta (N) as we are traversing the linked list.
*/

public class DeleteLastNode {
    
    public static void main (String [] args)
    {
        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = deleteTail(head);

        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node deleteTail(Node head)
    {
        if(head==null) return null;
        if(head.next==null) return null;
        Node currNode = head;
        while(currNode.next.next!=null) // if currNode is at 30 then next is 40 and next to next is null.
            currNode = currNode.next;
        currNode.next = null; //Hence we need to remove currNode.next which is 40.//We do not worry about about deallocating the space.

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

/*
 * Node delNode(Node head)
 * { 
 *      if(head==null) return null;
 *      if(head.next=null) return null;
 *      Node curr = head;
 *      while(curr.next.next != null)
 *          curr = curr.next;
 *      curr.next = null;
 *      
 *      return head;
 * }
 * 
*/
