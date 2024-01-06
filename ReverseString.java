import java.util.*;
public class ReverseString {
	public static void stringReverse(String str,int idx) {
		if(idx==0) {
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		stringReverse(str,idx-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		stringReverse(str,str.length()-1);
	}

}
