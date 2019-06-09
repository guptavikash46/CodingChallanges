

public class JumpingClouds {

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
        int len = c.length;
        Boolean flag = true;
        int jump =0, valPluseTwo = 0;
        for(int i = 0; i< len; i++){
            if((i+1 > len -1)) break;
            int valPlusOne = c[i + 1];
            if(i + 2 > len -1){ 
                flag = false;
                valPluseTwo = 2;
            }
            else {
                valPluseTwo = c[i + 2];
            }
            if(flag){
                if( (valPlusOne == 0 && valPluseTwo == 0) || (valPlusOne == 1 && valPluseTwo == 0)){
                    jump += 1;
                    i += 1;
                    }
                if(valPlusOne == 0 && valPluseTwo == 1){
                    jump += 1;
                    }
                }
            
            if (valPlusOne == 0 && valPluseTwo == 2) jump += 1;
        }
        System.out.println("Total jumps: "+ jump);
    }
}