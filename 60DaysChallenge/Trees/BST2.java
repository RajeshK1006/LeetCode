import java.util.*;
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
        System.out.println();
        caller(result,9);
        
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
    
    static void caller(Node root, int val){
        Node node = null;
        node = delete(root,val);
        inorder(node);
    }
    
    static Node delete(Node root,int val){
        if (root.val>val){
            root.left = delete(root.left,val);
        }
        else if(root.val<val){
            root.right = delete(root.right,val);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            int value = minimum(root.right); 
            root.val = value;
            root.right = delete(root.right,root.val);
            
        }
        
        return root;
    }
    
    static int minimum(Node root){
        int minval = root.val;
        while (root.left != null){
            minval = root.left.val;
            root = root.left;
        }
        
        return minval;
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
