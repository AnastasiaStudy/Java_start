package lesson1;

public class task2 {
    public static void main(String[] args) {
        //Дан массив nums =
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        int index = 0;
        int[] new_nums = new int[nums.length];
        for (int i = 0; i < new_nums.length; i++) {
            if(nums[i] != val){
                new_nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < new_nums.length; i++) {
            new_nums[index] = val;
            index++;
        }
        for (int item : new_nums) {
            System.out.printf("%d ", item);
        }
    }
}
