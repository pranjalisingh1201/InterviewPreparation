
/*
 * 
 * Diameter of a Binary Tree:
 * ------------------------------------
 * 
 * Diameter of a Binary Tree is Longest Path between any two nodes.
 * This path can pass through root node or it does not need to pass via root.
 *   
 *            1
 *        2//  \\3
 *         2     3   Hence path from 4 to 3 is longest : 3
 *      1// \
 *      4   5
 * 
 * 
 *                  1
 *                /   \
 *                2     3  Hence the path from 6 to 9 is longest : 6 
 *                    3//  \\4
 *                      4    7
 *                    2||     \\ 5   
 *                      5       8
 *                    1||       \\6
 *                      6         9  
 * 
 * Naive Approach 
 * -------------------
 * 
 *    Find left height and right height of each node and add them and max hieght will be the longest path.
 *    
 *                  1 (1+4) = 5
 *                /   \
 *        (0+0) =0 2     3 (3+3) =6 
 *                    3//  \\4
 *            (2+0)=2  4    7 (0+2) = 2
 *                    2||     \\ 5   
 *            (1+0)=1  5       8 (0+1) = 1
 *                    1||       \\6 
 *            (0+0)=0  6         9 (0+0) = 0
 * int findmax(node)
 * {
 *      if(node==null) return 0;
 *      lh = findleft(node.left);
 *      rh = findleft(node.right);
 *      maxi = Math.max(maxi,lh+rh);
 *      findmax(node.left);
 *      findmax(node.right);
 * }   
 * Time: 0(n^2)
 * 
 * 
 * Efficient Approach 
 * ----------------------
 * 
 * Use hieght method.
 * 
 * int findmax(node,maxi)
 * {
 *      if(node==null) return 0;
 *      lh = findmax(node.left,maxi);
 *      rh = findmax(node.right,maxi);
 *      maxi = Math.max(maxi,lh+rh);
 *      return 1+Math.max(lh,rh);
 * }     
*/
public class DiameterOfBinaryTree {
    
}
