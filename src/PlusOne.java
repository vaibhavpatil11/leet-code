import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int carry = 0;

        for (int i = digits.length-1 ; i >= 0; i--) {

            if (i == digits.length-1) {
                int sum = digits[i] + 1;
                int result = sum % 10;
                carry = sum / 10;
                digits[i] = result;
            } else if (carry > 0) {
                int sum = digits[i] + carry;
                int result = sum % 10;
                carry = sum / 10;
                digits[i] = result;

            }
        }

        if(carry>0)
        {
            int[] result=new int[digits.length+1];
            result[0]=carry;
            int j=0;
            for (int i = 1; i < result.length ; i++) {
                result[i]=digits[j];
                j++;
            }
            return  result;
        }

        return digits;

    }

    public static void main(String args[])
    {
        Arrays.stream(PlusOne.plusOne(new int[]{9})).forEach(i -> System.out.println(i));
    }
}
