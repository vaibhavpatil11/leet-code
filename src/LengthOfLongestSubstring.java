import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static  int lengthOfLongestSubstring(String s) {

        Set<Character> characters = new HashSet<>();
        char s1[] = s.toCharArray();
        int i = 0;
        int j = 0;
        int max=0;
        while (j < s.length() ) {
            if (characters.contains(s1[j])) {
                characters.remove(s1[j]);
                i++;
                max = Math.max(characters.size(), max);
            } else {
                characters.add(s1[j]);
                j++;
            }


        }
        return max;
    }

    public static void main(String args[])
    {
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
}