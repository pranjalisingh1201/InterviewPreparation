//Serialize and De-Serialize Binary Tree

/*
 Serialize Function takes root as a parameter and returns a String.
 De-Serialize Function takes String as a parameter and returns a root of the tree.

 We can solve this ques by any traversal method.

 We will be following level order traversal here.

 Here , the Tree has : 

                          1
                        /   \
                        2   13
                     /  \   /   \
            null-    X  X   4   5
                            / \  / \
                            X X  X  X - null

    Level order traversal string : 1,2,13,#,#,45,#,#,#,#,
    This is the serialize step.

    Now to de-serialize this String : 
    -----------------------------------

    1) Take the first element in the String ,
        put that into the queue and create a node of the same.
    2) Once u iterate through the queue element (1).
        The left of 1 will be next char in the string - 2
        create a node to the left of the root for 2 and Insert 2 in the queue.
    3) Then right of the tree will be next char in the string which is 13.
        Create a node for 13 to the right of the root and insert it in the queue.
    
    Now when we iterate through the queue we have 2 as root.
    1) Next char is # which is null so left of 2 will be null.
    2) Next char is also # so right of 2 will be null as well.

    Now when we iterate through the queue we have 13 as root.
    1) Next char in String is 4 so Create a node left to 13 which is 4.
        insert 4 into the queue.
    2) Next char in the String is 5 so Create a node right to 13 which is 5.
        Insert 5 into queue.
    
    Now when we iterate through queue we have 4 
    1) Next char is # So left of 4 will be null.
    2) Next char is # So right of 4 will be null.

    Now when we iterate through queue we have 5 
    1) Next char is # So left of 5 will be null.
    2) Next char is # So right of 5 will be null.
    

    Return the root node .

*/

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeTree {

    public String serialize(TreeNode root)
    {
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            if(node==null)
            {
                res.append("n ");
                continue;
            }
            res.append(node.data+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }
    public TreeNode deserialize (String data)
    {
        if(data=="") return null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        String [] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for(int i=1;i<values.length;i++)
        {
            TreeNode parent = q.poll();
            if(!values[i].equals("n "))
            {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if(!values[i+1].equals("n "))
            {
                TreeNode right = new TreeNode(Integer.parseInt(values[i+1]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
    
}

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data=data;
    }
}