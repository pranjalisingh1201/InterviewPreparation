// Finding the lowest common ancestor in a binary tree.
/*
 *                  0                      level 0
 *              /       \ 
 *             /          \
 *            1              2              level 1
 *          /   \            /   \
 *         3    4           5      6        level 2
 *            /  \        /   \  /   \
 *           7    8      9    10 11   12`   level 3   
 *                      n1        n2
 * What is Lowest Common Ancestor (LCA):
 * -------------------------------------
 * Lowest(Closer to leaf) Node in the tree that has both n1 and n2 as descendents is called LCA of n1 and n2.
 *  
 * Eg : LCA(9,11) = 2
 * Path from root to N1 and root to N2 -(n1,n2) -   
 * n1 :  0->2->5->9
 * n2 :  0->2->6->11
 * 
 * Now find the node which are common in both the paths and is at the lowest level(as close as possible to the leaf):
 *  they are 0(level 0 ) and 2(level 1).
 * Hence the lowest node which is common in both the paths is 2.
 * Therefore the lowest common ancestor of 9 and 11 will be 2.
 * 
 * Eg : LCA(4,10) = 0
 * Path from the root to N1 and N2 - (n1,n2) - 
 * n1 :  0->1->4
 * n2 :  0->2->5->10
 * 
 * Now the common nodes in both the paths n1 and n2 is only 0 and the level is 0.
 * Therefore the lowest common ancestor is 0 (root) for these two nodes.
 * 
 * 
 * Eg : LCA(2,11) = 2
 * Path from the root to N1 nad N2 - (n1,n2) - 
 * n1 :  0->2
 * n2 :  0->2->6->11
 * Now the common nodes in both the paths are 0 and 2 where 2 itslef is an ancestor of node 11.
 * Hence the lowest common ancestor is 2.
 * 
 * When Ancestor is always present:
 *  Approach 1 : Find the root to te node paths and the last common node is the LCA.
 *  Approach 2 : Recursion : The node recieving True / Node from the children is the LCA.
 * 
 *                  ->(2) is answer.
 *             null 0   (2)                                
 *             /          \
 *      null 1              2 (2)             
 *          /   \            /   \
 *    null 3    4 null   (9)5      6(6)       
 *            /  \        /   \  /   \
 *    null 7 null 8 (9) 9 null 10 11   12
 * 
 * LCA(9,6) - 2
 * Time(O(n)) 
 * 
 * 
 * Note : if in the question we have stated that both p and q are present in the tree then if we get only P or Q and not the other node then we return the node we have.
 * That becomes the LCA of both the nodes.
 * 
 * For EG: LCA(9,2) - 2 , call doesnt reach till 9 it returns from 2.
 * 
 *       ->(2) is answer.
 *             null 0   (2)                               
 *             /          \
 *      null 1              2 (2)             
 *          /   \            /   \
 *    null 3    4 null      5      6       
 *            /  \        /   \  /   \
 *    null 7 null 8      9     10 11   12 
 * 
 * GFG Sol: 
 * Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root ==null || root.data==n1 ||root.data==n2) return root;
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		if(left==null)return right;
		else if(right==null) return left;
		else return root;
		
	}          
*/