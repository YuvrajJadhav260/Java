
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,5,6,4,9};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}		
		}
		for(int el:a) {
			System.out.print(el+" ");
		}
	}

}
