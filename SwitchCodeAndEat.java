import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchCodeAndEat{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   
        int testCases  = sc.nextInt();

        while(testCases != 0){
        String[] DaysAndSlots = sc2.nextLine().split(" ");
        //String[] tokens = DaysAndSlots.split(" ");
        int days = Integer.parseInt(DaysAndSlots[0]);
        int slots = Integer.parseInt(DaysAndSlots[1]);
        String[][] slotsArr = new String[slots][slots];
        System.out.println(slotsArr.length +" "+days+" "+slots);
        testCases -= 1;
        sc.close();
        sc2.close();
       // bf.close();
        
        }
    }
}