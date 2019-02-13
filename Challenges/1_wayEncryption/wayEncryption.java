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
	public static void encrypt(int num)
	{		
		while(num != 0)
		{
			newVal1 = (val % 10) + 4;
			if (newVal1 > 9)
			{
				newVal1 -= 10;
			}//end of if
			num /= 10;
			
			System.out.print(newVal1);
		}//end of while	
		System.out.println("\n");
	}//end of encrypt
	
	public static int getLength(int num)
	{
		int l = 0;
		while(num != 0)
		{
			num /= 10;
			l++;
		}//end of while
		return l;
	}//end of getLength
}//end of class
