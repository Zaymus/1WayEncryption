import java.util.*;

public class wayEncryption
{
	
	static Scanner sc = new Scanner(System.in);
	static int newVal1 = 0, newVal2 = 0, encryptedVal;
		public static void main(String[] args)
	{
		while(true) {
			System.out.println("input a number");
			int num = sc.nextInt();
			System.out.print("\nEncrypted number: ");
			encrypt(num);
		}
	}//end of main

	/*		a function which takes an integer greater than 99999,
		
				- adds 4 to each digit,
				- shifts digits 1 to the left
				- If the digit is greater than 9 subtract 10
		
			no arrays, strings or chars		*/
	public static void encrypt(int val)
	{		
		while(val != 0)
		{
			newVal1 = (val % 10) + 4;
			if (newVal1 > 9)
			{
				newVal1 -= 10;
			}//end of if
			val /= 10;
			
			System.out.print(newVal1);
		}//end of while	
		System.out.println("\n");
	}//end of encrypt
}//end of class
