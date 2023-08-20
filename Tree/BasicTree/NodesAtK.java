package Tree.BasicTree;
// Print Nodes at Distance K
/*
 * Input : K=2
 *              10
 *            /   \
 *          20      30
 *       /    \       \
 *      40      50    70
 * 
 * Output : 40,50,70
 * 
 * Input : K=1
 *              10
 *              /
 *            20
 *           /
 *          30
 * 
 * Output : 20
 * 
 * Input : k=3
 *              10
 *            /   \
 *          6       8
 *                    \
 *                      7
 *                  /    \
 *                  11    12
 * 
 * Output : 11,12
 * 
 * Note : if K==0 the print root.
*/
public class NodesAtK {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        printNodesAtK(root,2);
    }

    public static void printNodesAtK(Node root, int K)
    {
        if(root==null) return;
        if(K==0)
        {
        System.out.println(root.key);
        }
        else
        {
            printNodesAtK(root.left, K-1);
            printNodesAtK(root.right, K-1);
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
