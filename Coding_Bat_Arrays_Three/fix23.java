public int[] fix23(int[] nums) {
  if (nums[0] == 2 && nums[1] == 3)
  {
    int temp1 = nums[0];
    int temp2 = nums[1];
    int temp3 = nums[2];
    temp2 = 0;
    
    int [] tempArr = {temp1, temp2, temp3};
    
    return tempArr;
  }
  
  else if (nums[1] == 2 && nums[2] == 3)
  {
    int temp1 = nums[0];
    int temp2 = nums[1];
    int temp3 = nums[2];
    temp3 = 0;
    
    int [] tempArr = {temp1, temp2, temp3};
    
    return tempArr;
  }
  
  return nums;
}
