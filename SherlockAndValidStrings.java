import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SherlockAndValidStrings {
    public static void main(String[] args) {
        String s = "abcdefghhgfedecba";
        Map<Integer, Integer> maps = new HashMap<>();
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] count = new int[alpha.length];
        for(int i = 0; i< s.length(); i++){
            int index = new String(alpha).indexOf(s.charAt(i));
            count[index] += 1;
        }
        int iter = 0;
        for(int j = 0; j < count.length; j++){
            if(count[j] == 0) continue;
            if(maps.get(count[j]) == null){
                maps.put(count[j], 1);
            }
            else{
                int val = maps.get(count[j]);
                val += 1;
                maps.put(count[j], val);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = maps.entrySet();
        
        int flag = 0;
        if(maps.size() == 2){
            for(Map.Entry<Integer, Integer> e: entries){
                if(e.getValue() == 1){
                    System.out.println("YES");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println("NO");
        }
        else{
            System.out.println("NO");
        } 
      
    }
}