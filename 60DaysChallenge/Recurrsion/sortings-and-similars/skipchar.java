class kk{
    public static void main(String args[]){
        char key = 'a';
        String s = "baccabbaad";
        String res = "";
        int l = 0;
        int r = s.length();
        
        System.out.println(skipchar(s,key,l,r,res));
    }
    
    static String skipchar(String s,char key, int l , int r, String res){
        if (l==r){
            return res;
        }
        
        
        
        if (s.charAt(l) !=key){
            res += s.charAt(l);
            
        }
        
        return skipchar(s,key,l+1,r,res);
    }
}
