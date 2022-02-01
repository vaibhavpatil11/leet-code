public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length - 1 < 1) return strs[0];
        String result = "";
        int j = 1;
        for (int i = 0; i <= strs[0].length() - 1; i++) {

            String temp1 = longestCommonPrefix.getChar(strs[0], j);

            for (int k = 1; k <= strs.length - 1; k++) {

                String temp2 = longestCommonPrefix.getChar(strs[k], j);
                if (temp1.equals(temp2)) {
                    continue;
                } else {
                    return result;
                }
            }

            result += temp1;
            j++;

        }
        return result;
    }

    public static String getChar(String s, int index) {
        if (index <= s.length()) {
            return s.substring(index - 1, index);
        }
        return "";
    }

    public static void main(String args[]) {
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();

        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

}
