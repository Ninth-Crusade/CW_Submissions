public int[] makeMiddle(int[] nums) {
  int temp1 = nums[(nums.length/2)-1];
  int temp2 = nums[nums.length/2];
  
  int [] tempArr = {temp1, temp2};
  
  return tempArr;
}
