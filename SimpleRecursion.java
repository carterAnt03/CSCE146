/*
 * Carter Antley
 */
public class SimpleRecursion {

	
	public static void main(String[] args) {
		//countDown(5);
		System.out.println(factorial(5));
		System.out.println(gcd(5,10));
	}
	public static void countDown(int i) {
		if(i<0)
			return;//halting
		System.out.println(i);
		countDown(i-1);//recursive call
		//countDown(i--);
		//countDown(--i);
	}
	public static int factorial(int number)
	{
		if(number <= 0)//halting
			return 1;
		else
			return number * factorial(number-1);
	}
	public static int gcd(int a, int b)
	{
		if( b ==0)
			return a;
		else 
			return gcd(b, a%b);
	}
	public static int fibo(int number)
	{
		if( number == 1|| number == 2)
			return 1;
		else
			return fibo(number -1)+fibo(number-2);
	}
}
