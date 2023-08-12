// Insert Node at a given postition in java.
/*
 * Input : head->10->30->50->70 and pos = 2 and data = 20. 
 * Output : head->10->20->30->50->70
 * 
 * Input : head->5->15->25->35 and pos = 5 and data = 10.
 * Output : head->5->15->25->35->10
 * 
 * Input : head->10->20 pos = 4 and data = 5.
 * Output : head->10->20
*/ 
public class InsertAtPosition {

    public static void main (String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(50);
        head.next.next.next = new Node(70);
        int pos = 2, data = 20;
        head = insertAtPosition(head,pos,data);

        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node insertAtPosition(Node head , int pos , int data)
    {
        if(pos==1)
        {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node newNode = new Node(data);
            Node currNode = head;
            for(int i=1 ; i<pos-2 && currNode!=null;i++)// we always need to traverse 2 times less than given position so it is pos-2.
                currNode = currNode.next;// for eg : to insert 20 at position 2 we are already at head we do not need to run the loop as pos-2 =0.and head.next is where we need to insert it so we are at correct position.
            if(currNode==null) return head;// If given position is more than size of ll. then we return ll as it is.
            else
            {
                newNode.next=currNode.next;
                currNode.next=newNode;
            }
        }
        return head;
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