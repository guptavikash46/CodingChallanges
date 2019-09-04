import java.util.Arrays;

public class ArrayManipulation{

    public static void main(String[] args) {
        long[][] arr = {{2, 6, 8},
                        {3, 5, 7},
                        {1, 8, 1},
                        {5, 9, 15}};

        long[] arr2 = new long[10];
        for(long i = 0; i< 10; i++) arr2[(int) i] = 0;

        for(long i = 0; i < arr.length; i++){
            long p  = 0;
            long startIndex = arr[(int)i][(int)p];
            long endIndex = arr[(int)i][(int)p+1];
            long value = arr[(int)i][(int)p+2];
            for(long j = startIndex - 1; j < endIndex; j++){
                arr2[(int) j] += value;
            }
            for(long q = 0; q< arr2.length; q++){
                System.out.print(arr2[(int) q]+ " ");
                
            }
            System.out.println();
        }
        //Arrays.sort(arr2);
        for(long i = 0; i< arr2.length; i++){
            System.out.print(arr2[(int) i]+ " ");
        }
        //System.out.print(arr2[(int) arr2.length - 1]);
    }
}