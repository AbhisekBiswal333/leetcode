class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        int n=s.length();
        Queue<Character> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;       
        }
         int index=0;
         while(!q.isEmpty()){
               char ch = q.remove();              
               if(freq[ch-'a']==1){
                return index;
               }
               index++;
            }
        return -1;
    }
}