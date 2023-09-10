
// Level Order Traversal or Breadth First Search of Binary Tree.
/*
 * Input :          10     Print level 4
 *                 /   \
 *                20     30  Print level 3
 *              /   \      \
 *              8     7     6 Print level 2
 *                    / \
 *                    9  15   Print level 1
 * Output : 10,20,30,8,7,6,9,15
 * 
 * Input :          3
 *                 /
 *                4
 *                  \
 *                   5
 * Output : 3,4,5
 * 
 * Input :      8   
 *                \
 *                  6
 *                 /  \
 *                2     4
 *                     /
 *                    3
 * 
 * Output : 8,6,2,4,3
*/
import java.util.*;
public class LevelOrderTraversal {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        printBFS(root);
    }

    public static void printBFS(Node root)
    {
        if(root==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root); // Add root.
        while(q.isEmpty()==false)
        {
            Node curr = q.poll(); // assigns root to curr.
            System.out.println(curr.key);
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);

        }
    }
}

class Node{
    int key;
    Node left;
    Node right;
    Node(int key)
    {
        this.key = key;
    }
}
/*
 *              10
 *             /   \
 *            15    20
 *            /     /  \
 *           30     40  50
 *                  / \
 *                60    70
 * 
 * 1) First we create an empty queue.
 * 2) We add 10 to queue.   ->  10| | | | 
 * 3) Then we run a loop and take out this root 10 and print 10.  ->  10| | | |  -> print -> 10.
 * 4) Then add the children of curr 10 to queue. ->  15|20 | | | 
 * 5) Then we print 15 and enqueue its children. ->  20|30 | | | -> print -> 10,15
 * 6) Then we print 20 and enqueue its children. ->  30|40|50| | -> print -> 10,15,20
 * 7) Then we print 30 and enqueue its children. ->  40|50|  | | -> print -> 10,15,20,30
 * 8) Then we print 40 and enqueue its children. ->  50|60|70| | -> print -> 10,15,20,30,40
 * 9) Then we print 50 and enqueue its children. ->  60|70|  | | -> print -> 10,15,20,30,40,50
 * 10)Then we print 60 and enqueue its children. ->  70|  |  | | -> print -> 10,15,20,30,40,50,60
 * 11)Then we print 70 and enqueue its children. ->    |  |  | | -> print -> 10,15,20,30,40,50,60,70
 * 12) Now queue is empty , hence we get out of the while loop and program ends.
 * 
*/
// Time Complexity  : Enque takes 0(1) and deque takes 0(1) - > In total we have n nodes. Time - Big O(n)
// Space Complexity : Big O(W) width of tree, this W can go upto N and it can be 1 also.