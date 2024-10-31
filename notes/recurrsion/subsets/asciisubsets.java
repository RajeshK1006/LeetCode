import java.util.*;
class kk{
    public static void main(String[] args){
        String s = "abc";
        String res = "";
        List <String> l = new ArrayList<>();
        subseqascii(s,res,l);
        System.out.println(l.toString());
        
        
    }
    
    static void subseqascii(String s, String res, List<String> l){
        if (s.isEmpty()){
            // System.out.println(res);
            l.add(res);
            
            return;
        }
        
        char ch = s.charAt(0);
        
        subseqascii(s.substring(1),res+ch,l);
        subseqascii(s.substring(1),res+(int)ch,l);
        subseqascii(s.substring(1),res,l);
    }
}
