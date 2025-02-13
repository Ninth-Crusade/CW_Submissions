public int[] frontPiece(int[] nums) {
  if (nums.length < 2)
  {
    return nums;
  }
  
  int temp1 = nums[0];
  int temp2 = nums[1];
  
  int [] tempArr = {temp1, temp2};
  
  return tempArr;
}
