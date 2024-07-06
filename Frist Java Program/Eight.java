public class Eight {
    public static void main(String[] args) {
        int i;
        int [] nums ={10, 30, 44, 39};
        int sum = 0;

        for (i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
