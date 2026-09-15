class Solution {
    public int heightChecker(int[] heights) {
        //Arrays.sort(heights);
        int expected[] = new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
            
        }
        Arrays.sort(expected);
        // for(int i=0;i<heights.length;i++){
        //     System.out.print(heights[i]);
       
        // }
        // System.out.println();
        // for(int i=0;i<expected.length;i++){
        //     System.out.print(expected[i]);
       
        // }
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
                
            
        }
        return count;
    }
}