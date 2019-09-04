import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FrequencyQueries{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        Map<Integer, Integer> mapObject = new HashMap<>();
        int val = 0;
        while(testCases != 0){
        int element = sc.nextInt();
        if(!mapObject.containsKey(element)){
            val = 0;
            val += 1;
            mapObject.put(element, val);
        }
        else{
            int availableVal = mapObject.get(element);
            System.out.println("value available :"+ availableVal);
            mapObject.put(element, ++availableVal);
        }
        System.out.println(mapObject);
        testCases -= 1;
        }
    
    }
        
}