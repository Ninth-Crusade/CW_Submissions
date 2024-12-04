public String doubleChar(String str) 
{
  String dupe = new String ("");
  for (int i = 0; i<str.length(); i++)
  {
    dupe += str.charAt(i);
    dupe += str.charAt(i);
  }
  
  return dupe;
}
