import java.util.*;
public class FibinacciRecursion {
	public static void FibonacciCal(int n1,int n2,int count) {
		if(count==0) {
			return;
		}
		int n3=n1+n2;
		System.out.print(" "+n3);
		FibonacciCal(n2,n3,count-1);
	}
	public static void main(String[] args) {
		int n1=0,n2=1;
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		switch(count) {
		case 0:
			System.out.print("Enter valid input");
			break;
		case 1:
			System.out.print("1");
			break;
		default:
			System.out.print("==>"+n1+" "+n2);
			FibonacciCal(n1,n2,count-2);
		}
	}
	
}
