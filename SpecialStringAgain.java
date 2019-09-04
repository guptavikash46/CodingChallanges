import java.util.List;
import java.util.ArrayList;

public class SpecialStringAgain{

    public static void main(String[] args) {
        String s = "abcbaba";   
        List<String> list = new ArrayList<>();
        int iter = 0, q = 1;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< s.length(); i++){
            for(int j = 0; j< s.length() - iter; j++){
                for(int p = j; p < j + q; p++){
                    sb.append(String.valueOf(s.charAt(p)));
                }
                list.add(sb.toString());
                sb = new StringBuffer();
            }
            iter += 1;
            q += 1;
        }
        System.out.println(list);
        int counter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).length() < 2) counter += 1;
            else{
                String st = new StringBuilder(list.get(i)).reverse().toString();
                System.out.print(st + ", ");
                if(st.equals(list.get(i))){
                    int len = st.length();
                    if(len % 2 != 0) {  //aabaa
                    int midpoint = (len/2);
                    String partOne = st.substring(0, midpoint);
                    String partTwo = st.substring(midpoint + 1, len);
                    if (partOne.equals(partTwo)) counter += 1;                    
                    }
                    else{
                    int midpoint = (len/2); //radara
                    String partOne = st.substring(0, midpoint);
                    String partTwo = st.substring(midpoint, len);
                    if (partOne.equals(partTwo)) counter += 1;                         
                    }
                }
            }
        }
        System.out.println(counter);
    }
}