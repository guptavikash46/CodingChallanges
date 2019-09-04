import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChild{

    public static void main(String[] args) {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        int len = s1.length();
        int[][] lcs = new int[len + 1][len + 1];
        for(int i = 1; i<= len; i++){
            for(int j = 1; j <= len; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) lcs[i][j] = 1 + lcs[i - 1][j - 1];
                else {
                    int previousCol = lcs[i][j - 1];
                    int previousRow = lcs[i - 1][j];
                    if (previousCol > previousRow) lcs[i][j] = previousCol;
                    else lcs[i][j] = previousRow;
                }
            }
        }
        System.out.println("The max length is: "+ lcs[len][len]);
    }
}