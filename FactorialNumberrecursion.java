import java.util.Scanner;

public class FactorialNumberrecursion {
	static int Factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*Factorial(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		fact=Factorial(n);
		System.out.print("The factorial of "+n+" is "+fact);
	}

}
