public int[] reverse3(int[] nums) {
  int temp1 = nums[0];
  int temp2 = nums[1];
  int temp3 = nums[2];
  
  temp1 = nums[2];
  temp2 = nums[1];
  temp3 = nums[0];
  
  int [] tempArr = {temp1, temp2, temp3};
  
  return tempArr;
}
