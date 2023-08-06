// Sorted Insert in a linked list in java.
/*
 * Input : head->10->20->30->40 and x=25
 * Output : head->10->20->25->30->40
 * 
 * Input : head->10->25 and x = 5
 * Output : head->5->10->25
 * 
 * Input : head->10->20 and x = 30
 * Output : head->10->20->30
 * 
 * Input : Null and x=10
 * Output : 10
*/
/*
 * Time Complexity: Theta(n)
 * Space Complexity: O(1)
*/
public class InsertInSorted {

    public static void main(String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int data = 5;
        head = sortedInsert(head, data);

        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static Node sortedInsert(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head==null) return newNode;
        if(head.data>data) 
        {
            newNode.next=head;
            head = newNode;
        }
        else{
        Node currNode = head;
        for(int i=1;currNode.next!=null && currNode.next.data<data;i++)
            currNode=currNode.next;
        newNode.next=currNode.next;
        currNode.next=newNode;
        }
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
