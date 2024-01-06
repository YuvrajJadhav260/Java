import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		int low=0;
		int high=a.length-1;
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		while(low<=high) {
			int mid=(high+low)/2;
			if(key==a[mid]) {
				System.out.print(key+" is found at index "+mid);
				break;
			}
			if(key<a[mid]) {
				high=mid-1;
			}
			if(key>a[mid]) {
				low=mid+1;
			}
		}
		while(high<low) {
			System.out.print("Key not found");
		}
		

	}

}
