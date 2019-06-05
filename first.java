import java.util.*;

public class first{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Boolean val = true;
        //sorting
        while (val){
            val = false;
            for (int i = 0; i< ar.length - 1; i++){
                if (ar[i] > ar[i + 1]){
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;

                    val = true;
                }
            }
        }
        int pair = 0;
        Boolean val2 = true;
        int posCheck = 0;
        while(val2){
           for(int j = posCheck, q = j+1; j< ar.length; j += 2, q += 2){
            try{
               if(ar[j] == ar[q]) {
                   pair += 1;
                }
               else{
                   posCheck = q;
                   break;
               }
            }
            catch(ArrayIndexOutOfBoundsException e){
                val2 = false;
                break;
            }
           }
        }
        System.out.println(pair);
    }   
}