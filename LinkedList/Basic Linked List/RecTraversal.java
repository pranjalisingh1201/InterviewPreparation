//Write a program to traverse linked list and print all items.
/*
 * Check for 10,20,30,40.
 * Check for null.
 * Check for One node.
*/
/*
 * Time Complexity - Big O (n)
 * Auxiliary Space - Big O (n)
*/

public class RecTraversal {

    public static void main (String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        println(head);
    } 

    public static void println(Node head)
    {
        Node currNode = head;
        if(currNode==null) return;

        System.out.println(currNode.data);
        println(currNode.next);
    }
    
}
