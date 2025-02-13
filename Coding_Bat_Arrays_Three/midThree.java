public int[] midThree(int[] nums) {
  int mid = nums[(nums.length-1)/2];
  int midMore = nums[(nums.length-1)/(2)+(1)];
  int midLess = nums[(nums.length-1)/(2)-(1)];
  
  int tempArr[] = {midLess, mid, midMore};
  
  return tempArr;
}
