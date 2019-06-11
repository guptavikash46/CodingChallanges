import java.util.ArrayList;
import java.util.List;

public class NumberSystem{

    public static void main(String[] args) {
        int[] arr = {345320100, 56023, 2345890, 4290, 123560400};

        for(int i = 0; i< arr.length; i++){
            List<Integer> nums = new ArrayList<>();
            int val = arr[i];
            while(val != 0){
                nums.add(val % 10);
                val /= 10;
            }
            if( nums.size() > 6 && nums.size() < 10){
                if(nums.size() == 9)
                    System.out.println(nums.get(8)+""+nums.get(7)+""+ nums.get(6)+ " Millions");
                if(nums.size() == 8)
                    System.out.println(nums.get(6)+""+nums.get(5)+ " Millions");
                if(nums.size() == 7)
                    System.out.println(nums.get(6)+ " Millions");
            }
            if(nums.size() > 3 && nums.size() < 7){
                if(nums.size() == 6)
                    System.out.println(nums.get(5)+""+nums.get(4)+""+nums.get(3)+ " K");
                if(nums.size() == 5)
                    System.out.println(nums.get(4)+""+nums.get(3)+ " K");
                if(nums.size() == 4)
                    System.out.println(nums.get(3)+ " K");

            }
        }
    }
}