
public class NamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j && i<(n-1)/2) || (i+j==n-1 && i<(n-1)/2) || (j==(n-1)/2 && i>=(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int k=0;k<n;k++) {
				if((k==0 && i!=n-1) || (i==n-1 && k!=0 && k!=n-1) || (k==n-1 && i!=n-1)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==2*j || i+(j*2)==(n-1)*2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1))|| (j==n-1 && i<(n-1)/2 && i!=0) || ((i*2)-j==n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if((j==0 && i>0) || (i==0 && j!=0 && j!=(n-1)) ||(j==n-1 && i!=0) ||(i==(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1)/2 || (j==0 && i>=(3*n)/4 && i!=n-1) || (i==(n-1) && j<(n-1)/2 && j!=0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
