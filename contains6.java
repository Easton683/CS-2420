public class contains6 {
    public static void main(String[] args) {
        new contains6();
    }
    public contains6(){
        int [] numbers = {1,5,2,4};
        System.out.println(array6(numbers, 0));
    }
    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        }
        if (nums[index]==6) {
            return true;
        }
        return array6(nums, index+1);
    }
}
