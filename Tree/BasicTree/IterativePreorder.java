package Tree.BasicTree;

import java.util.Stack;

//Iterative Preorder Traversal
/*
 *          10
 *          / \
 *         20   30
 *      /    \  /
 *     40    50 60
 * 
 * Initially : stack = 10
 * 
 * Iteration 1 of Outer Loop
 * ----------------------------------
 * 
 * 10 -> 30,20
 * Output : 10
 * curr = ref(10)
 * 
 * Iteration 2
 * -------------
 * stack - 30,50,40
 * Output : 10,20
 * curr = ref(20)
 * 
 * Iteration 3
 * -------------------
 * stack - 30,50
 * Output : 10,20,40
 * curr = ref(40)
 * 
 * Iteration 4
 * -------------
 * stack - 30
 * Output : 10,20,40,50
 * curr = ref(50)
 * 
 * Iteration 5
 * -------------
 * stack - 60
 * Output : 10,20,40,50,30
 * curr = ref(30)
 * 
 * Iteration 5
 * -------------
 * stack - empty
 * Output : 10,20,40,50,30,60
 * curr = ref(60)
 * 
 * Hence ,stack is empty we get out of the loop.
 * 
 * Time and Space : Big O(n)
 * 
*/
public class IterativePreorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.left = new Node(60);
        preorderspace(root);
    }

    public static void preorder (Node root)
    {
        if(root==null) return;//if Node is null we return
        Stack<Node> st = new Stack<Node>();//create a stack
        st.push(root);//push root
        while(st.isEmpty()==false)//while the stack is having root or any other node, if we have empty stack means we completed traversal of the tree and reached its end.
        {
            Node curr = st.pop();
            System.out.println(curr.key);
            if(curr.right!=null)//right first because top should be left and right should be below left in the stack.
                st.push(curr.right);
            if(curr.left!=null)//left should be top and should be printed in the next iteration.
                st.push(curr.left);
        }
    }
    public static void preorderspace (Node root)
    {
        if(root==null) return;
        Stack<Node> st = new Stack<Node>();
        Node curr = root;
        while(curr!=null||st.isEmpty()==false)
        {
            while(curr!=null)
            {
                System.out.println(curr.key);
                if(curr.right!=null)
                st.push(curr.right);
                curr=curr.left;
            }
            if(st.isEmpty()==false)
            curr=st.pop();
        }
     }
}
/*
 * Steps for Space Optimized Solution
 * ---------------------------------------
 * 
 *              10
 *              / \
 *             20   30
 *           /   \   /
 *          40   50 60
 *        /   \
 *      70      80
 * 
 * 
 1) Create an empty stack st.
 2) st.push(root);
 3)curr=root;
 4) while(st is not empty)
 {
    while(curr is not empty)
    {
        print(curr's key)
        if(curr's right is not null)
                st.push(curr's right)
        curr = curr's left;
    }
    curr=st.pop;
 }

 * 
 * Initially : curr = ref(10)
 *             stack = empty
 * 
 * Iteration 1 of Outer Loop
 * ----------------------------------
 * 
 * empty -> 30,50,80 -> 30,50
 * Output : 10,20,40,70
 * curr = ref(80)
 * 
 * Iteration 2
 * -------------
 * stack - 30
 * Output : 10,20,40,70,80
 * curr = ref(50)
 * 
 * Iteration 3
 * -------------------
 * stack - empty
 * Output : 10,20,40,70,80,30
 * curr = ref(30)
 * 
 * Iteration 4
 * -------------
 * stack - empty
 * Output : 10,20,40,70,80,30,60
 * curr=null
 * 
 * 
 * Hence , curr==null and stack is also empty we get out of the loop.
 * 
 * Time : Big O(n)
 * Space : Big O(h)
*/
