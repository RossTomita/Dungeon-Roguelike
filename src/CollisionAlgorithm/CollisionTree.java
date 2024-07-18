package CollisionAlgorithm;

public class CollisionTree {

    Node root;

    // Constructor
    public CollisionTree() {
        root = null;
    }

    // A utility function to insert
    // a new node with given key in BST
    public Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(key);
            return node;
        }

        // Otherwise, recur down the tree
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);

        // Return the (unchanged) node pointer
        return node;
    }

    // Utility function to search a key in a BST
    public Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;

        // Key is greater than root's key
        if (root.key < key)
            return search(root.right, key);

        // Key is smaller than root's key
        return search(root.left, key);
    }


    //
    public void remove(Node root, int key) {

    }







}
