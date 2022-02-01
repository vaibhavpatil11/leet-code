import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {


        int j = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[j] != nums[i]) {
                nums[j + 1] = nums[i];
                j = j + 1;

            }

        }

        return j + 1;
    }



    public static void main(String args[]) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{3, 2, 2, 3}));
    }


}
