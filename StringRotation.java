public class StringRotation{

    public static void main(String[] args) {
        int[] arrCopy = {1, 2, 3, 4, 5};
        int arrLength = arrCopy.length;
        int temp = 0;
        int d =4;
        while(d > 0){
            temp = arrCopy[0];
        for(int i = 0; i< arrLength -1; i++){
            
            arrCopy[i] = arrCopy[i + 1];
        }
        arrCopy[arrLength -1] = temp;
        d -= 1;
        }
        for(int i = 0 ; i < arrCopy.length; i++){
            System.out.print (arrCopy[i]+" ");
        }
    }
}