/**
 * @author Ramesh.Yaleru on 4/9/2021
 */
public class MinCostOfDevideChain {

    public static void main(String[] args) {

        /* Print min operation required */
        int[] numers ={5,2,4,6,3,7};
        System.out.println("Minimum Operation = " +maxChainLength(numers));
    }

    static int maxChainLength(int[] arr) {
        int arraySum, smallest;
        int arrSize = arr.length;
        arraySum = 0;
        smallest = arr[0];
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            arraySum += arr[i];
        }
        int min = arraySum - arrSize * smallest;
        return min/3;
    }
}
