public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length() - 1;
        if (j < 0) return 0;
        if (j > haystack.length() - 1) return -1;
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int k = 0; k <= haystack.length() - 1; k++) {
            for (int t = k; t <= haystack.length() - 1; t++) {
                if (haystackArray[t] == needleArray[i]) {

                    if (i == j) {
                        return t - j;
                    }
                    i++;
                } else {
                    i = 0;
                    break;

                }
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        // "bbbbababbbaabbba"//"abb"
        System.out.println(implementStrStr.strStr("mississip", "issip"));
        System.out.println(implementStrStr.strStr("bbbbababbbaabbba", "abb"));
        System.out.println(implementStrStr.strStr("a", "a"));
        System.out.println(implementStrStr.strStr("aaa", "a"));


    }
}
