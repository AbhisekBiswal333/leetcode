class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left=0;
        int maxi=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int right=0;right<n;right++){
            int currentcount=map.getOrDefault(fruits[right],0);
            map.put(fruits[right],currentcount+1);
            while(map.size()>2){
               int fruitcount =  map.get(fruits[left]);
               if(fruitcount==1){
                 map.remove(fruits[left]);
               }else{
                 map.put(fruits[left],fruitcount-1);
               }
               left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}