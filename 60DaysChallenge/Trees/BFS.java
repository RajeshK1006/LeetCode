import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    
    public Node(int val){
        this.val =  val;
        this.left = null;
        this.right = null;
    }
    
}

class Tree{
    Node root;
    
    Tree(){
        this.root = null;
    }
    
    void insert(int val){
        this.root = getTree(this.root, val);
    }
    
    Node getTree(Node root,int val){
        if (root == null){
            return new Node(val);
        }
        
        if (val>root.val){
            root.right = getTree(root.right,val);
        }
        
        else if (val<root.val){
            root.left = getTree(root.left,val);
        }
        
        
        return root;
    }
    
    void displayTree(){
        display(this.root,0);
    }
    
    void display(Node root,int l){
        if (root == null){
            return;
        }
        
        display(root.right,l+1);
        for(int i=0;i<=l;i++){
            System.out.print("-");
        }
        System.out.print(">");
        System.out.println(root.val);
        display(root.left,l+1);
    }
    
    List<List<Integer>> bfs(List<List<Integer>> outer){
        if (this.root == null){
            return outer;
        }
        
        Queue<Node> q = new LinkedList<>();
        
        q.offer(this.root);
        
        
        while (!q.isEmpty()){
            int level = q.size();
            boolean l=true;
            List<Integer> inner = new ArrayList<>();
            for(int i=0;i<level;i++){
                Node curr = q.poll();
                
                inner.add(curr.val);
                
                if (l==true){
                
                if (curr.left != null){
                    q.offer(curr.left);
                }
                
                if (curr.right != null){
                    q.offer(curr.right);
                }
                l = !l;
                }
                else{
                    if (curr.right != null){
                    q.offer(curr.right);
                }
                if (curr.left != null){
                    q.offer(curr.left);
                }
                }
            }
         
         outer.add(inner);   
            
        }
        
        return outer;
        
    }
}

class Main{
    public static void main(String[] args){
        int[] arr = new int[] {10, 5, 15, 3, 7, 12, 18, 1, 4, 6, 8};

        
        Tree obj = new Tree();
        
        for(int i = 0; i<arr.length;i++){
            obj.insert(arr[i]);
        }
        
        
        obj.displayTree();
        
        List<List<Integer>> outer = new ArrayList<>();
        System.out.println(obj.bfs(outer));
    }
}
