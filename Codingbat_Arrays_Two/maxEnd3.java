public int[] maxEnd3(int[] nums) {
  if (nums[0] >= nums[2])
  {
    int temp1 = nums[0];
    int temp2 = nums[1];
    int temp3 = nums[2];
    
    temp1 = nums[0];
    temp2 = nums[0];
    temp3 = nums[0];
    
    int [] tempArr = {temp1, temp2, temp3};
    
    return tempArr;
  }
  
  else if (nums[0] <= nums[2])
  {
    int temp1 = nums[0];
    int temp2 = nums[1];
    int temp3 = nums[2];
    
    temp1 = nums[2];
    temp2 = nums[2];
    temp3 = nums[2];
    
    int [] tempArr = {temp1, temp2, temp3};
    
    return tempArr;
  }
  
  return nums;
}
