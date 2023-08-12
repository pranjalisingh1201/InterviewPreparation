package LinkedList.CircularLinkedList;

// Print all the Elements of Circular Linked List

public class Traverse{

    public static void main(String [] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        if(head==null) System.out.println("");
        else{
        Node curr = head.next;
        System.out.println(head.data);
        while(curr!=head)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

