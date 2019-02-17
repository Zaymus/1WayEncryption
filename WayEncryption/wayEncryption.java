import java.util.*;

public class wayEncryption
{
	static Scanner sc = new Scanner(System.in);
	static int val = 0, read = 0, reversedNum = 0, temp1 = 0, shiftedNum = 0;
	public static void main(String[] args)
	{
		while(true) 
		{
			val = 0;
			read = 0;
			reversedNum = 0;
			temp1 = 0;
			shiftedNum = 0;
			System.out.println("\n\nInput a number");
			int num = sc.nextInt();
			encrypt(num);
		}//end of while
	}//end of main
	
	public static void encrypt(int num)
	{		
		while(num != 0)
		{
			val = (num % 10) + 4;
			if (val > 9)
			{
				val -= 10;
			}//end of if
			num /= 10;
			read = Integer.parseInt(read + "" + val);
		}//end of while			
		System.out.println("\nEncrypted Number: " + shift(reverse(read)));
	}//end of encrypt
	
	public static int reverse(int num)
	{
		while(num != 0)
		{
			val = num % 10;
			reversedNum = Integer.parseInt(reversedNum + "" + val);
			num /= 10;
		}//end of while
		return reversedNum;
	}//end of reverse

	public static int shift(int num)
	{
		temp1 = num % 10;
		num /= 10;
		shiftedNum = Integer.parseInt("" + temp1 + "" + num);
		return shiftedNum;
	}//end of shift
}//end of class