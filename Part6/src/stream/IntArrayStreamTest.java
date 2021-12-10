package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));	//is 한번 더 사용 불가.
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		
	}

}
