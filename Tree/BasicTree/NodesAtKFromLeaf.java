// Print Nodes at Distance K
/*
 * Write a Function to find count of no of nodes from the leaf node At distance K.
 * 
 * Input : K = 2
 *                  
 *              1
 *            /   \
 *          2      3
 *       /    \    /   \
 *      4      5  6     7
 *                  \
 *                   8
 * 
 *  Output : 2
 * 
 * Nodes : from 4 the node at distance 2 is 1.
 *         from 5 the node at distance 2 is 1. 
 *         from 7 the node at distance 2 is 1. 
 *         from 8 the node at distance 2 is 3. 
 * 
 * 
 * Input :     1
             /
           3
          /
          5
        /  \
      7    8
             \
              9
K = 4
Output: 1
Explanation: from 9 the node at distance 4 is 1. 
            
*/
/*
 * 
 * Approach to print the unique elements.
 * -------------------------------------------
 * Step1:
 * -----------
 * Take an array and store the root in the array.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 
 * 
 * index = 0
 * 
 * Since it is not leaf node move to the next node.
 * 
 * Step2:
 * -----------
 * Move to the left of the node.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2
 * 
 * index = 0+1
 * 
 * Since it is not leaf node move to the next node.
 * 
 * Step3:
 * -----------
 * Move to the left of the node.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 4
 * 
 * index = 2
 * 
 * Since it is a leaf node index - k will be your element in the array.
 * 
 * Hence 2-2 = 0 So element = 1.
 * 
 * Now remove the leaf element from the array.
 * 
 * 1 | 2 |
 * 
 * Step4:
 * -----------
 * Move to the right of the node 2.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 5
 * 
 * index = 2
 * 
 * Since it is a leaf node index - k will be your element in the array.
 * 
 * Hence 2-2 = 0 So element = 1.
 * Since 1 is already printed how we can make this unique, we can use a hash set and print it and store and we can check if element exists or no.
 * Now remove the leaf element from the array.
 * 
 * 1 | 2 |
 * 
 * Step5:
 * -----------
 * Move to the right of the node 1.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 3
 * 
 * index = 2
 * 
 * Since it is not leaf node move to the next node.
 * 
 * Step6:
 * -----------
 * Move to the left of the node 3.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 3 | 6
 * 
 * index = 3
 * 
 * Since it is not leaf node move to the next node.
 * 
 * Step7:
 * -----------
 * Move to the left of the node 6.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 3 | 6 
 * 
 * index = 4
 * 
 * Since it is a leaf node index - k will be your element in the array.
 * 
 * Hence 4-2 = 2 So element = 3.
 * Since element is 1 we can use a hash set and print it and store and we can check if element exists or no next time.
 * Now remove the leaf element from the array.
 * 
 * 1 | 2 | 3 | 6
 * 
 * Step8:
 * -----------
 * Move to the right of the node 6.
 * Check if it is leaf node.
 * Store : 
 * 
 * 1 | 2 | 3 | 6 | 8
 * 
 * index = 4
 * 
 * Since it is a leaf node index - k will be your element in the array.
 * 
 * Hence 4-2 = 2 So element = 3.
 * Since element is 3 we can use a hash set and print it and store and we can check if element exists or no next time.
 * Now remove the leaf element from the array.
 * 
 * 1 | 2 | 3 | 6
 * 
*/

import java.util.ArrayList;
import java.util.HashSet;

public class NodesAtKFromLeaf {
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right = new Node(3);
            root.right.left = new Node(7);
            root.right.right = new Node(7);
            root.right.left.right = new Node(8);
            int val = printKDistantfromLeaf(root,2);
            System.out.println(val);
            for (Node i : hs)
            System.out.println(i.key+" ");
        }
    
    static HashSet<Node> hs = new HashSet<Node>();
    static int printKDistantfromLeaf(Node root, int K)
    {
        ArrayList<Node> arr = new ArrayList<Node>();
        printKDistantfromLeaf(root,K,arr);
        return hs.size();
    }
    static void printKDistantfromLeaf(Node root, int K,ArrayList<Node> arr)
    {
        if(root==null) return;
        arr.add(root);
        if(root.left==null && root.right == null)
        {
            if(arr.size()-1>=K)
            {
                hs.add(arr.get(arr.size()-1-K));
            }
        }
        printKDistantfromLeaf(root.left, K,arr);
        printKDistantfromLeaf(root.right, K,arr);
        arr.remove(arr.size()-1);
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
