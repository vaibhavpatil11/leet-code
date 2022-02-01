public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        if (s == null || s.length() < 1) return "";
        for (int k = 0; k < s.length(); k++) {
            int len1 = checkPalindrome(s, k, k);
            int len2 = checkPalindrome(s, k, k + 1);
            int len = Math.max(len1,
                    len2);
            if (len > end - start) {
                start = k - ((len - 1) / 2);
                end = k + ((len) / 2);
            }
        }

        return s.substring(start, end + 1);

    }

    private static int checkPalindrome(String s, int left, int right) {
        if (left > right) return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left- 1;
    }


    public static void main(String args[]) {
        System.out.println(LongestPalindrome.longestPalindrome("babad"));
    }
}
