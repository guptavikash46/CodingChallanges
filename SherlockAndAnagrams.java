
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String s1 = "kkkk";
        StringBuffer sb = new StringBuffer();
        char[] newOne = s1.toCharArray();
        Map<String, Integer> substrings = new HashMap<>();
        int len = s1.length();
        List<String> list = new ArrayList<>();
        int iter = 0, p = 1;

        while(p != len){
            for(int j = iter; j< len; j++){
                
                sb.append(newOne[j]);
                if( sb.length() == p) {
                    substrings.put(sb.toString(), j);
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                    break;
                }
               // if(i == 1) substrings.put(String.valueOf(newOne[j]), j);   
            }
            iter += 1;
            if(iter == len) {
                iter = 0;
                p += 1;
            }
            // if (sb.length() != 0){
            //     sb.delete(0, sb.length());
            // } 
        }
        //for(Map.Entry<String, Integer> m : substrings.entrySet()) System.out.print(m.getKey()+" ");
        for(String s : list) System.out.print(s+" ");
    }
    

}
