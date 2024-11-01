import java.util.*;
class kk{
    public static void main(String[] args){
        String s = "abc";
        String res = "";
        List <String> l = new ArrayList<>();
        
        helper(s,l,res);
        Collections.sort(l);
        System.out.println(l.toString());
    }
    
    static void helper(String s, List<String> l, String res){
        if (s.isEmpty()){
            l.add(res);
            return;
        }
        
        char ch = s.charAt(0);
        
        for(int i=0;i<=res.length();i++){
            String f = res.substring(0,i);
            String se = res.substring(i);
            
            helper(s.substring(1),l,f+ch+se);
            // helper(s.substring(1),l,f+ch+se+ (int) ch);
        }
        
        
    }
}
