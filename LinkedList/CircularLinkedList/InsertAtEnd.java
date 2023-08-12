package LinkedList.CircularLinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = head;
        head = insert(head,15);
        System.out.println(head.data);
        Node curr = head.next;
        while(curr!=head)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

    public static Node insert (Node head, int x)
    {
        Node newNode = new Node(x);
        if(head==null)
        {
            newNode.next=newNode;
            head = newNode;
            return head;
        }
        Node curr = head.next;
         while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next = newNode;
        newNode.next=head;
        return head;
    }

    
}
/*
 * Efficient Solution : We can maintain a tail pointer to insert at end in Big O(N) time.
 * Or We can insert Node at head.next and swap the data and mark head.next as head;
 * 
 * Node insert(Node head , int x)
 * {
        Node newNode = new Node(x);
        If(head==null)
        {
            newNode.next = newNode;
            head = newNode;
            return newNode;
        }
        else
        {
            newNode.next=head.next;
            head.next = newNode;
            int t = head.data;
            head.data = newNode.data;
            newNode.data = t;
            head = newNode;
        }
        return head;
    }
    Insert at End in BigO(1) time.
*/