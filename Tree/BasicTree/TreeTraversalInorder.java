// Tree Traversal - Inorder Preorder Postorder
/* Inorder : 
 * Output :20,10,40,30,50
 * Recursive Tree:
 * 
 *  inorder(10)
 *              inorder(20)
 *                          inorder(null)
 *                          SOP(20)
 *                          inorder(null)
 *              print(10)
 *              inorder(30)
 *                          inorder(40)
 *                                      inorder(null)
 *                                      SOP(40)
 *                                      inorder(null)
 *                          print(30)
 *                          inorder(50)
 *                                      inorder(null)
 *                                      SOP(50)
 *                                      inorder(null)
*/
// Time Complexity : O(n)
// Auxiliary Space : O(h) - 0(4)
/* Preorder : 
 * Output :10,20,30,40,50
 * Recursive Tree:
 * 
 *  preorder(10)
 *              print(10)
 *              preorder(20)
 *                          SOP(20)
 *                          preorder(null)
 *                          preorder(null)
 *              preorder(30)
 *                          print(30)
 *                          preorder(40)
 *                                      SOP(40)
 *                                      preorder(null)
 *                                      preorder(null)

 *                          preorder(50)
 *                                      SOP(50)
 *                                      preorder(null)
 *                                      preorder(null)
*/
// Time Complexity : O(n)
// Auxiliary Space : O(h) - 0(4)
/* Postorder : 
 * Output :20,40,50,30,10
 * Recursive Tree:
 * 
 *  postorder(10)
 *              postorder(20)
 *                          postorder(null)
 *                          postorder(null)
 *                          SOP(20)
 *              postorder(30)
 *                          postorder(40)
 *                                      postorder(null)
 *                                      postorder(null)
 *                                      SOP(40)
 *                          postorder(50)
 *                                      postorder(null)
 *                                      postorder(null)
 *                                      SOP(50)
 *                          print(30)
 *             print(10)
*/
// Time Complexity : O(n)
// Auxiliary Space : O(h) - 0(4)
public class TreeTraversalInorder {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        inorder(root);
        preorder(root);
        postorder(root);
    }

    public static void inorder(Node root)
    {
        //Left,root,right
        if(root!=null)//whether tree is empty
        {
            inorder(root.left);//to go to extreme left and print it .
            System.out.println(root.key);
            inorder(root.right); // then print its root right.
        }
    }

    public static void preorder(Node root)
    {
        //root,Left,right
        if(root!=null)//whether tree is empty
        {
            System.out.println(root.key);//print root.
            inorder(root.left);//to go to extreme left and print it .
            inorder(root.right); // then print its root right.
        }
    }

    public static void postorder(Node root)
    {
        //Left,right,root
        if(root!=null)//whether tree is empty
        {
            inorder(root.left);//to go to extreme left and print it .
            inorder(root.right); // then print its root right.
            System.out.println(root.key);//Print root.
        }
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
