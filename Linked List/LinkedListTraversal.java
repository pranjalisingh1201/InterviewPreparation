//Traverse Linked List and Print all the nodes.
/*
 * Head Reference -> 10|ref(20)-> 20|ref(30) -> 30|ref(40) -> 40|ref=null
                        node1       node2           node3       node4

    Time Complexity : 0(n) where n is no of nodes.
*/
public class LinkedListTraversal {
    public static void main (String [] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Node node = head; // Start with head.
        while(node!=null) //Check if Node is not null.
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

/*
 * class LinkedListTraversal{
	
	public static void main(String [] args)
	{
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printlist(head);
	}
    public static void println(Node head)
	{
		Node currentNode = head;
        while(currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
	}

}

class Node{
	int data;
	Node next; // Self Referencial Structure - Has reference of self type.
	Node(int data)
	{
		this.data = data;
		this.next = null;//This is optional.
	}
}
*/