import java.util.*;

public class Colingcf implements iGCF {
	private int[] inputs;
	private int gcf;
	private Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		iGCF a = new Colingcf();
		a.logic();
	}
	public void logic()
	{
		getinput();
		algo();
		System.out.println("The GCF is " + gcf);
	}
	
	public void getinput()
	{
		System.out.print("Num of Inputs: ");
		int t = sc.nextInt();
		inputs = new int[t];
		for(int i=0;i<t;i++)
		{
			System.out.print("Input " + (i+1) + ": ");
			inputs[i]=sc.nextInt();
		}
		Arrays.sort(inputs);
	}
	
	public void algo()
	{
			for(int i = inputs[0]; i>0; i--)
			{
				boolean factor = true;
				for(int m:inputs)				//checking
				{
					if(m%i==0)
					{
						factor = true;
					}
					else
					{
						factor = false;
						break;
					}
				}
				if(factor)
				{
					gcf = i;
					break;
				}
			}
		
	}
	
}
