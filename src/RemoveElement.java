import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)    //Condition for shifting operation
            {
                nums[k++]=nums[i];
            }
        }
        return k;
    }

    public static void main(String args[]) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println("  " + removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
