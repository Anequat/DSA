class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,k=0,j,x=0; 
        for(i=0;i<nums.length;i++){
         for(j=i+1;j<nums.length;j++){
            if(nums[i] + nums[j] == target){ 
                x++ ;
      
            }
         }
        }
         int[] ssc = new int[x*2];
        for(i=0;i<nums.length;i++){
         for(j=i+1;j<nums.length;j++){
            if(nums[i] + nums[j] == target){ 
                ssc[k] = i ;
                k++ ;
                ssc[k] = j ;
                k++ ;
      
            }
         }
        }
        return ssc; 
    }
}