public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0)
  {
    return a;
  }
  
  else if (a.length > 0 && b.length == 0)
  {
    int temp1 = a[0];
    
    int [] tempArr = {temp1};
    
    return tempArr;
  }
  
  else if (a.length == 0 && b.length > 0)
  {
    int temp1 = b[0];
    
    int [] tempArr = {temp1};
    
    return tempArr;
  }
  
  else
  {
    int temp1 = a[0];
    int temp2 = b[0];
    
    int [] tempArr = {temp1, temp2};
    
    return tempArr;
  }
  
}
