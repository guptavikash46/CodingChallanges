import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HourGlass{

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                       {0, 1, 0, 0, 0, 0},
                       {1, 1, 1, 0, 0, 0},
                       {0, 0, 2, 4, 4, 0},
                       {0, 0, 0, 2, 0, 0},
                       {0, 0, 1, 2, 4, 0}};

        int sum = 0;
        List<Integer> sumList = new ArrayList<>();
        for(int i =0; i< arr.length - 2; i++){
            for(int j = 0; j< arr.length - 2; j++){
                sum += arr[i][j] + arr[i][j +1] + arr[i][j + 2];
                sum += arr[i+ 1][j + 1];
                sum += arr[i+ 2][j] + arr[i + 2][j +1] + arr[i + 2][j + 2];
                sumList.add(sum);
                sum = 0;
            }
        }
        int[] copy = new int[sumList.size()];
        for(int i = 0; i< copy.length ; i++){
            copy[i] = sumList.get(i);
        }
        Boolean flag = true;
        while(flag){
            flag = false;
         for(int p = 0;p < copy.length - 1; p++){
            if(copy[p] > copy[p + 1]){
                int temp = copy[p];
                copy[p] = copy[p + 1];
                copy[p + 1] = temp;
                flag = true;
            }
          }
        }
       System.out.println(copy[copy.length - 1]);
    }
}