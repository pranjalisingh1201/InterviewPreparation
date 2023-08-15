package LinkedList.CircularDoublyLinkedList;

public class InsertAtBeginAndEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = head;
        head.prev = node2;
        head = insertAtBegin(head,5);
        head = insertAtEnd(head,5);
        Node curr = head.next;
        System.out.println(head.data);
        while(curr!=head)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public static Node insertAtBegin(Node head,int data)
    {
        Node newNode = new Node(data);
        newNode.prev = head.prev;
        newNode.next= head;
        head.prev.next = newNode;
        head.prev = newNode;
        head = newNode;
        return newNode;
    } 

    public static Node insertAtEnd(Node head,int data)
    {
        Node newNode = new Node(data);
        newNode.prev = head.prev;
        newNode.next= head;
        head.prev.next = newNode;
        head.prev = newNode;
        return head;
    } 
}

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        prev=next=null;
    }
}

