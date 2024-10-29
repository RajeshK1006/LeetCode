class Main{
    public static void main(String args[]){
        int[] arr = new int[] {1,2,3,2,13};
        int l = 0;
        int r = arr.length -1;
        System.out.println(helper(arr,l,r));
    }
    
    static Boolean helper(int[] arr,int l, int r){
        if (l>r){
            return  true;
        }
        if(arr[l] != arr[r]){
            return false;
        }
        else{
            return helper(arr,l+1,r-1);
        }
    }
}

// for numbber use the reverse function and compare then with the reverse (n) to get the output 
// for strings use the 2 pointers approach via above program using recurrsion 
