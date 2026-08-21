class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ;
        int n = nums2.length ;
        int[] arr = new int [m+n] ; 
        System.arraycopy(nums1,0,arr,0,m);
        System.arraycopy(nums2,0,arr,m,n) ;
        Arrays.sort(arr);
        if (arr.length%2 ==0 ) {
            int k = arr.length / 2 ;
           return (arr[k - 1] + arr[k]) / 2.0;
        }  if (arr.length%2 != 0){
            int s = arr.length/2 ;
           return arr[s] ;
        } return 0.0 ;
        
        
    } }
