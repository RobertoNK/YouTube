import java.util.Arrays;

public class Hello_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals()
		//Arrays.equals()
		//Arrrays.compare()
		//Arrays.mismatch()
		
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = arr1;
		int [] arr3 = {7,8,9};
		int [] arr4 = {1,2,3};
		int [] arr5 = {1,2,3,4,5};
		System.out.println("equals(): "+ arr1.equals(arr5));
		System.out.println("equals(): "+ Arrays.equals(arr1, arr5));
		System.out.println("compare (): "+ Arrays.compare(arr1,arr5));
		System.out.println("compare(): "+ Arrays.compare(arr3,arr1));
		System.out.println("mismatch(): "+Arrays.mismatch(arr1,arr4));
		System.out.println("mismatch(): "+Arrays.mismatch(arr1,arr5));
		
		
		
		

	}

}
