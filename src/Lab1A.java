public class Lab1A {
    private String name;
    private int[] nums = {1,2,3};
    public Lab1A(String studentName){
        name = studentName;
    }

    public String getName(){
        return this.name;
    }

    public int[] getNums(){
        return this.nums;
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    
    
}

