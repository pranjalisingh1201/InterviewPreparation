// Insert at the Begin in a linked list in java.
/*
 * Input : 10->20->30->NULL and x=5
 * Output : head->5->10->20->30->NULL
 * 
 * Input : 10->NULL and x=5
 * Output : head->5->10->NULL
 * 
 * Input : NULL and x=5
 * Output : head->5
 * 
*/

/*
 * Time Complexity : Big O(1)
 * 
*/
public class InsertAtBegin {

    public static void main (String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int x = 5;
        insertAtBegin(head,x);
    }
    
    public static void insertAtBegin(Node head , int x)
    {
        Node eleNode = head;
        Node newNode = new Node(x);
        newNode.next = eleNode;
        while(newNode!=null)
        {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }
}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
    Node()
    {
        this.data=0;
        this.next=null;
    }
}
/*
 * Class Test
 * {
 *      static Node insertBegin(Node head , int x)
 *      {
 *          Node temp = new Node(x);
 *          temp.next = head;
 *          return temp; 
 *      }
 *      
 *      public static void main (String [] args)
 *      {
 *          Node head = null;
 *          head = insertBegin(head,30);
 *          head = insertBegin(head,20);
 *          head = insertBegin(head,10);
 *      }
 * }
 * 
 * Class Node{
 *      int data;
 *      Node next;
 *      Node (int x)
 *      {
 *          data = x;
 *          next = null;
 *      }
 * }
 */