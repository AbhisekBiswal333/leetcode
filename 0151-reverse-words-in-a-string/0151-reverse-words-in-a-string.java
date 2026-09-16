class Solution {
    public String reverseWords(String s) {
        //APPROACH-1
        // String trimmedStr = s.trim();
        // String[] newStr =trimmedStr.split("\\s+");
        // List<String> list = Arrays.asList(newStr);
        // Collections.reverse(list);
        // return String.join(" ",list);


    //APPORACH-2
        int l=0;
        int r=s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(l<s.length()&& s.charAt(l)==' '){
            l++;
        }
        while(r>=0 && s.charAt(r)==' '){
            r--;
        }

        while(l<=r){
            if(s.charAt(l)!=' '){
                sb.append(s.charAt(l));
            }else if(sb.charAt(sb.length()-1)!=' '){
                sb.append(s.charAt(l));
            }
            l++;
        }
        
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }

        int start=0;
        int end=0;
        while(start<sb.length()){
            while(end<sb.length()&&sb.charAt(end)!=' '){
                end++;
            }
             i=start;
             j=end-1;
            while(i<j){
            char temp=sb.charAt(i);
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