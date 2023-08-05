//Simple Linked List representation in java.

class CreateLinkedList{
	
	public static void main(String [] args)
	{
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
	}
}

class Node{
	int data;
	Node next; // Self Referencial Structure - Has reference of self type.
	Node(int data)
	{
		this.data = data;
	}
}

/*
 * class CreateLL{
	
	public static void main(String [] args)
	{
		Node head = new Node(10); //Creating objects but the references are null from the constructor.
		Node node2 = new Node(20);
		Node node3 = new Node(30);

		Head Reference -> 10|ref(null) 20|ref(null) -> 30|ref=null
                    		node1       	node2           node3               


		head.next = node2;//Assigning References.
		node2.next = node3;

		Head Reference -> 10|ref(20)-> 20|ref(30) -> 30|ref=null
                    		node1       node2           node3               
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