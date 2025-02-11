public int sum2(int[] nums) {
  if (nums.length == 0)
  {
    return 0;
  }
 
  else if (nums.length >= 2)
  {
    int temp1 = nums[0];
    int temp2 = nums[1];
    
    int sum = temp1 + temp2;
    
    return sum;
  }
  
  else if (nums.length < 2)
  {
    int temp1 = nums[0];
    
    return temp1;
  }
  
  return 0;
}
