class Node{
    int val; 
    Node left;
    Node right;
    
    public Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class AVL{
    Node root;
    
    public AVL(){
        root = null;
    }
    
    // Get the height of the node
    int getNodeHeight(Node root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(getNodeHeight(root.left), getNodeHeight(root.right));
    }
    
    // Get the balance factor of the node
    int Balanced(Node root){
        if (root == null){
            return 0;
        }
        return getNodeHeight(root.left) - getNodeHeight(root.right);
    }
    
    // Insert method
    void insert(int val){
        this.root = insertTree(this.root, val);  // Update root after insertion
    }
    
    // Insert helper method
    Node insertTree(Node root, int val){
        if (root == null){
            return new Node(val);  // Insert the new node
        }
        
        if (root.val > val){
            root.left = insertTree(root.left, val);  // Insert in left subtree
        }
        else if (root.val < val){
            root.right = insertTree(root.right, val);  // Insert in right subtree
        }
        else {
            return root;  // No duplicates allowed
        }
        
        // Get balance factor after insertion
        int balance = Balanced(root);
        
        // Left-Left (LL) case
        if (balance > 1 && val < root.left.val){
            return rightrotate(root);  // Right rotation to balance
        }
        
        // Left-Right (LR) case
        if (balance > 1 && val > root.left.val){
            root.left = leftrotate(root.left);  // Left rotate the left child
            return rightrotate(root);  // Right rotate the root
        }
        
        // Right-Right (RR) case
        if (balance < -1 && val > root.right.val){
            return leftrotate(root);  // Left rotation to balance
        }
        
        // Right-Left (RL) case
        if (balance < -1 && val < root.right.val){
            root.right = rightrotate(root.right);  // Right rotate the right child
            return leftrotate(root);  // Left rotate the root
        }
        
        return root;  // Return the (unchanged) node pointer
    }
    
    // Left rotation method
    public Node leftrotate(Node c){
        Node p = c.right;
        Node t2 = p.left;
        
        // Perform rotation
        p.left = c;
        c.right = t2;
        
        return p;  // Return the new root of the subtree
    }
    
    // Right rotation method
    public Node rightrotate(Node p){
        Node c = p.left;
        Node t2 = c.right;
        
        // Perform rotation
        c.right = p;
        p.left = t2;
        
        return c;  // Return the new root of the subtree
    }
    
    // Inorder traversal
    void inorder(){
        inorderTraverse(this.root);
    }
    
    // Helper method for inorder traversal
    void inorderTraverse(Node root){
        if (root == null){
            return;
        }
        
        inorderTraverse(root.left);  // Visit left child
        System.out.print(root.val + " ");  // Visit root node
        inorderTraverse(root.right);  // Visit right child
    }
    
    // Display tree structure
    void display(){
        int l = 0;
        displayTree(this.root, l);
    }
    
    // Helper method for displaying tree structure
    public void displayTree(Node root , int l){
        if (root == null){
            return;
        }
        
        displayTree(root.right, l + 1);  // Print right child
        for (int i = 0; i <= l; i++){
            System.out.print("---{");  // Print spaces for indentation
        }
        
        System.out.println(root.val);  // Print current node value
        
        displayTree(root.left, l + 1);  // Print left child
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30,40,35,34,345};
        
        AVL obj = new AVL();
        for (int i = 0; i < arr.length; i++) {
            obj.insert(arr[i]);  // Insert elements into the AVL tree
        }
        obj.display();  // Display tree structure
        System.out.println();
        obj.inorder();  // Print inorder traversal
    }
}


// ---{---{---{---{345
// ---{---{---{40
// ---{---{35
// ---{---{---{34
// ---{30
// ---{---{20
// ---{---{---{10

// 10 20 30 34 35 40 345 

// structure of AVL trees 
