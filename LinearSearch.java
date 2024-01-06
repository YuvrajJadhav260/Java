import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.print(key+" is found at index "+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.print("Key is not found");
		}
	}

}
