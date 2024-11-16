class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BT{
    Node root;
    BT(){
        this.root = null;
    }
    
    
    void insert(int val){
        this.root  = inserttree(val, this.root);
    }
    
    private Node inserttree(int val,Node root){
        if(root==null){
            root = new Node(val);
            return root;
        }
        
        if(val<root.val){
            root.left = inserttree(val,root.left);
        }
        
        else if (val>root.val){
            root.right = inserttree(val,root.right);
    }
    
    return root;
    }
    
    void display(){
        int level = 0;
        displaytree(this.root,level);
        
    }
    
    void displaytree(Node root, int level){
        if (root == null){
            return ;
        }
        displaytree(root.right,level+1);
        
        for(int i=0;i<=level;i++){
            System.out.print("----------|");
        }
        System.out.println(root.val);
        
        displaytree(root.left,level+1);
    
    
    }
    
    void traverse(){
        // /DFsearrcheS in trees
        System.out.println("Traversal using inorder");
        inorder(this.root);
        System.out.println("Traversal using preorder");
        preorder(this.root);
        System.out.println("Traversal using postorder");
        postorder(this.root);
        
    }
    
    private  void inorder(Node root){
        if(root == null){
            return;
        } 
        
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    
    private void preorder(Node root){
        if(root==null){
            return ;
        }
        
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    
    
    private void postorder(Node root){
        if(root == null){
            return ;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
    
    void height(){
        int ans = findheight(this.root);
        System.out.println("the height of the given binary tree is " + ans);
    }
    
    private int findheight(Node root){
        if (root == null){
            return -1;
        }
        
        int left = findheight(root.left);
        int right = findheight(root.right);
        
        return Math.max(left,right) + 1;
        
        
    }
    
}

class Main{
    public static void main(String[] args){
        BT tree = new BT();
        tree.insert(54);
        tree.insert(32);
        tree.insert(56);
        tree.insert(43);
        tree.insert(21);
        
        tree.display();
        tree.traverse();
        
        tree.height();
    }
}
