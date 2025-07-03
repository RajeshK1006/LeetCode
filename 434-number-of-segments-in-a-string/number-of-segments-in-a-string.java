class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()) return 0;
        System.out.println(Arrays.toString(s.split("\s+")));
        return s.trim().split("\\s+").length;
    }
}