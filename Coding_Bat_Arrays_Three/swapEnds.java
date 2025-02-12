public int[] swapEnds(int[] nums) {
  int temp1 = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp1;
  
  return nums;
  
}
