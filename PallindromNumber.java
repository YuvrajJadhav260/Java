import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.print("This is Pallindrome Number");
		}
		else{
			System.out.print("Not a Pallindromic number");
		}
	}

}
