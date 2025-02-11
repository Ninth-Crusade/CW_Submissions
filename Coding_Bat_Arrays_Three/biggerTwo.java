public int[] biggerTwo(int[] a, int[] b) {
  int a1 = a[0];
  int a2 = a[1];
  int b1 = b[0];
  int b2 = b[1];
  
  int sum1 = a1 + a2;
  int sum2 = b1 + b2;
  
  if (sum1 > sum2)
  {
    return a;
  }
  
  else if (sum1 < sum2)
  {
    return b; 
  }
  
  else if (sum1 == sum2)
  {
    return a;
  }
  
  return a;
}
