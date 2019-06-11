import java.lang.Math;
import java.util.Arrays;

public class NewYearChaos {
    public static void main(String[] args) {
        Boolean checkChaos = false;
        int indexDiff = 0;

        int[] arr = { 1, 2, 5, 3, 4, 7, 8, 6 };
        int len = arr.length;
        int[] copy = new int[len];
        for(int i =0; i< len; i++){
            int j = i+1;
            copy[i] = j;    
        }
        for (int j = 0; j < len; j++) {
            int alteredNumIndex = getIndex(arr, arr[j]);
            for(int i = 0; i< len; i++){
                if(copy[i] == arr[j]){
                    int indexOriginal = getIndex(copy, copy[i]);
                    indexDiff = alteredNumIndex - indexOriginal;
                    if (indexDiff < -2){
                        System.out.println("Too chaotic");
                        checkChaos = true;
                        break;
                    }
                }
            }
            if(checkChaos == true) break;
        }
        if(checkChaos != true){
            int totalChangeInTheQueue = getTotalChange(arr);
            System.out.println("Total: "+totalChangeInTheQueue);
        }
    }


    static int getTotalChange(int[] a){
        boolean check = true;
        int count = 0;
        while(check){
            check = false;
            for(int i = 0;i < a.length - 1; i++){
                if( a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    check = true;
                    count += 1;
                }
            }
        }
        return count;
    }

    static int getIndex(int[] a, int value){
        int flag = 0, returnVal = 0;
        for(int i = 0; i< a.length; i++){
            if(a[i] == value){
                flag = 1;
                returnVal = i;
                break;
            }
        }
        if(flag == 1)
            return returnVal;
        else
            return -1;
}
}