class Solution {
    public String longestPalindrome(String s) {
       StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
        for(int j = i; j < s.length(); j++){
            String str = s.substring(i, j + 1);

            if(isPallindrome(str)){
                if(str.length() > sb.length()){
                    sb.setLength(0);
                    sb.append(str);
                }
            }
        }
    }

    return sb.toString();
    }
    public boolean isPallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}