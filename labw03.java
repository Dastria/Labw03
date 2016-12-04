public class labw03 implements var07
{   
	public void logika(double d1, double d2, double d3) 
	{ 
		if(d1==d2 || d1==d3 || d2==d3)			
			System.out.println("1 - есть два равных числа"); 
		else
			System.out.println("0 - нет двух равных чисел");	
	} 

	
	public void massivy(double[] A) 
	{    
		int kolvo=0;
		for(int i=0; i<A.length; i++)
		{
			if(A[i]>A[i+1])
			{
				System.out.print(" " + A[i]);
				kolvo++;
			}		
		}
		System.out.println(" ");
		System.out.println(kolvo);	
	}
	
	
}