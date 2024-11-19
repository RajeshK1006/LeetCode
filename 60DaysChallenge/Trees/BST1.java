class  Node{
    int val;
    Node left;
    Node right;
    
    public Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
class Main{
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,11,7,8,5,6,9,0};
        
        
        Node result = null;
        for(int i =0;i<arr.length;i++){
            result = createBST(result,arr[i]);
        }
        
        inorder(result);
    }
    
    public static Node createBST(Node root, int val){
        if (root == null){
            return new Node(val);
        }
        
        if(root.val>val){
            root.left = createBST(root.left,val);
        }
        else{
            root.right = createBST(root.right,val);
        }
        return root;
    }
    
    static void inorder(Node root){
        if (root == null){
            return ;
        }
        
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    } 
}
