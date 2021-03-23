// Time O(n)
// Space: O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        // group bigger with less bigger
//        and smaller with less smaller, so that the balance in vales will still give higher, even when the smallest are taken
      if(nums.length % 2 != 0){
        return 0;
      }
      
      if(nums.length == 0 || nums == null)
        return 0;
      Arrays.sort(nums); // 
      int sum = 0;
      for(int i=0;i<nums.length;i += 2){
        sum += nums[i];
      }
      return sum;
    }
}
