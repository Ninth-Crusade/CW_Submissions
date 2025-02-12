public int[] makeLast(int[] nums) {
  int [] copyArr = new int [nums.length*2];
  int temp1 = nums[nums.length-1];
  copyArr[copyArr.length-1] = temp1;
  
  return copyArr;
}
