package h2;

public class H2_main {
	public static void main(String[] args) {
		int n, digits,c;
		n=3456789;
		digits = 5678;
		int[] a = {0,0,0,0,0,0,0,0,0};
		c=n;
		digits=0;
		for (int i=0; i<=8; i++) {
			if(n>0) {
				c=n;
				c/=10;
				c*=10;
				a[8-i]=n-c;
				digits++;
				n/=10;	
			}
		}
	/*	for (int i=0; i<=8; i++) {
			System.out.println(a[i]);
		}
		System.out.println(digits); 
	}	*/
}
