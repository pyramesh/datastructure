import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'shortestPalindrome' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int shortestPalindrome(String s) {
            
            StringBuffer sb = new StringBuffer(s); 
            sb.reverse(); 
            String revString = sb.toString();
            int stringLength =  s.length();

            int lcs = getLongestCommonSequence(s, revString , stringLength, stringLength);
            return stringLength-lcs;
    }
    static int getLongestCommonSequence( String str, String revStr, int r, int k ) { 
	        int L[][] = new int[k+1][k+1]; 
	        int i, j; 
	        for (i=0; i<=r; i++) { 
	            for (j=0; j<=k; j++) { 
	                if (i == 0 || j == 0) 
	                    L[i][j] = 0; 
	                else if (str.charAt(i-1) == revStr.charAt(j-1)) 
	                    L[i][j] = L[i-1][j-1] + 1; 
	                else
	                    L[i][j] = Integer.max(L[i-1][j], L[i][j-1]); 
	            } 
	        } 
	        return L[r][k]; 
	    }

}

public class Solution {
