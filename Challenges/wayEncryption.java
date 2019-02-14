import java.util.*;
import java.io.*;

public class wayEncryption
{
	static Scanner sc = new Scanner(System.in);
	static int newVal1 = 0, newVal2 = 0, encryptedVal;
	static BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

		public static void main(String[] args)
	{
		while(true) {
			System.out.println("\n\nInput a number");
			int num = sc.nextInt();
			encrypt(num);
		}
	}//end of main
	
	//- shift digits 1 to the left
	public static void encrypt(int num)
	{		
		int val = 0;
		int read = 0;
		while(num != 0)
		{
			val = (num % 10) + 4;
			if (val > 9)
			{
				val -= 10;
			}//end of if
			num /= 10;
			
			System.out.print(val);
			read = Integer.parseInt(read + "" + val);

		}//end of while			
		
		System.out.println("\nEncrypted Number: " + shift(read));
	}//end of encrypt
	
	public static int shift(int num)
	{
		int shiftedNum = 0;
		
		return shiftedNum;
	}//end of shift
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
