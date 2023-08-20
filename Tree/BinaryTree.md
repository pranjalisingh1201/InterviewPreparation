## Binary Tree

- In Binary Tree, Every node has at-most two children or degree of every node is at-most two.
- So a node can have 0,1,2 children.
- Each node has 3 items : Left reference,Key,Right reference.

### Pictorial Representation of Binary Tree

```text

                |30|
               /    \
          /             \
        |40|null        |50|
      /            /           \
null|70|null null|60|null  null|80|null
```

### Java Representation of Binary Tree

```java
class Node
{
    int key;
    Node left;
    Node right;
    Node(int data)
    {
        this.key = data;
    }
}
class Test
{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.rigt = new Node(30);
        root.left.left = new Node(40);
    }
}
```

```text
Note: If root == null then tree is empty.
```

### Breadth First (Level Order)

- Visit root then left child then right child.
- Level wise print all elements fron left tot right from top to bottom.

### Depth First

- Inorder   -> (left root right)
- Preorder  -> (root left right)
- Postorder -> (left right root)

```text
Note : left means left subtree and right means right subtree.
```

#### Recursive

- Traverse Root
- Traverse Left Subtree
- Traverse Right Subtree

```text
Note : We traverse the left subtree before then right subtree.
```

##### Write Inorder, Preorder, Postorder traversal of this tree

```text

                |10|
               /    \
          /             \
        |20|           null|30|
      /         \                 \
null|40|null    |50|         null|60|null
            /         \                 
        null|70|null null|80|null
```

- Inorder - 40,20,70,50,80,10,30,60(left,root,right)
- Preorder - 10,20,40,50,70,80,30,60(root,left,right)
- Postorder - 40,70,80,50,20,60,30,10(left,right,root)
