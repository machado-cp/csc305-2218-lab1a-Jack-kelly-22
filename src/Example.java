class Example
{
  private static int x;
  private String name;
  private int[] nums={1,2,3};

  boolean sameName(String other)
  {
    return other.equals(name);
  }

  public int[] getNums()
  {
    return nums;
  }

}  
