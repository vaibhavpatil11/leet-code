public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        int peekLoc = 0;
        int i = 0;
        boolean validMountain = false;
        if(arr.length < 3) return false;
        while (i+1 <= arr.length-1 && arr[i+1] > arr[i]) {
            i++;
            peekLoc = i;
        }
        if(peekLoc==0) return false;
        int j = arr.length - 1;
        while ( j != peekLoc && j!=0 && arr[j] < arr[j - 1] ) {
            j--;
            if (j == peekLoc) {
                validMountain = true;
            }

        }

        return validMountain;

    }

    public static void main(String args[])
    {
        ValidMountainArray validMountainArray=new ValidMountainArray();
       System.out.println(validMountainArray.validMountainArray(new int[]{0,3,2,1}));
    }
}
