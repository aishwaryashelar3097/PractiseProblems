import java.util.Arrays;
public class Binary {	
public static void main(String[] args)   
	{  
	int n;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=sc.nextInt();  
	//creates an array in the memory of length 10  
	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();  
	}  
	System.out.println("Array elements are: ");  
	// accessing array elements using the for loop  
	for (int i=0; i<n; i++)   
	{  
	System.out.println(array[i]);  
	}  
	 
	}  
	 {  
	        int arr[] = {8,2,4,1,10,6,12,2};  
	        int key = 4;  
	        int result = Array.binarySearch(arr,key);
	        if (result < 0)
	        System.out.println("Element is not found");
	        else
	        	System.out.println("Element is found");
	           