class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=s.length()-1;
        while(s.charAt(left)==' '){
            left++;
        }
        while(s.charAt(right)==' '){
            right--;
        }
        StringBuilder sb = new StringBuilder(s);
        int start=0;
        int end=0;
        while(start<s.length()){
            while(end<s.length()&& sb.charAt(end)!= ' '){
                end++;
            }
            int i=start;
            int j=end-1;
            while(i<j){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
            start=end+1;
            end=end+1;
        }
        return sb.toString();
    }
}