public boolean unlucky1(int[] nums) {
  if (nums.length < 2)
  {
    return false;
  }
  
  else if (nums[0] == 1 && nums[0+1] == 3)
  {
    return true;
  }
  
  else if (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)
  {
    return true;
  }
  
  else if (nums[0+1] == 1 && nums[0+2] == 3)
  {
    return true;
  }
  
  return false;
}
