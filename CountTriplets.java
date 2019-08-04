import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTriplets{

    public static void main(String[] args) throws InterruptedException{
        List<Long> newArr = new ArrayList<>();
        long counter = 0, finalNumOfRedudentVal = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/vikas/Desktop/TripletsTestCases"));
            String[] nr = br.readLine().replaceAll("\\s+$", "").split(" ");
            int n = Integer.parseInt(nr[0]);
            int r = Integer.parseInt(nr[1]);
           
            List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            Integer[] copyArr = new Integer[arr.size()];

            for(int i = 0; i< arr.size(); i++) copyArr[i] = arr.get(i);
            
            
            System.out.print(solve(copyArr, r));
            // Collections.sort(newArr);

            // System.out.println(newArr);
            // long numOfTriplets = newArr.size() - 2;
            // for(long i: newArr){
            //     for(long j : arr){
            //         if(i == j) counter += 1;
            //     }
            //     if(counter > 1){
            //         System.out.println("No. of times: "+i+ " is: "+ counter);
            //         finalNumOfRedudentVal += counter;
            //     }
            //     counter = 0;
            // }
            // System.out.println("Total redundencies: "+finalNumOfRedudentVal);
            // System.out.println("total triplets: "+finalNumOfRedudentVal * numOfTriplets);

        }
        catch(FileNotFoundException e){
            System.out.println("Unable to read file.");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Input-Output exception.");
        }
    }
    
    static long solve(Integer[] arr, int r) {
		Map<Integer, List<Integer>> numberToIndices = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!numberToIndices.containsKey(arr[i])) {
				numberToIndices.put(arr[i], new ArrayList<>());
			}

			numberToIndices.get(arr[i]).add(i);
		}

		long result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % r != 0) {
				continue;
			}

			int firstNumber = arr[i] / r;

			if ((long) arr[i] * r > Integer.MAX_VALUE) {
				continue;
			}

			int lastNumber = arr[i] * r;

			result += (long) findBeforeCount(numberToIndices, firstNumber, i)
					* findAfterCount(numberToIndices, lastNumber, i);
		}
		return result;
	}

	static int findBeforeCount(Map<Integer, List<Integer>> numberToIndices, int number, int index) {
		if (!numberToIndices.containsKey(number)) {
			return 0;
		}

		List<Integer> indices = numberToIndices.get(number);
		int position = Collections.binarySearch(indices, index);
		if (position < 0) {
			position = -1 - position;
		}

		return position;
	}

	static int findAfterCount(Map<Integer, List<Integer>> numberToIndices, int number, int index) {
		if (!numberToIndices.containsKey(number)) {
			return 0;
		}

		List<Integer> indices = numberToIndices.get(number);
		int position = Collections.binarySearch(indices, index);
		if (position < 0) {
			position = -1 - position - 1;
		}

		return indices.size() - 1 - position;
	}

}