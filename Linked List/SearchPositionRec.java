// Search in a Linked List (Iterative and Recursive):
/*
 * Input : head -> 10 -> 5 -> 20 -> 15   key: 20 
 * Output: 3 
 * 
 * Input : head -> 10 -> 15              Key: 20
 * Output: -1 
*/
/*
 * Time Complexity : Big O (N)
 * Space Complexity : Big O (N)
*/

public class SearchPositionRec {

    public static void main(String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        int key = 20;
        int iposition = searchIterative(head,key);
        int rposition = searchRecursive(head,key);
        System.out.println(iposition);
        System.out.println(rposition);
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

    public static int searchRecursive(Node head, int key)
    {
        Node currNode = head;

        if(currNode==null) return -1;
        if(currNode.data==key) return 1;
        int res=searchRecursive(currNode.next,key);
        if(res==-1) return -1;
        else return res+1;
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
