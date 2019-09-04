import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GSchallenge{

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        long counter = 0;
        List<Integer> sortedVals = new ArrayList<>();
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        System.out.println(list);
        int listLen = list.size();
        if(listLen % 2 == 0){
            for(int i = 0; i < listLen - 1; i+=2){
                int a = list.get(i);
                int b = list.get(i + 1);
                if (a > b){
                    sortedVals.add(b);
                    sortedVals.add(a);
                }
                else{
                    sortedVals.add(a);
                    sortedVals.add(b);
                }
            }
        }
        else{
            int flag = 0;
            for(int i = 0; i< listLen; i += 2){
                if (i == listLen - 1) {
                    //System.out.println(list.get(i));
                    sortedVals.add(list.get(i));
                    //flag = 1;
                    break;

                }
                int a = list.get(i);
                int b = list.get(i + 1);
                if (a > b){
                    sortedVals.add(b);
                    sortedVals.add(a);
                    counter += 1;
                }
                else{
                    sortedVals.add(a);
                    sortedVals.add(b);
                }
            }
        }
        List<Integer> copy = new ArrayList<>();
         //Collections.sort(sortedVals);
        // for(int p = 0; p< listLen; p++){
        //     if(sortedVals.get(p) != list.get(p)){
        //         counter += 1;
        //     }
        // }
        Boolean check = true;
        System.out.println("before final sort "+ sortedVals);
        while(check){
            check =false;
            for(int p = 0; p< listLen - 1; p++){
                int vor = sortedVals.get(p);
                int nach = sortedVals.get(p + 1);
                if( vor > nach) {
                    check = true;
                    copy.add(nach);
                    copy.add(vor);
                    break;
                }
                copy.add(sortedVals.get(p));
            }
        }
        if(copy.size() != listLen) copy.add(sortedVals.get(listLen - 1));
        System.out.println(copy);
   // System.out.println(counter);

    }
}