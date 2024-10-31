import java.util.*;
class kk{
    public static void main(String[] args){
        String s = "abc";
        String res = "";
        List <String> l = new ArrayList<>();
        subseq(s,res,l);
        System.out.println(l.toString());
        
        
    }
    
    static void subseq(String s, String res, List<String> l){
        if (s.isEmpty()){
            // System.out.println(res);
            l.add(res);
            
            return;
        }
        
        char ch = s.charAt(0);
        
        subseq(s.substring(1),res+ch,l);
        subseq(s.substring(1),res,l);
    }
}
