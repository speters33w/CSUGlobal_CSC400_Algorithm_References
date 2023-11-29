package edu.csuglobal.csc400.sandbox;

public class Node {

    int data;
    int rightCount;
    int leftCount;

    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        this.rightCount = this.leftCount = 0;
        this.left = this.right = null;
    }

    // Function for inorder Traversal of tree.
    static void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");  //todo replace with a StringBuilder
            inorder(root.right);
        }
    }

    // Function to check whether the given
    // Binary tree is a perfect binary tree
    // using the no. of nodes in tree.
    static boolean isPBT(int count)
    {
        count = count + 1;

        // Loop to check the count is in
        // the form of 2^(n-1)
        while (count % 2 == 0)
            count = count / 2;
        return count == 1;
    }

    // Recursive function to insert
    // elements in a binary tree
    static Node insert(Node root, int data)
    {

        // Condition when root is NULL
        if (root == null) {
            return new Node(data);
        }

        // Condition when count of left subtree
        // nodes is equal to the count
        // of right subtree nodes
        if (root.rightCount == root.leftCount) {
            root.left = insert(root.left, data);
            root.leftCount += 1;
        }

        // Condition when count of left subtree
        // nodes is greater than
        // the right subtree nodes
        else if (root.rightCount < root.leftCount) {

            // Condition when left subtree is
            // Perfect Binary Tree then Insert
            // in right subtree.
            if (isPBT(root.leftCount)) {
                root.right = insert(root.right, data);
                root.rightCount += 1;
            }

            // If Left subtree is not Perfect
            // Binary Tree then Insert in left subtree
            else {
                root.left = insert(root.left, data);
                root.leftCount += 1;
            }
        }
        return root;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = {15, 10, 20, 8, 12, 16, 25};
        int size = 7;
        Node root = null;

        // Loop to insert nodes in
        // Binary Tree in level order Traversal
        for (int i = 0; i < size; i++)
            root = insert(root, arr[i]);
        inorder(root);
    }
}
