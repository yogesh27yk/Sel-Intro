import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatatypesVariables {

	public static void main(String[] args) {
		
		
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'y';
		float dec = 5.99f;
		boolean myCard = true;
//		System.out.println(myNum+" is the variable stored in myNum variable");
//		System.out.println(dec);
		
//		int[] arr = new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=4;
//		arr[3]=5;
//		arr[4]=6;
//		System.out.println(arr[3]);
		
		int[] arr2 = {11,10,20,30,40,43,50};
//		System.out.println(arr2[2]);
		
		//
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//
		for(int i=0;i<arr2.length;i++) {
			
		
		if(arr2[i] % 2 == 0) {
			System.out.println(arr2[i]);
			break;
		}
		else {
			System.out.println(arr2[i]+" is not multiple of 2");
		}
		}
		//
//		String[] name = {"Rahul","Shetty","Academy"};
//		System.out.println(name[2]);
		//
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
		//
//		for(String s : name) {
//			System.out.println(s);
//		}
//		}
		  System.out.println("");
		  int[] numbers = {1,20,3,40,5};
	         System.out.println(numbers[0]);
	         System.out.println(numbers[4]);
	         System.out.println("");
	         //
	         for(int i=numbers.length-1;i>=0;i--){
	             
	             System.out.println(numbers[i]);
	         }
	         //
	         System.out.println("");
	         System.out.println(numbers.length);
	         //
	         ArrayList<String> a = new ArrayList<String>();
	         a.add("rahul");
	         a.add("shetty");
	         a.add("academy");
	         a.add("selenium");
	         System.out.println("");
	         System.out.println(a.get(3));
	         //
	         for(int i=0;i<a.size();i++) {
	        	 System.out.println(a.get(i));
	        	 
	         }
	         System.out.println("*****");
	         for(String val:a) {
	        	 
	        	 System.out.println(val);
	         }
	         System.out.println("");
	         System.out.println(a.contains("selenium"));
	         //
	         String[] name = {"Rahul","Shetty","Academy"};
	         List<String> asList = Arrays.asList(name);
	         System.out.println(asList.contains("Rahul"));
	         System.out.println("Work done by Dev");
	         System.out.println("Dev");
	         
	         
		
	}
			
}