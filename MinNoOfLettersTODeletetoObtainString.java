import java.util.HashSet;
import java.util.Set;

/**
 * @author Ramesh.Yaleru on 4/9/2021
 */
public class MinNoOfLettersTODeletetoObtainString {


    public static void main(String[] args) {
        System.out.println(method("eee"/*"aaaabbbb"*/));


    }

    static int method(String s) {
        int[] charCount = new int[26];
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }
        HashSet<Integer> intSet = new HashSet<>();
        int delCount = 0;
        for (int value : charCount) {
            while (value != 0 && intSet.contains(value)) {
                value--;
                delCount++;
            }
            intSet.add(value);
        }
        return delCount;
    }
}

