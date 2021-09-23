class Driver {
  public static void main(String args [])
  {
    Example ex = new Example();
    if(args.length!=0){
      System.out.println("first arg:" + args[0]);
    }
    Lab1A lab1a = new Lab1A("Jack");
    int total=0;


    int[] nums = ex.getNums();
    for (int num : nums) {
      total+=num;
    }
    
    System.out.println(total);
    System.out.println(ex.sameName(lab1a.getName()));
    
  }
}

