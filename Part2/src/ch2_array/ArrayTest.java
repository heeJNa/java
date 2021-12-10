package ch2_array;

public class ArrayTest {

	public static void main(String[] args) {

		//int[] number = {1,2,3};
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i<arr.length ; i++, num++) {
			arr[i]=num;
		}
		
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;  
		dArr[1] = 2.1; 
		dArr[2] = 3.1; 
		
		System.out.println(dArr[3]);	//3, 4 번째는 0이 들어가 있음.
		System.out.println(dArr[4]);
				
		double mtotal = 1;
		for(int i = 0; i< dArr.length; i++) {	
			mtotal *= dArr[i];
		}
				
		System.out.println(mtotal);

	}

}
