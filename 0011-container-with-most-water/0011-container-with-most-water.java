class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxi=Integer.MIN_VALUE;
        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int weight=j-i;
            int area=ht*weight;
            maxi=Math.max(maxi,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxi;
    }
}