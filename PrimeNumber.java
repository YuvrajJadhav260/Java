import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0,flag=0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.print("Not a prime number");
		}
		for(int i=2;i<m;i++) {
			if(n%i==0) {
				System.out.print("Not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.print("This is a prime number");
		}
	}

}
