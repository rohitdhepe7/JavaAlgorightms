package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    //create a binary root node first
    BinaryNode root;

    //initialize root to null value


    /**
     * Empty constructor to initialize root node as null
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * a helper method to insert a node in a binary tree
     * @param currentNode node created to add it in the binary tree
     * @param value value of the node
     * @return BinaryNode
     */
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.val = value;
            //System.out.println("The node is successfully inserted in the binary tree");
            return newNode;
        } else if (value <= currentNode.val) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    /**
     * it will insert a node to a binary tree
     * @param value integer value of the node
     */
    void insert(int value) {
        root = insert(root, value);
    }

    /**
     * the pre-order traversal will start from the root node to left node to right node
     * @param node a root node to start the traversal
     */
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");//printing out the root node first
        preOrder(node.left);// continue to print the left node
        preOrder(node.right);//continue to print the right node
    }


    /**
     * the in-order traversal will start from the left node to the root
     * and to the right node
     * @param node a root node to start the traversal
     */
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    /**
     * the post-order traversal will start from the left node to the right node
     * and to the root
     * @param node a root node to start the traversal
     */
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    /**
     * traverse through every level of the binary tree
     * use Queue DS
     */
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove(); //removes the first element from the queue
            System.out.print(presentNode.val + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    /**
     * search for a given value inside a binary tree
     * @param node required to check the value is in the left or right subtree
     * @param value value to be searched
     * @return a binary node with the found value
     */
    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("value " + value + " not found in the given BST");
            return null;
        }else if (node.val == value) {
            System.out.println("value " + value + " found in BST");
            return node;
        }else if (value < node.val) { //look into the left subtree
            return search(node.left, value);
        }else {
            return search(node.right, value);
        }
    }


    /**
     * @return successor node which is a minimum value node
     * present in the right of the root node
     */
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }


    /**
     * 3 cases to consider while deleting a node from a binary tree
     * Case 1. The node to be deleted is a leaf node
     * Case 2. The node has one child
     * Case 3. The node has two children
     * @param root node to start from
     * @param value - value to be deleted
     * @return a deleted node
     */
    public BinaryNode delete(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("The value not found in BST");
            return root;
        }

        if (value < root.val) {
            root.left = delete(root.left, value);
        }else if (value > root.val) {
            root.right = delete(root.right, value);
        }else {
            // check if current node has two children
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.val = minNodeForRight.val;
                root.right = delete(root.right, minNodeForRight.val);
            }else if (root.left != null) {
                root = root.left;
            }else if (root.right != null) {
                root = root.right;
            }else {
                root = null;
            }
        }
        return root;
    }

    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}
