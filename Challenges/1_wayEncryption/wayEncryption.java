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
	
	//- shift digits 1 to the left
	public static void encrypt(int num)
	{		
		int val = 0;
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
		val = Integer.parseInt(System.read());
		
		System.out.println("Encrypted Number: " + shift(val));
	}//end of encrypt
	
	public static int shift(int num)
	{
		int shiftedNum = num;
		
		shiftedNum <<= 31; 
		System.out.println(num + " --> " + shiftedNum);
		return shiftednum;
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
