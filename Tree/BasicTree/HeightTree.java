

// Height of a Binary Tree
/*
 * Height of a binary tree is maximum number of node to a leaf path.
 * 
 * Input :  10
 *          / \
 *         8   30
 *              \
 *              50 
 *             /
 *            70 // Max of left path to root is 4 nodes and right is two nodes (max no of nodes) = 4.
 * Output : 4
 * 
 * Input : 10
 * Output : 1
 * 
 * Input : null
 * Output : 0
 * 
 * Input :       30
 *              /   \
 *             40   60
 *            /
 *          70
 *          /
 *        80
 * Output : 4 - We have two paths to root node. One path has 4 nodes and another has 1 node.
 *              We take the max of two.
 * 
 * Input : 10
 *          \
 *           20
 *             \
 *              30
 * 
 * Output : 3
 * 
 * 
 * Note : There is one more convention for height where we count the max no of edeges between root and lead node.
*/
public class HeightTree
{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int height = height(root);
        System.out.println(height);
    }

    public static int height(Node root)
    {
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

}

class Node
{
    int key;
    Node left;
    Node right;
    Node(int key)
    {
        this.key = key;
    }
}
/*
 * Height of Binary Tree
 * ---------------------
 * 
 * Recursion Tree:
 * 
 * height(10) - max(1,2)+1 = 3 --> output
 *          height(8)- max(0,0)+1 = 1
 *                  height(null) - 0 
 *                  height(null) - 0 
 *          height(30)- max(1,1)+1 = 2
 *                    height(40)- max(0,0)+1
 *                              height(null) - 0
 *                              height(null) - 0
 *                    height(50)- max(0,0)+1 = 1
 *                              height(null) - 0
 *                              height(null) - 0
*/

// Time Complexity : O(n) for n nodes| for one node- O(1)
// Space Complexity : O(h)|O(h+1)
