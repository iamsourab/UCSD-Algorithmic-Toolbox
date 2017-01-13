package week2;

import java.util.Scanner;

public class FibonacciPartialSum {
	  private static long calc_fib(long n) {
		  n=(n+2)%60;
		 double x=Math.pow(1 + Math.sqrt(5),n);
		 double y=Math.pow(1 - Math.sqrt(5),n);
		 double z=Math.pow(2,n)*Math.sqrt(5);
		 long k=(long) ((x-y)/z);
		 return (long) k;
	  }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m=scanner.nextLong();
        long lastDig=calc_fib(m)-calc_fib(n-1);
        lastDig=lastDig%10;
        		
        System.out.println(lastDig);
    }
}
