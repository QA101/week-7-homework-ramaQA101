import java.util.*;
public class PalindromeArray {

	public static void main(String[] args) {
		int size=0;
		
		Scanner input= new Scanner (System.in);
		System.out.println("Enter number of elements of an array:");
		size= input.nextInt();
		System.out.println("Enter "+size+" elements");
		
		int[] arr= new int[size];
		for (int i = 0; i < size; i++) {
		      System.out.printf("Enter int %s: ", i+1);
		      arr[i] = input.nextInt();
		    }
		if (isPalindrome(arr)) {
		      System.out.println("Array is a palindrome");
		    } else {
		      System.out.println("Array is not a palindrome");
		    }
	
		
		input.close();
		
		
	}
	
	
	public static boolean isPalindrome(int arr[])
	{
		for (int i = 0, j = arr.length-1; i < j; i++, j--) {
		      if (arr[i] != arr[j]) {
		        return false;
		      }
		    }
		    return true;
		
		
		
	}

}
