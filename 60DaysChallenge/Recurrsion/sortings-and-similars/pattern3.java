class kk{
    public static void main(String args[]){
        int r = 3;
        int c = 0;
        triangle(r,c);
    }
    
    static void triangle(int r, int c){
        if (r==0){
            return;
        }
        
        if (c<r){
            System.out.print("* ");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,c = 0);
        }
    }
}
