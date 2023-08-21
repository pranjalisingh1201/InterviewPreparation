package Tree.BasicTree;

//Maximum in binary tree
/*
 * Input :          10
 *                /    \ 
 *              30      40
 *            /         /   \
 *           80        60   20
 *             \
 *              70
 * 
 * Output : 80
 * 
 * Input :      30
 *              /
 *             20
 *            /
 *          40
 * 
 * Ouput : 40
 * 
 * Input : null
 * output : minus infinite
 * 
 * Input :      50
 *             /     \
 *          40         80
 * 
 * Output : 80 
*/
public class MaxNodeinBTree {
    public static void main(String[] args) {
        /*
         *          20
         *          /   \
         *         80    30
         *                / \
         *               40   50
        */
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right =  new Node(50);
        int max = getmax(root);
        System.out.println(max);
    }

    public static int getmax(Node root)
    {
        if(root ==null) return Integer.MIN_VALUE;
        return Math.max(Math.max(getmax(root.left),getmax(root.right)),root.key);
    }

}
