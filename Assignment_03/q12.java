package generics2;
import java.util.*;
public class q12 
{
    public static void main(String[] args)
    {
    	int[] arr= {1,2,10,8,7,3,4,6,5,9};
    	PriorityQueue<Integer> minH = new PriorityQueue<>();
    	for(int num:arr)
    	{
    		minH.offer(num);
    	}
    	System.out.println("Sorted");
    	while(!minH.isEmpty()) {
    		System.out.println(minH.poll()+ " ");
    	}
    }
}
