class Solution {
    public int[] plusOne(int[] digits) {
            List<Integer> arr = new ArrayList<>();
            int c = 1;
            for(int i=digits.length -1 ;i>=0;i--){
                if (c>0){
                    digits[i] += c;
                }

                arr.add(digits[i]%10);
                c = digits[i] / 10;
            }

            if (c>0){
                arr.add(c);
            }
            int[] res= new int[arr.size()];

            for(int i=arr.size()-1;i>=0;i--){
                res[arr.size()-1-i] = arr.get(i);
            }

            return res;
    }
}