package week2;

import java.util.*;

public class FibonacciHuge {
	private static long pisanoSeries(long n,long m)
	{
		long a=0;
		long[] arr=new long[(int) (10*m)];
		arr[0]=1;
		int i=2;
		arr[1]=1;
		long rem;
		while(true)
		{
			if(arr[i-1]==1 && arr[i-2]==0)
			{
				break;
			}
			arr[i]=arr[i-1]+arr[i-2];
			arr[i]=arr[i]%m;
			
			i++;
		}
		i--;
		rem=n%i;
		System.out.println("Rem "+rem+" fib "+calc_fib(rem,m)+" Pisano number "+i);
		return (calc_fib(rem,m)%m);
	}
	  private static long calc_fib(long n,long m) {
		  long a=1,b=1,c=0;
		  if(n==1 ||n==2)
		  {
			  return 1;
		  }	
		  else
		  {
			  for(int i=0;i<n-2;i++)
			  {
				  c=a+b;
				  b=a%m;
				  a=c%m;
			  }
			  return c%m;  
		  }

	  }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(pisanoSeries(n, m));
    }
}

