import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RepeatedString{
    public static void main(String[] args) {
        int j = 0;
        //int arrLen = (int) n;
        String s = "cfimaakj";
        long n = 554045874191L;
        long reference = 1000000000;
        
            System.out.println(n);

        List<String> newVal = new ArrayList<>();
        int originalArrLength = s.length(); 
        for(long i = 0; i< n; i++){
            newVal.add(String.valueOf(s.charAt(j)));
            j += 1;
            if( j == originalArrLength) j = 0;
        }
        for(String r : newVal){
            System.out.print(r);
        }
        System.out.println();
        long  countA = 0;
        Iterator<String> iterator = newVal.iterator();
        while(iterator.hasNext()){
            String val = iterator.next();
            if(val.equals("a")) countA += 1;
        }
        System.out.println("Total A: "+ countA);
    }
}