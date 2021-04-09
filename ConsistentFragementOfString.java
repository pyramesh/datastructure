import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ramesh.Yaleru on 4/9/2021
 */
public class ConsistentFragementOfString {

    public static void main(String[] args) {
        //String s = "50552";
        String s = "10101";
        List<Integer> number = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            number.add(Integer.valueOf(s.substring(i,i+2)));
            //System.out.println(number);
        }
       System.out.println(number.stream().max(Integer::compare).get());

    }
}
