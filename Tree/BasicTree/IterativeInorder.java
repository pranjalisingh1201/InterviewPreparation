
// Iterative Inorder Traversal
/*
 *          10
 *          / \
 *         20   30
 *      /    \
 *     40    50
 * 
 * Initially : curr = ref(10)
 *             stack = empty
 * 
 * Iteration 1 of Outer Loop
 * ----------------------------------
 * 
 * empty -> 10 ->10,20 -> 10,20,40 - > 10,20
 * Output : 40
 * curr = null
 * 
 * Iteration 2
 * -------------
 * stack - 10
 * Output : 40,20
 * curr = ref(50)
 * 
 * Iteration 3
 * -------------------
 * stack - 10-> 10,50-> 10
 * Output : 40,20,50
 * curr = null
 * 
 * Iteration 4
 * -------------
 * stack - empty
 * Output : 40,20,50,10
 * curr=ref(30)
 * 
 * Iteration 5 
 * -------------
 * stack - empty -> 30 - >empty
 * Output : 40,20,50,10,30
 * curr=null
 * 
 * Hence , curr==null and stack is also empty we get out of the loop.
 * 
 * 
*/
import java.util.*;
public class IterativeInorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right =  new Node(30);
        inorder(root);
    }
    public static void inorder(Node root)
    {
        Stack<Node> st = new Stack<Node>();// create empty stack.
        Node curr = root;
        while(curr!=null || st.isEmpty()==false)
        {
            while(curr!=null)//go to extreme left node and insert nodes in stack
            {
                st.push(curr);
                curr = curr.left;
            }
            //when curr becomes null , pop element and assign in the curr ref.
            curr = st.pop();
            System.out.println(curr.key);//print top of the stack.
            curr=curr.right;// make curr to point right of the top node.
        }
    }
}
//Time Complexity : Big O(n)
//Space Complexity : Big O(h)