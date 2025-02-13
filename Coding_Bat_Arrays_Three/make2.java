public int[] make2(int[] a, int[] b) {
  if (a.length == 0)
  {
    if (b.length > 2)
    {
      int bFirst = b[0];
      int bSecond = b[1];
      
      int [] bTemp = {bFirst, bSecond};
      
      return bTemp;
    }
    
    else
    {
      return b;
    }
  }
  
  else if (a.length > 2)
  {
    int aFirst = a[0];
    int aSecond = a[1];
    
    int [] aTemp = {aFirst, aSecond};
    
    return aTemp;
  }
  
  else if (a.length <= 1)
  {
    int temp1 = a[0];
    int temp2 = b[0];
    
    int [] tempArr = {temp1, temp2};
    
    return tempArr;
  }
  
  return a;
}
