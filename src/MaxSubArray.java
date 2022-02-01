public class MaxSubArray {

    //Kadane's algorithm  : https://youtu.be/86CQq3pKSUw
    public int maxSubArray(int[] nums) {

        int totalSum = nums[0];
        int maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {

            totalSum = Math.max(nums[i], nums[i] + totalSum);
            if (totalSum > maxGlobal)
                maxGlobal = totalSum;
        }

        return maxGlobal;

    }
}
