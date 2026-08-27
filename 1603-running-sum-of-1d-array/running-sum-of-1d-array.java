class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] = arr[i] + nums[j];
            }
            arr[i] = arr[i] + nums[i];
        }

        System.arraycopy(arr, 1, nums, 1, nums.length - 1);
 return nums;
    }
}