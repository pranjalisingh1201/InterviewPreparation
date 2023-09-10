
//Size of Binary Tree
/*
 * Input :      10
 *            /    \
 *           80     70
 *          /   \       
 *          30  40      
 * 
 * Output : 5
 * 
 * Input :      80
 *              /
 *            70
 *           /
 *         60
 * Output : 3
 * 
 * Input :              80
 *                    /   \
 *                  30     40
 *                  /        \
 *                90          100
 *                             /
 *                            60
 * 
 * Output : 6
 * 
 * Input : Null
 * Output : 0
*/
public class SizeofTree {

    public static void main(String[] args) {
        /*
         *                10
         *              /   \
         *              20  30
         *            /   \     \ 
         *          40      50    60   
        */
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.right = new Node(60);
        int s = size(root);
        System.out.println(s);
    }

    public static int size(Node root)
    {
        if(root==null) return 0;
        return (size(root.left)+size(root.right))+1;
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
 * 
 * 
 *                10
 *              /   \
 *              20  30
 *            /   \     \ 
 *          40      50    60   
 * Recursion Tree
 * --------------------
 * 
 * size(10)-> (3+2)+1 = 6
 *          size(20) - return (1+1)+1 = 3
 *                  ->size(40) - return (0+0)+1 = 1
 *                             ->size(null) - return 0
 *                             ->size(null) - return 0
 *                  ->Size(50) - return (0+0)+1 = 1
 *                             ->size(null) - return 0
 *                             ->size(null) - return 0
 *          size(30) - return (0+1)+1 = 2
 *                   -size(null) - return 0
 *                   -size(60) - (0+0)+1 = 1
 *                             -> size(null) - return 0
 *                             -> size(null) - return 0  
 * 
 *                  
*/

// Time Complexity is Big O(n) , n os nodes
// Space Complexity is Big O(h) , h is height , in stack memory , first 10-20-40-null- it is processed like this.