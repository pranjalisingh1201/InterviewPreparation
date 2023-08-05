// Search in a Linked List (Iterative and Recursive):
/*
 * Input : head -> 10 -> 5 ->
 *  h
*/

public class SearchPositionRec {

    public static void main(String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        int key = 20;
        int position = searchIterative(head,key);
        System.out.println(position);
    }

    public static int searchIterative(Node head, int key)
    {
        Node currNode = head ;
        int position = -1, index = 0;
        while(currNode!=null)
        {
            if(currNode.data==key) return ++index;
            index++;
            currNode = currNode.next;
        }
        return position;
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
