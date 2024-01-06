    import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
	static boolean Armstrong(int n) {
		int temp=n,digit=0,last=0,sum=0;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=10;i<=n;i++) {
			if(Armstrong(i)) {
				System.out.println(i);
			}
		}

	}

}
