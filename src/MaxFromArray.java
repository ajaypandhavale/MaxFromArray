
import java.util.Scanner;

public class MaxFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of elements in a array");
		limit=sc.nextInt();
		
		int[] arr = new int[limit];
		
		
		System.out.println("enter the array elements");
		for(int i=0;i<limit;i++) {
			 arr[i] = sc.nextInt();
			 }
		
		System.out.println("array elements");
		int max=0;
		
		for(int i=0;i<limit;i++) {
			if (arr[i] > max) 
                max = arr[i]; 
        }
		
		
		System.out.println("max ="+max);
		
		

	}

}
