import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RomanToInteger {


    static Map<String,Integer> dataSet = new LinkedHashMap<>();
    static {

        dataSet.put("I",1);
        dataSet.put("V",5);
        dataSet.put("X",10);
        dataSet.put("L",50);
        dataSet.put("C",100);
        dataSet.put("D",500);
        dataSet.put("M",1000);

    }

    public int romanToInt(String s) {

        int output = RomanToInteger.dataSet.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--)
        {
            if(RomanToInteger.dataSet.get(s.charAt(i))<RomanToInteger.dataSet.get(s.charAt(i+1)))
                output -= RomanToInteger.dataSet.get(s.charAt(i));
            else
                output += RomanToInteger.dataSet.get(s.charAt(i));
        }
        return output;

    }
    public static void main(String args[])
    {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("XXVII");
    }
}
