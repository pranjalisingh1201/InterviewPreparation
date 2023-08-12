//Remove Duplicates from elements in a sorted linked list in java.
/*
 * Input : 10->20->20->30->30->30
 * Output : 10->20->30
 * 
 * Input : 5->10->15->20
 * Ouput : 5->10->15->20
 * 
 * Input : null
 * Output : null
*/
/*
 * if next node is not same just move curr to next node.
 * else move curr.next to next to next node.
*/
public class RemoveDuplicates {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);

        head = removeDuplicates(head);

        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node removeDuplicates(Node head){
        Node curr = head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
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