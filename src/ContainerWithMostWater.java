import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static int  maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int water = 0;
        while (i < j) {
            water = max(water, (j - i) * min(height[i], height[j]));
            if (height[i] < height[j])
                i += 1;
            else
                j -= 1;
        }
        return water;

    }

    public static  void main(String args[])
    {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}
