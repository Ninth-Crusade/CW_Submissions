public int maxTriple(int[] nums) {
  int tempFirst = nums[0];
  int tempMid = nums[(nums.length-1)/2];
  int tempLast = nums[nums.length-1];
  
  if (tempFirst > tempMid && tempFirst > tempLast)
  {
    return tempFirst;
  }
  
  else if (tempMid > tempFirst && tempMid > tempLast)
  {
    return tempMid;
  }
  
  else if (tempLast > tempFirst && tempLast > tempMid)
  {
    return tempLast;
  }
  
  return 0;
}
