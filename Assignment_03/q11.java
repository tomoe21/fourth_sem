package generics2;
import java.util.*;
public class q11
{
	public static int missingNum(int[] nums) 
	{
		HashSet<Integer, Integer> em = new HashSet<>();
		for(int num: nums)
		{
			em.put(num,1);
		}
		for(int i = 1;i<=10;i++)
		{
			if(!em.containsKey(i)) {
				return i;
			}
		}
		return 11;
	}
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6,7,9};
		int sm = missingNum(nums);
		System.out.println(sm);
	}
}
