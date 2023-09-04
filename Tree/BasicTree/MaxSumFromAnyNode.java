//Maximum path sum from any node
/*
 *          -10
 *          /   \ 
 *         9     20
 *              /   \
 *              15  7
 * 
 * Path : We start from node A and go to node B is called a path.
 * In a path all nodes should be traversed only once.
 * 
 * Approach 
 * ----------
 * 
 * We can find [val +(maxleft +maxright)] for each node and maximum sum from eachnode is the answer.
 * 
 * int maxPath(node)
 * {
 *          if(node==null) return 0;
 *          leftsum = maxPath(node.left);
 *          rightsum = maxPath(node.right);
 *          return node.data + Math.max(leftsum,rightsum);// like in height we did 1+(lh+rh)
 * 
 * }
*/
public class MaxSumFromAnyNode {

    int maxi = Integer.MIN_VALUE;
    //Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node)
    {
        //your code goes here
        help(node);
        return maxi;
    }
    int help(Node node)
    {
        //your code goes here
        if(node==null) return 0;
        int lefts = Math.max(0,help(node.left));
        int rights = Math.max(0,help(node.right));
        maxi = Math.max(maxi,lefts+rights+node.data);
        return node.data + Math.max(lefts,rights);
    }
}

