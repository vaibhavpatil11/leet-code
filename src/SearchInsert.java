public class SearchInsert {

    public static int searchInsert(int[] nums, int target)
    {
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(nums[mid]==target) return mid;
                if(nums[mid]>target)
                {
                    high=mid-1;
                    ans=mid;
                }
                else
                {
                    low=mid+1;
                    ans=mid+1;
                }
            }
            return ans;

    }

    public static void main(String args[]) {
        System.out.println(SearchInsert.searchInsert(new int[]{1,3}, 0));
    }
}
