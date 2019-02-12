import java.util.*;

public class wayEncryption
{
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true) {
			System.out.println("input a number");
			
			int num = sc.nextInt();
			
			encrypt(num);
		}
	}//end of main
	
	/*
		a function which takes an integer greater than 99999,
		
		- adds 4 to each digit,
		- shifts digits 1 to the left
		- If the digit is greater than 9 subtract 10
		
		no arrays, strings or chars
	*/
	public static void encrypt(int val)
	{
		int num = val;
		int length = 0;
		while(num > 0)
		{
			num /= 10;
			length++;
        }//end of while
        System.out.println("length: " + length);
	}//end of encrypt
}//end of class
