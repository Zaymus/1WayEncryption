import java.util.*;

public class SumOfPairs
{
	static Scanner sc = new Scanner(System.in);
	int[] nums;
    int inputVal;
    
	public static void main(String[] args)
	{
        System.out.println("input size of list");
        nums = new int[sc.nextInt()];
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Input number for index: " + i);
            nums[i] = sc.nextInt();
        }//end of for
        System.out.println("input a value to find the values that add to inputted value");
        inputVal = sc.nextInt();
        findPairs(nums[], inputVal);
    }//end of main
    
    public static void findPairs(int[] a, int val)
    {
        int k = 0;
        for(int i = 0; i < a.length; i++)
        {
             if (a[i] + a[k] == val)
             {
                
             }//end of if
        }//end of for
    }//end of findPairs
}//end of class
