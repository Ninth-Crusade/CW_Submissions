public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer)
  {
    if (temp >= 60 && temp <= 100)
    {
      return true;
    }
  }
  
  if (!isSummer)
  {
    if (temp >= 60 && temp <= 90)
    {
      return true;
    }
  }
  
  return false;
}
