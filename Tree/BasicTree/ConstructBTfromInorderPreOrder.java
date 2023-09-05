//Contruct Binary Tree from Preorder and Inorder traversal.
/*
 * Given question : 
 * 
 * We have inorder array and preorder array.
 * 
 * Inorder : [40,20,50,10,60,30] - Left,Root,Right
 * 
 * Preorder : [10,20,40,50,30,60] - Root,Left,Right
 *              |
 *              |
 * Here we know this 10, is the root of the tree as the first node in preorder is always root.
 * 
 * Hence , In Inorder -  [40,20,50,10,60,30]
 *                         _______
 *                             |
 * These nodes represent left side of the tree as this is the left part before root 10.
 * 
 *                          10
 *                          /
 *                      40,20,50
 * 
 * Now In Inorder -  [40,20,50,10,60,30]
 *                                _____
 *                                   |
 * These nodes represent right side of the tree as this is the right part after root 10.
                                10
 *                          /       \
 *                      40,20,50    60,30
 * 
 * 
 * Now we have 2 sub problems left tree and right tree.
 * 
 * To constuct these two trees we have to resolve the 2 sub problems.
 * 
 * So the tree has :
 * 
 *                              10
 *                          /       \
 * Inorder                40,20,50    60,30
 * Preorder               20,40,50    30,60
 * 
 * Now we can say 20 is the root from preorder and from inorder we have 40 to the left of root 20 and right is 50
 * Hence 20 is the root , 40 is left child and 50 is right child.
 * 
 *                              10
 *                          /       \
 *                          20    60,30
 *                        /   \
 *                      40    50
 * 
 * Same for right , first node in preorder is root hence 30 is root and in inorder left to root 30 is 60 which is the left child.
 * 
 * Hence 30 is root and 60 is left child.
 *                              10
 *                          /       \
 *                          20      30
 *                        /   \      /
 *                      40    50     60
 */
public class ConstructBTfromInorderPreOrder {
    
}
