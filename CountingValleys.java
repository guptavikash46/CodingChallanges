public class CountingValleys{

    public static void main(String[] args) {
        String a = "UDDDUDUU";
        String b = "DUDDDUUDUU";
        String[] steps = new String[b.length()];
        for(int i =0; i< b.length(); i++){
            steps[i] = String.valueOf(b.charAt(i));
        }
        int U =0, D = 0;
        int valley = 0, flag =0, anotherFlag = 0;
        for(int i =0;i< steps.length; i++){
            if(steps[i].equals("U")) U += 1;
            else D -= 1;
            int overall = U + D;
            System.out.println(overall);
            if (overall < 0 && anotherFlag == 0){
                flag = 1;
                anotherFlag = 1;
            }
            if(flag == 1 && D <= -1 && overall == 0){
                    valley += 1;
                        D = 0;
                        U = 0;
                        flag = 0;
                        anotherFlag = 0;
            }
        }
        System.out.println("Final: "+valley);
    }
}