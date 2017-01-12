	package week2;
	import java.util.Scanner;

	public class Fibonacci {
	  private static long calc_fib(int n) {
		  int a=1,b=1,c=0;
		  if(n==1 ||n==2)
		  {
			  return 1;
		  }
		  else
		  {
			  for(int i=0;i<n-2;i++)
			  {
				  c=a+b;
				  b=a;
				  a=c;
			  }
			  return c;  
		  }

	  }

	  public static void main(String args[]) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

	    System.out.println(calc_fib(n));
	  }
	}
